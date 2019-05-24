import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	//����Ʈ ��Ʈ��: �̹���, ������, ���� �� �ؽ�Ʈ ���� ��� �� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ ������ �Է� : ");
		//���Ͽ� ������ ������
		String data= scanner.next();
		data+="/n";
		
		//�����͸� ������ ������ ��ο� ���ϸ�.Ȯ���ڱ��� ������ �ִ� ��ü ����
		//��θ� �������� ������ �⺻������ �� �ڹ� ������ �ִ� ������Ʈ ������ ����! 
		File file=new File("aaa.txt");
		
		//Ư��(���� ����) ���� �ȿ� ���� ����
		//������ ��α�����( ��������(\))�� �ü������ �ٸ�.
		//windows-->\(��������)�� �ǰ�, /(������)�� ��: ������, ����---> /(������)
		file=new File("kkk\\aaa.txt"); //�������ô� 2�� \\����, �����ô� / �ѹ���! 
		file=new File("kkk/aaa.txt"); //�� ���¸� ���� ��!!!!!!!!!! 
		//file=new File("kkk"+File.separator+"aaa.txt"); //�˾Ƽ� ������ �������� 
		
		// �̸� kkk������ ������ ������ ������
		// ���� ���α׷������� ������ ����� �ʹٸ�
		// ������ ����� �޶�� ����� �����ؾ���
		
		// ������ ���� �� ������ �ϰ���. �׷��Ƿ� ���� ���� �� �������� �ִ��� �˻�!
		// ���ϸ��� ������ ��θ� ������ �ִ� File��ü ����
		File path = new File("kkk"); //������ �ۼ�
		if( !path.isDirectory()) { //�� ������ ����??
			//������ ���丮�� �����~~->make
			path.mkdirs(); //mk : make�� ���Ӹ� //mkdirs ���������� �����Ѵٸ� �� ������������ �� �������
		}
		
		//������ ���� ��ο� ���� ���� ���ϸ��� �����Ͽ� �ٽ� File��ü ����
		file=new File(path, "bbb.txt"); //��ο� ���ϸ� ����!! 
		
		//�� ������Ʈ�� �ƴ� Ư�� ������ ���� �ٷ� �����ϴ� �͵� ������. 
		file=new File("d:/aaa.txt");
		
		//��θ� �Ѳ����� ���� �� ����.
		path=new File("d:/files/kkk");
		if(path.isDirectory())path.mkdirs();
		
		file=new File(path, "hello.java");
		
		
		//�� �����͸� ���Ͽ� �����ϱ�(���������� ��������:output)
		//�ָ� ������ ���Ͽ� �����͸� �������� �ݵ�� Stream(����ٸ�)�ʿ�!!
		
		//Stream�߿��� �������� ������ Stream�� OutputStream�̶�� ��.
		//�� �߿� ���Ͽ� �������� �ɷ��� ���� ��Ʈ��Ŭ������ ��ü�� ����
		try {
			//���� aaa.txt������ ���ٸ� �ڵ� ������Ŵ! ��, ������ �ڵ��������� ����. 
			FileOutputStream fos=new FileOutputStream(file);
			 //�� ��° �Ķ����, append����(true, false)->�������, ����� �ƴϰ� �����ϱ���
			//FileOutputStream fos=new FileOutputStream(file,true);
			
			//��Ʈ���� ���� �����͸� ���Ͽ� �ۼ�(��������)
			//fos.write(65); //�̷� ������ ������ 1����Ʈ�� ������ ������ �ݺ����� �ʿ���. ������ 
			//����Ʈ �迭(byte[])�� ������ ����� ������ ����� ��ȣ 
			//����Ʈ ��Ʈ���� String�� �Ķ���ͷ� ������ �� ������ �Ǿ�����.
			//�׷��� String-->byte[]��ȯ
			//byte[] aaa= data.getBytes(); �Ʒ�ó�� �ѹ濡 ��
			fos.write(data.getBytes());
			fos.flush(); //Stream ���ۿ� ��Ⱑ �������� �� �־ ��쵵�� like ���� �� ������ 
						 //write-flush�� �� ȭ��ǰ��� �������� �� ��
			fos.close(); //������ Stream�۾��� ������ ��Ʈ���� �ݴ� �۾��� �ؾ���
			
			
			
			//������� Ŀ���� �Դٴ°� ������ �����ٴ� ��!!!!!! 
			System.out.println("���� ���� ����!!");
			
			
		} catch (FileNotFoundException e) {System.out.println("������ �������� �ʽ��ϴ�.");} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� �۾� �� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
		
		//File Ŭ���� ��ü�� �ֿ� �޼ҵ�
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());

	}

}
