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
			System.out.println("������ ������ �Ǿ����ϴ�.");
					
			OutputStream os=socket.getOutputStream();//����Ʈ ��Ʈ��
			PrintWriter writer=new PrintWriter(os); //���� ���� ��Ʈ��
					
			System.out.println("��Ʈ�� �����۾� ����!!.. ������ ���� ���ɻ���");
					
					
			Scanner scanner = new Scanner(System.in);
			System.out.print("���� �޼��� �Է� : ");
			String msg = scanner.nextLine(); //���� ��� ����ĥ �� ���� 
					
			writer.println(msg); 
			writer.flush();
			writer.close();
					
			System.out.println("�޼��� ������ �Ϸ�Ǿ����ϴ�.");
					
					
			
		} catch (UnknownHostException e) {
			System.out.println("������ ��ġ�� ã�� �� ����");
				
		} catch (IOException e) {
			System.out.println("������ ����� �Ұ��մϴ�.");
				
		}
				

	}

}
