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
			System.out.println("���������� �����Ǿ����ϴ�.");
					
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket= serverSocket.accept(); //���⼭ Ŀ��(������)�� ��� 
			System.out.println(socket.getInetAddress().getHostAddress()+ "Ŭ���̾�Ʈ�� �����ϼ̽��ϴ�.");
					
					
			InputStream is=socket.getInputStream(); //����Ʈ ��Ʈ��
			InputStreamReader isr=new InputStreamReader(is);//���� ��Ʈ��
			BufferedReader reader=new BufferedReader(isr);//���� ���� ��Ʈ��
					
					
			String msg = reader.readLine(); //Ŭ���̾�Ʈ�� �����͸� ������ �� �پ� �б�..���⼭ Ŭ���̾�Ʈ�� �����͸� ���������� ���
					
			System.out.println("���� ������ : " + msg);
					
			reader.close();
					
					
					
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //0~65535 �� �ϳ� 
				

	}

}
