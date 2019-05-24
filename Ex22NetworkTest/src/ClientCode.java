import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientCode {

	public static void main(String[] args) {
		
		String serverIP="192.168.0.224";
				
		try {
					
			Socket socket = new Socket(serverIP,55555);
			System.out.println("서버와 연결이 되었습니다.");
					
			OutputStream os=socket.getOutputStream();//바이트 스트림
			PrintWriter writer=new PrintWriter(os); //문자 보조 스트림
					
			System.out.println("스트림 연결작업 성공!!.. 데이터 전송 가능상태");
					
					
			Scanner scanner = new Scanner(System.in);
			System.out.print("보낼 메세지 입력 : ");
			String msg = scanner.nextLine(); //띄어쓰기 노노 엔터칠 때 마다 
					
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
