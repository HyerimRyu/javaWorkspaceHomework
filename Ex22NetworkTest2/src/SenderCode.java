import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SenderCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				try {
					DatagramSocket socket=new DatagramSocket(); //������ ���� ���� ��Ʈ��ȣ �Ƚᵵ ��.  
					
					Scanner scanner=new Scanner(System.in);
					System.out.println("���� ������ : ");
					String msg=scanner.nextLine();
					
					InetAddress addr=InetAddress.getByName("192.168.0.209");
					DatagramPacket packet=new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003);
					
				
					socket.send(packet);
					
					System.out.println("���� �Ϸ�!!!");
					
					
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
