import java.util.Scanner;

public class Variable {
	
	public static void main(String[] args) {
		
		//키보드로 입력받아 자료형에 맞게 바꿔주는 객체
		int num;
		//키보드 입력을 받아서 자료형에 맞게 바꿔주는 객체 생성
		Scanner scan=new Scanner(System.in);
		
		int a,b;
		
		System.out.print("입력 : ");
		a=scan.nextInt();
		
		System.out.print("입력 : ");
		b=scan.nextInt();
		
		System.out.println();
		System.out.print(a + "+" + "b" + "=" + (a+b));
		
		
		
	
		/*//short+short은 컴퓨터 연산과정에서 int+int로 작업해. 하지만 short+short을 다시 short에 넣는건 불허
		//그냥 숫자는 다 int써~~~~~ int보다 큰거 쓰고 싶을때는 그냥 long써~
		
		short a=10;
		short b=20;
		
		// short c=a+b; 에러야. 밑에처럼 처리해. 
		short c=(short)(a+b);*/
		
		
		/*
		//예외)정수형은 워낙 많이 쓰느까 제임스 고슬링이 예외처리 해줬어요
		short a;
		a=10;
		*/
		
		
		/*int a=(int)3.14;
		float b=3.14f;
		
		float c=10; //10을 10.0으로 바꿔서 들어가
		double k=3.14f; 
		
		int i=10;
		float j=i;
		
		long g=100L;
		float h;
		h=g;*/
		
		
		
		/*boolean a;
		a=true;
		
		byte b=127; //128 error 
		char c='가';
		c=97;
		
		c=65000; //short와 같은 2byte지만 c는 부호가 없어서 66000까지 가능 
		
		short d=32000; //33000 error
		
		int e=2100000000; //22억 error
		
		long f;
		f=9000000000000000000L;
		
		float g;
		g=3.14f;
		
		double h;
		h=3.14;
		
		String s="Hello"; //""은 string형 객체를 만드세요
		int m=s.length();
		String s1=new String("aaa"); //원래 이게 정식 표현
		
		int n=s1.length();
		
		System.out.println(m);*/
		
		
	}

}
