import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerCode {

	public static void main(String[] args) {
		
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress());
			System.out.println(InetAddress.getLocalHost().getHostName());
			System.out.println(InetAddress.getLoopbackAddress().toString());
		} catch (UnknownHostException e) {
					
		}
				
			
		try {
			ServerSocket serverSocket=new ServerSocket(10001);
			System.out.println("서버소켓이 생성되었습니다.");
					
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket= serverSocket.accept(); //여기서 커서(스레드)가 대기 
			System.out.println(socket.getInetAddress().getHostAddress()+ "클라이언트가 접속하셨습니다.");
					
					
			InputStream is=socket.getInputStream(); //바이트 스트림
			InputStreamReader isr=new InputStreamReader(is);//문자 스트림
			BufferedReader reader=new BufferedReader(isr);//보조 문자 스트림
					
					
			String msg = reader.readLine(); //클라이언트가 데이터를 보내면 한 줄씩 읽기..여기서 클라이언트가 데이터를 보낼때까지 대기
					
			System.out.println("받은 데이터 : " + msg);
					
			reader.close();
					
					
					
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //0~65535 중 하나 
				

	}

}
