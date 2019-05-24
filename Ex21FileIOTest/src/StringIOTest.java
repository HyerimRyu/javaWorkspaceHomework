import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class StringIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ڿ�!! ä��!!!
		
		//���ڿ� �����͸� �� �� �� �Ǵ� �� �ܾ �аų� ������?! Ư��, ������..
		//���� ����Ʈ��Ʈ�� ����� InputStream�� �� ����Ʈ�� �о������ �ľ��ϱ� �����
		//�׷��� �� �� ���ϰ� ���ڿ� ������ �������� IO�� �����ϱ� ���� 
		//���� ��Ʈ�� ����� ���.(Reader, Writer)
		
		
		//����� �Է��� �޾� �� �����͸� ���Ͽ� ���������� �����ϴ�(�����X) ���α׷�
//		
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �ܾ� �Է�(no�� �Է��ϸ� ����): ");
			String str=scanner.next();
			
			if(str.equalsIgnoreCase("no")) { //��ҹ��� �������! 
				System.out.println("�Է��� ����˴ϴ�.");
				break;
			}
			
			
			//������� �ʾҴٸ� ���Ͽ� ����..
			//��ǥ��ġ : "����������Ʈ/files/data.txt"
			File path=new File("files");
			if( !path.exists() ) path.mkdirs();
			
			
			//���+���ϸ�.Ȯ����: ������ ��ü���
			File file=new File(path, "data.txt");
			
			//���ϰ� ������ ��Ʈ��(���ڽ�Ʈ��)
			//�� �����͸� ���������� �������� ���� ��Ʈ��(OutputStream-->Writer)
			//�ڹٹ����� data.txt���� ���̿� ��Ʈ�� �����(FileWriter)��ü����
			try {
				FileWriter filewriter=new FileWriter(file, true); //append���
//				filewriter.write(str); //������ ������ �ܾ���̳� Ư��format���� �����Ű�°� �����
//				filewriter.flush();
//				filewriter.close();
				
				//FileWriter�� �ٷ� ����ϱ⺸�� �� �� �ͼ��� ������� �����Ű�� ����. 
				//��, �ܼ�â ����ϵ���(Println) ��ġ System.out.print()�̷��� ������
				//�� �� �ֵ��� ������Ʈ�� Ŭ���� �־�! 
				PrintWriter writer=new PrintWriter(filewriter);
				writer.println( str);
				writer.flush();
				writer.close(); //�ڵ����� FileWriter�� close()��.
				
				
			} catch (IOException e) {
				System.out.println("���Ͼ��� ����!! ");
			}
			
		}//while��
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("����� ������ �����͵��� ȭ�鿡 ����մϴ�.");
		System.out.println("-------------------------------------------");
		System.out.println();
		
		
		//�� �ٿ� �� �ܾ �����Ƿ� �о���� �ܾ ArrayList�� �߰���Ű�� 
		ArrayList<String> datas=new ArrayList<String>();
		
		File file=new File("files/data.txt");
		//�о�� ���ϰ� ��Ʈ�� �����۾� ����! 
		try {
			FileReader fr=new FileReader(file);
			
//			int a = fr.read(); //�� ���ھ� �б�: ����� 1����Ʈ, �ѱ��̸� 2~3byte�� �о���. ���� �˾Ƽ� ����Ʈ �� ����
//			
//			System.out.println(a);
			//�� ����� �ݺ��� �ʿ�; �� �������� ���ݾ�. -->����! �ٹٲ�, �������� ��� �о���̱� ������
			
			//�׷��� �о���� �� ���ϰ� �������� ��Ʈ�� class�־�. 
			//�� �� ���� ���� ���Ǵ� BufferedReader�� ���! 
			BufferedReader reader = new BufferedReader(fr);
			//�� �� �� �о�鿩..
			String line=reader.readLine(); //�� ���ڰ� �ƴ� ���ٷ� �о�鿩. ���Ͱ� �� ������
			while(line!=null) {//��� �о�
				//�о�� �����͸� ArrayList�� �߰�
				datas.add(line);
				
				line=reader.readLine();//������ �о����
			}
			
			System.out.println("���� �б� ����!!");
			
			//ArrayList�� �߰��� �����͸� ���ʷ� ȭ�鿡 ����ϱ�!!
			for(int i=0; i<datas.size(); i++) {
				System.out.println(i + ":" + datas.get(i));
			}
			
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("���� �б� ����!");
		}
		
		
		

	}//main method

}
