import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTest {

	//��ŷ �⺻, �� ��ǻ�Ϳ� �ִ� ���� �����ͼ� �����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���������� ��� 
		String srcPath = "D:/java/workspace/Ex21FileIOTest/aaa.txt";
	
		
		//String ���ϰ�η� ��ٷ� ��Ʈ�� ���� ����
		try {
			FileInputStream fis=new FileInputStream(srcPath);
			
			//�о���� �����͸� ������ ������ ��ο� ���ϸ�����
			File dstPath=new File("D:/copy"); //��θ� ���� ����
			if(!dstPath.isDirectory()) dstPath.mkdirs();
			
			//������� ���� ������ copy������ �ִٰ� Ȯ���� �� �־� 
			//���ϸ��� ������ full��� File��ü ����
			File dstFile=new File(dstPath, "bbb.txt"); // ���+���ϸ� 
			//������� ������ ���ϱ��� �����ϴ� Stream��ü ����
			FileOutputStream fos=new FileOutputStream(dstFile);
			
			
			//�о�� ������ ������(1byte��)�� ��ٷ� dstFile�� ����
			while(true) {
				byte b=(byte)fis.read(); //1byte�� �б�
				if(b==-1) break; //���� �ݺ� �� ������ ����, -1--> ������
				
				//�о���� 1byte�� �ٷ� ���������Ͽ� ����
				fos.write(b); //1byte�� ����
			}
			
			fos.flush(); //������ �ѹ� �� �� ������
			
			//���� ������... 
			fis.close();
			fos.close();
			
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("�а� ����(������) �۾� �� ������ �߻��Ͽ����ϴ�.");
		}
		

	}

}
