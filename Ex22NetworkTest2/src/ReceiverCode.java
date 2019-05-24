import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DatagramSocket socket= new DatagramSocket(10003);
			
			byte[] buf=new byte[100];
			DatagramPacket packet=new DatagramPacket(buf, buf.length);
			
			System.out.println("메세지를 기다립니다.");
			socket.receive(packet); //메세지를 받아서 packet안의 buf에 넣어줌, 메세지를 받을때까지 대기 read..같은 애
			
			String s=new String(buf);
			System.out.println("받은 메세지 : " + s);
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
