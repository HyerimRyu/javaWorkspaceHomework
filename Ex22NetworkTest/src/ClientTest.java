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
		
		//Ŭ���̾�Ʈ�� ������ IP�ּ�, port��ȣ�� �˾ƾ� ������ �� ����.
		
		String serverIP="192.168.0.224";
		//serverIP="127.0.0.1" //OK getLoopbackAddress
		//serverIP="localhost"; //OK
		
		//Ŭ���̾�Ʈ�� �۾�
		
		try {
			//1. ������ �����ϴ� Socket����(IP�ּ�, ��Ʈ��ȣ)
			Socket socket = new Socket(serverIP,55555);
			System.out.println("������ ������ �Ǿ����ϴ�.");
			
			
			//2.�����͸� �ְ�޴� Stream�����
			//�����͸� �������� Stream : ���Ӵ�(socket)���� �������ε�(stream)������! 
			OutputStream os=socket.getOutputStream();//����Ʈ ��Ʈ��
			//������Ʈ���� �̿��ϸ� write()�۾��� ���� ������.
			//OutputStreamWriter osw=new OutputStreamWriter(os); //���ڽ�Ʈ��
			PrintWriter writer=new PrintWriter(os); //���� ���� ��Ʈ��
			
			System.out.println("��Ʈ�� �����۾� ����!!.. ������ ���� ���ɻ���");
			
			//���� ������ Ű����� �Է¹ޱ�
			Scanner scanner = new Scanner(System.in);
			System.out.print("���� �޼��� �Է� : ");
			String msg = scanner.nextLine(); //���� ��� ����ĥ �� ���� 
			
			//��Ʈ���� ���ؼ� ������ ����!
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
