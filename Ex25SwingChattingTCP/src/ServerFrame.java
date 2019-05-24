import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerFrame extends JFrame{
	
	JTextArea textArea; //멤버 참조변수
	JTextField tfMsg;
	JButton btnSend;
	
	ServerSocket serverSocket;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	
	
	//생성자 메소드 
	public ServerFrame() {
		// TODO Auto-generated constructor stub
		setTitle("Server");
		setBounds(450, 50, 500, 350);

		
		textArea=new JTextArea();
		textArea.setEditable(false); //텍스트 쓰기 금지!! 보여주는 용도로만 쓸꺼야!!
		JScrollPane scrollPane=new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel msgPanel=new JPanel();
		msgPanel.setLayout(new BorderLayout());
		
		tfMsg=new JTextField();
		btnSend=new JButton("send");
		
		msgPanel.add(tfMsg, BorderLayout.CENTER);
		msgPanel.add(btnSend, BorderLayout.EAST);
		
		add(msgPanel, BorderLayout.SOUTH);
		
		//Send버튼 클릭에 반응하는 리스너 추가
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sendMessage();
			}
		});
		
		//엔터키를 눌렀을 때 반응하기!!
		tfMsg.addKeyListener(new KeyAdapter() {
			//키보드에서 키 하나를 눌렀을 때 자동으로 실행되는 메소드: 콜백메소드
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				
				//입력받은 키가 엔터인지 알아보기
				//파라미터로 전달된 KeyEvent객체가 키에 대한 정보를 가지고 있음
				int keyCode = e.getKeyCode();
				
				switch(keyCode) {
				case KeyEvent.VK_ENTER: 
					sendMessage();
					break;
				
				}
			}
		});
		
		
		setVisible(true);
		tfMsg.requestFocus();
		
		
		//상대방이 접속할 수 있도록 서버소켓을 만들고 통신할 수 있도록 준비작업
		//네트워크 작업을 Main Thread(원래 존재하는 스레드)가 하게하면 다른 작업(키보드입력, 클릭 등)들은 전혀 할 수 없음. 프로그램이 멈춤
		//그래서 Main은 UI 작업에 전념하도록 하고, 
		//다른 작업들은 (오래 걸리는) 별도의 스레드에게 위임하는 것이 적절함
		ServerThread serverThread=new ServerThread();
		serverThread.setDaemon(true); //메인끄면 같이 죽어 
		serverThread.start();
		
	addWindowListener( new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				
				try {
					if(dos!=null)dos.close();
					if(dis!=null)dis.close();
					if(socket!=null)socket.close();
					if(serverSocket!=null)serverSocket.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
	}//생성자 메소드
	
	
	//이너클래스 
	//서버소켓을 생성하고 클라이언트의 연결을 대기하며.. 
	//연결이 되었을 때 메세지를 지속적으로 받는 역할 수행 
	
	class ServerThread extends Thread{
		@Override
		public void run() {
			
			//서버소켓 생성
			try {
				serverSocket=new ServerSocket(10001);
				textArea.append("서버소켓이 준비되었습니다...\n");
				textArea.append("클라이언트의 접속을 기다립니다...\n");
				socket=serverSocket.accept(); //클라이언트가 접속할 때까지 커서(Thread)가 대기 
				textArea.append(socket.getInetAddress() + ("님이 접속하셨습니다...\n")); 
				
				
				
				//통신을 위한 스트림 생성
				dis=new DataInputStream(socket.getInputStream());
				dos=new DataOutputStream(socket.getOutputStream());
				
				
				while(true) { // 상대가 쓴거 계속 찍어야 하잖아. while없으면 한 번 만 찍고 끝! 
					
					//상대방이 보내온 데이터 읽기
					String msg=dis.readUTF(); //상대방이 보낼때까지 대기 
					textArea.append("[Client] : "+ msg+ "\n");
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				textArea.append("클라이언트가 나갔습니다.");
			}
		}
	}
	
	
	//메세지를 전송하는 기능메소드 - Send버튼을 눌렀을 때 할 작업
	void sendMessage() {
		//TextField에 써 있는 글씨를 얻어오기
		String msg=tfMsg.getText();
		tfMsg.setText(""); //쓴 글씨 지워주기 remove, clear아니고 ""
		
		//1.TextArea(채팅창)에 표시  set은 덮어쓰기라 안돼, append 로 추가하면서 기존것도 보여줘 
		textArea.append("[Server] : "+msg+"\n");
		textArea.setCaretPosition(textArea.getText().length());
		
		
		//2.상대방(Client)에게 메세지(위에서 얻어온 글씨)를 전송
		Thread t=new Thread() {
			@Override
			public void run() {
				try {
					dos.writeUTF(msg);
					dos.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		
		t.start();
	}
	
	
}//ServerFrame class
