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
			
			System.out.println("�޼����� ��ٸ��ϴ�.");
			socket.receive(packet); //�޼����� �޾Ƽ� packet���� buf�� �־���, �޼����� ���������� ��� read..���� ��
			
			String s=new String(buf);
			System.out.println("���� �޼��� : " + s);
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
