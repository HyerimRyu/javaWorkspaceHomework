import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
	//����Ʈ ��Ʈ��: �̹���, ������, ���� �� �ؽ�Ʈ ���� ��� �� 
	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		
		//�о�� ������ ���ϸ��� ������ �ִ� File��ü ����
		File file=new File("aaa.txt");
		
		//���ϰ� �����ϴ� �ٸ�(Stream)
		try {
			//read�� output�� �ٸ��� ������ �������� ������ �ڵ����� ����! ���� �߻�! 
			FileInputStream fis=new FileInputStream(file);
			
			//���� ������ �б�
			/*byte b=(byte)fis.read(); //���Ͽ��� 1byte �о��. �ݺ��� �ʿ�.
			
			while(b!=-1) {//������ read()���� �� �о�� �����Ͱ� ������ -1��.
				//System.out.println(b);//�о�� �� �����ֱ�.. �ƽ�Ű��ȣ�� �����
				System.out.println((char)b);
				b=(byte)fis.read();
			}*/
			//�� ����� ��� �ƴ�(�ƽ�Ű�ڵ尡 �ƴ�) ���ڴ� �ùٷ� �о����� ����.->�̹��� �� �� ���� ��
			
			//����Ʈ �迭(������ ���)������ �о���Ϸ�. 
			//�о���� �����͸� ������ ��(�������) ����Ʈ �迭�� ���� �����ؾ���. 
			byte[] bytes=new byte[100]; //�� ũ�� ���� �����! 
			fis.read(bytes); //�Ķ���ͷ� ���޵� �迭�ȿ� �о�� ������ �־���
			
			//�о�� ����Ʈ �迭�� String���� ��ȯ
			String s=new String(bytes);
			System.out.println(s);  
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�б� ���� �� ������ �߻��߽��ϴ�.");
		}

	}

}
