import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//1. Error : ����Ұ�!!
		//2. Exception : ������(RunTime) ������ �߻�!!
		
		//Exception�� ��ǥ���� ��)
		//1) ����ڰ� �߸��� �����͸� �Է��ϴ� ��� : ���� �Է� ��Ȳ�� �����Է� ��..
		//2) �����ڰ� �����̳� ����� �߸��� ��� : �迭�� �ε��� ��ȣ ����, or 0���� ������.
		//3) ��Ʈ��ũ�� �ϵ������ ����(�ϵ��ũ�� �������� ����.. Ư�� ����Ʈ(����)���� ���� : URL�̽�, ����Ʈ �����ҷ�)
		//4) ?? �������� �����Ͽ� ���� ����(�𵵽� ����) : �ذ��� �����~ ���α׷����� ���� �Ƴ�
		
		//���� ���� ��Ȳ�� �����ϴ� ���� �Ұ� .. ����ó�� Exception 
//		int a=0; --> ����ڰ� 0�� �Է��ߴµ� ����a�� �Ǿ ���������� 0���� �����ϱ� ���� �ʾ�
//		
//		System.out.println(10/a);
		//���ܰ� �߻��ϸ� �� ���� ���α׷��� �ٿ��! 
		//�̸� ������ �ʿ䰡 �־� ��, ������ ����� �κи� �������� �ʰ� ���� �ڵ带 ��� �����ϵ���!!
		//if�� �̿��ؼ� a���� 0���� �˻��غ��� �������� �������� ���� ������ �� ����.
		//��쿡 ���󼭴� �ϴ� �õ��� �غ��� ���ܰ� �߻��ϸ� �׿� �����ؾ� �ϴ� ��쵵 ����.
		//��): ���ͳ� ����Ʈ�� �����ϴ� ���(www.naver.com): ������ �� ���µ� ���������� ������ �ȵǴ� ���
		//�̷���� ����ó�� ������ ������!!  * ���α׷��ӵ鿡�� �ʼ����!!! *  ���ͳ� ���� ����� 100% ����ó�� �ؾ��� 
		
		
		//1) 0���� ������
		int a=0;
		
		try {//�ϴ� �� �� �õ��� ���� ����: ���ܰ� �߻��� ������ �ִ� �ڵ�� �ۼ� ����
			System.out.println(10/a);
		}catch(ArithmeticException e) {
			//������ �߻��� �� ������ �ڵ��...
			System.out.println("������ �߻��߽��ϴ�.");
			System.out.println("�����޼��� : "+ e.getMessage());
			System.out.println("�����޽��� Ǯ���� : " + e.toString());
		}
		
		
		//2) �迭�� �ε��� ��ȣ ��� ����..
		int[] arr = new int[5];
		
		try {//������ �߻��� ������ �ִ� �ڵ�� try{...}�ȿ� �ۼ�!!
			for(int i=0; i<6; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR");
		}
		
		
		
		//**3) null���������� ��ü �޼ҵ� ���(���� ���� �߻�)
		String s=null;
		
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("Null ERROR : ��ü����!!");
		}
		
		
		//4) �߸��� �������� �Է�!!
		Scanner scanner = new Scanner(System.in);
		
		int n=0;
		try {
//			 n= scanner.nextInt();
//			 System.out.println("n : "+ n);
			
		}catch(InputMismatchException e) {
			System.out.println("������ �Է���!!!!!");
		}
		
	
		//5) ���ڷ� �ٲ� �� ���� �����͸� ���ڷ� �ٲٰ��� �� ��!!
//		String str=scanner.next(); //���ڿ� �Է�
		
		//���ڿ��� int������ ��ȯ�ϱ�!
//		try {
//			int num=Integer.parseInt(str);
//			System.out.println("num : " + num);
//		}catch(NumberFormatException e) {
//			System.out.println("������ ���ڿ��� �ƴϿ��� ��ȯ�Ұ�");
//		}
		
		//���ܰ� �� ���� �������� �߻��ϴ� ��쵵 ����!!
		//��) �� ���� �Է¹޾� �������� �ϴ� ���α׷�...
		//�� ��, ���ܾȿ� ��ø���� ���� �ʿ�..
		int c,d;
		
		try {
			c=scanner.nextInt();
			d=scanner.nextInt();
			
			try {
				System.out.println(c/d); //d�� 0�� ������ ���� �� ����
			}catch(ArithmeticException e) {
				System.out.println("������ ���� : 0 ������");
			}
			
			
		}catch(InputMismatchException e) {
			System.out.println("������ �ƴѰ� �Է¿���");
			
		}
		
		
		//��ø�� ��ø...��ø...�̰� �� ¥��
		//if else ��ø ��ſ� if else if��..
		//����catch������ �����ϰ� ó���ϱ�!!
		
		try {
//			c=scanner.nextInt();
//			d=scanner.nextInt();
//			
//			System.out.println(c/d);
		
		}catch(InputMismatchException e) {
			System.out.println("�������� �ƴѰ� �Է�");
		}catch(ArithmeticException e) {
			System.out.println("������ ����: 0������");
		}
		
		//��Ƽcatch���� ���� ���� ����
		//���� ���� ��Ȳ���� ��ó�� ������ ���ٸ�, ���� �������� catch����
		//�ݺ������� �ۼ��ϴ� ���� ����!!
		//���� Ŭ������ �ֻ��� Ŭ������ Exception���� ��� ������ Exception��ü�� catch�� �� ����
		
		try {
//			c=scanner.nextInt();
//			d=scanner.nextInt();
//			
//			System.out.println(c/d);
			
		}catch(Exception e) {//��� ������ �θ�üException ��ȯ!
			System.out.println("ERROR");
		}
		
		
		//���ܹ߻� ���ο� ������� ������ �� ���� �ִٸ�..?!
		//���� ��� ��) �޸𸮸� �����ϰų� �ܺ�(����, ����)�� �����۾��� �� �� ������� ���� �ڵ�� �ۼ�!
		int x=5;
		try {
			System.out.println(10/x);
			System.out.println("��꼺��");
			
		}catch(ArithmeticException e) {
			System.out.println("������");
			
		}finally {
			//������ ����Ǵ� ����!!
			System.out.println("���� ������ ����");
		}
		//�������� finally �� �ᵵ ������ catch{} ���� �� �����
		//�׷� ������ ������ ����Ǵ� �ڵ� �ۼ� ������
		//�׷��� �� ����? 
		//����, �׳ɾ��� ���� try-catch������ ������� �ڵ��ΰ�ó�� �νĵ� ���ɼ��� �� ����
		
		
		//finally�� ���� �Ǹ� catch���� �Ƚᵵ ��.
		try {
			
		}finally {}
		
		
		//Exception�� 2���� �з�!
		//1. Checked Exception : ����ó���� ���ϸ� ������ �߻��Ͽ� ���������� ���ϴ� ���ܵ�!!
		//2. UnChecked Exception : ����ó��(try��)�� �ص��ǰ� ���ص� �Ǵ� ���ܵ�...���ݱ��� �ô� ���� �͵�
		
		//Checked Exception�� ��ǥ���� �͵� : �ݵ�� ����ó�� �ؾ߸� ��밡��!
		
		try {
			URL url=new URL("http://www.naver.com"); //����ó���� ���ϸ� ���൵ �ȵ�
			
			System.out.println("���� ���� �Ϸ�!!");
		}catch( MalformedURLException e) {
			System.out.println("���� �ּҿ� �̻��� �ֽ��ϴ�.");
		}
		
		
		File file = new File("D://aaa.txt");
		
		
		try {
			FileInputStream fis=new FileInputStream(file);
			System.out.println("�������Ӽ���");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�������ӽ���, ������ ã�� �� �����ϴ�.");
		} //����ó���� ���ϸ� �������� �ڵ��! �ݵ�� try-catch�� �����
		
		
		System.out.println();
		System.out.println("aaaa"); //�̰� �������� �ȳ��������� ���� : �ٿ�Ǹ� �Ⱥ����ݾ�. ������ ���ݾ�
	}

}