import java.util.Scanner;

public class Variable {
	
	public static void main(String[] args) {
		
		//Ű����� �Է¹޾� �ڷ����� �°� �ٲ��ִ� ��ü
		int num;
		//Ű���� �Է��� �޾Ƽ� �ڷ����� �°� �ٲ��ִ� ��ü ����
		Scanner scan=new Scanner(System.in);
		
		int a,b;
		
		System.out.print("�Է� : ");
		a=scan.nextInt();
		
		System.out.print("�Է� : ");
		b=scan.nextInt();
		
		System.out.println();
		System.out.print(a + "+" + "b" + "=" + (a+b));
		
		
		
	
		/*//short+short�� ��ǻ�� ����������� int+int�� �۾���. ������ short+short�� �ٽ� short�� �ִ°� ����
		//�׳� ���ڴ� �� int��~~~~~ int���� ū�� ���� �������� �׳� long��~
		
		short a=10;
		short b=20;
		
		// short c=a+b; ������. �ؿ�ó�� ó����. 
		short c=(short)(a+b);*/
		
		
		/*
		//����)�������� ���� ���� ������ ���ӽ� ������ ����ó�� ������
		short a;
		a=10;
		*/
		
		
		/*int a=(int)3.14;
		float b=3.14f;
		
		float c=10; //10�� 10.0���� �ٲ㼭 ��
		double k=3.14f; 
		
		int i=10;
		float j=i;
		
		long g=100L;
		float h;
		h=g;*/
		
		
		
		/*boolean a;
		a=true;
		
		byte b=127; //128 error 
		char c='��';
		c=97;
		
		c=65000; //short�� ���� 2byte���� c�� ��ȣ�� ��� 66000���� ���� 
		
		short d=32000; //33000 error
		
		int e=2100000000; //22�� error
		
		long f;
		f=9000000000000000000L;
		
		float g;
		g=3.14f;
		
		double h;
		h=3.14;
		
		String s="Hello"; //""�� string�� ��ü�� ���弼��
		int m=s.length();
		String s1=new String("aaa"); //���� �̰� ���� ǥ��
		
		int n=s1.length();
		
		System.out.println(m);*/
		
		
	}

}
