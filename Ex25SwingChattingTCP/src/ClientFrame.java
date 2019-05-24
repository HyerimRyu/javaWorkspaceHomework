import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientFrame extends JFrame{
	
	JTextArea textArea; //멤버 참조변수
	JTextField tfMsg;
	JButton btnSend;
	
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	
	public ClientFrame() {
		// TODO Auto-generated constructor stub
		
		setTitle("Client");
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
		
		
		
		
		//서버와 연결하는 네트워크 작업 스레드 객체 생성 및 실행
		ClientThread clientThread=new ClientThread();
		clientThread.setDaemon(true);
		clientThread.start();
		
		
		//클라이언트 프레임에 window(창)관련 리스너 등록 추가
		addWindowListener( new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				
				try {
					if(dos!=null)dos.close();
					if(dis!=null)dis.close();
					if(socket!=null)socket.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
	}//생성자 메소드
	
	//이너클래스
	
	//서버와 연결하는 네트워크 작업 스레드
	class ClientThread extends Thread{
		@Override
		public void run() {
			try {
				socket=new Socket("192.168.0.224", 10001);
				textArea.append("서버에 접속되었습니다.");
				
				//데이터 전송을 위한 스트림 생성(입출력 모두)
				InputStream is=socket.getInputStream();
				OutputStream os=socket.getOutputStream();
				
				
				//보조 스트림으로 만들어서 데이터 전송작업을 편하게
				dis=new DataInputStream(is);
				dos=new DataOutputStream(os);
				
				
				while(true) {
					//상대방 데이터 입력받기
					String msg=dis.readUTF();
					textArea.append("[SERVER] : "+ msg+ "\n");
					textArea.setCaretPosition(textArea.getText().length());
				}
			
				
				
			} catch (UnknownHostException e) {
				textArea.append("서버 주소가 이상합니다.\n");
				
			} catch (IOException e) {
				textArea.append("서버와 연결이 끊어졌습니다.\n");
				
			}
		}
	}
	
	
	//메세지를 전송하는 기능메소드 - Send버튼을 눌렀을 때 할 작업
		void sendMessage() {
			//TextField에 써 있는 글씨를 얻어오기
			String msg=tfMsg.getText();
			tfMsg.setText(""); //쓴 글씨 지워주기 remove, clear아니고 ""
			
			//1.TextArea(채팅창)에 표시  set은 덮어쓰기라 안돼, append 로 추가하면서 기존것도 보여줘 
			textArea.append("[Client] : "+msg+"\n");
			textArea.setCaretPosition(textArea.getText().length());
			
			//2.상대방(Server)에게 메세지(위에서 얻어온 글씨)를 전송
			//아웃풋 스트림을 통해 상대방에 데이터 전송
			//네트워크작업은 별도의 Thread가 하는 것이 적합
			
			Thread t=new Thread() {
				@Override
				public void run() {
					
					try {
						dos.writeUTF(msg); //한글도 깨지지 않게 하기위해서 
						dos.flush();
				
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.start();
			
			
		}

}//ClientFrame
