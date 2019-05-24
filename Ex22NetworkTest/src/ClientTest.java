import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클라이언트는 서버의 IP주소, port번호를 알아야 접속할 수 있음.
		
		String serverIP="192.168.0.224";
		//serverIP="127.0.0.1" //OK getLoopbackAddress
		//serverIP="localhost"; //OK
		
		//클라이언트의 작업
		
		try {
			//1. 서버와 연결하는 Socket생성(IP주소, 포트번호)
			Socket socket = new Socket(serverIP,55555);
			System.out.println("서버와 연결이 되었습니다.");
			
			
			//2.데이터를 주고받는 Stream만들기
			//데이터를 내보내는 Stream : 해임달(socket)에게 무지개로드(stream)열어줘! 
			OutputStream os=socket.getOutputStream();//바이트 스트림
			//보조스트림을 이용하면 write()작업이 보다 수월함.
			//OutputStreamWriter osw=new OutputStreamWriter(os); //문자스트림
			PrintWriter writer=new PrintWriter(os); //문자 보조 스트림
			
			System.out.println("스트림 연결작업 성공!!.. 데이터 전송 가능상태");
			
			//보낼 데이터 키보드로 입력받기
			Scanner scanner = new Scanner(System.in);
			System.out.print("보낼 메세지 입력 : ");
			String msg = scanner.nextLine(); //띄어쓰기 노노 엔터칠 때 마다 
			
			//스트림을 통해서 데이터 전송!
			writer.println(msg); 
			writer.flush();
			writer.close();
			
			System.out.println("메세지 전송이 완료되었습니다.");
			
			
		} catch (UnknownHostException e) {
			System.out.println("서버의 위치를 찾을 수 없음");
		
		} catch (IOException e) {
			System.out.println("서버와 통신이 불가합니다.");
		
		}
		

	}

}
