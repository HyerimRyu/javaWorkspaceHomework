import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//우편보낼 우체통 만들기
		try {
			DatagramSocket socket=new DatagramSocket(); //보내는 쪽은 굳이 포트번호 안써도 됨.  
			
			//보낼 데이터
			Scanner scanner=new Scanner(System.in);
			System.out.println("보낼 데이터 : ");
			String msg=scanner.nextLine();
			
			//데이터(msg)를 우편으로 보내기 위해 우편상자(DatagramPacket)에 동봉. 그리고 그 상자에 받는 사람 주소(IP주소, 포트번호)를 작성
			InetAddress addr=InetAddress.getByName("192.168.0.209");
			DatagramPacket packet=new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003);
			
			//우편박스 만들었으면 우체통을 통해 전송!! 
			socket.send(packet);
			
			System.out.println("전송 완료!!!");
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		

	}

}
