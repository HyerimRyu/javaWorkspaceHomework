
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=4;

		
		//메소드만 있는 클래스 객체 생성!!...계산기(사칙연산)
		Calculator cal=new Calculator();
		
		int sum=cal.sum(a,b);//계산기 객체에게 계산 의뢰 
		System.out.println(sum);
		
		int sub=cal.subtract(a, b);
		System.out.println(sub);
		
		int mul=cal.multiply(a, b);
		System.out.println(mul);
		
		int div=cal.divide(a, b);
		System.out.println(div);
		
		//실수형 숫자의 덧셈 의뢰
		double c=3.5;
		double d=4.6;
		
		//이렇게도 가능!!
		//double sum2=cal.sum(c, d);
		System.out.println(cal.sum(c, d));
		
		
		System.out.println(cal.sum(c, d));
		System.out.println(cal.subtract(c, d));
		System.out.println(cal.multiply(c, d));
		System.out.println(cal.divide(c, d));
	
		System.out.println("123"+"456");
		System.out.println(cal.sum("123","456"));
		
		//call by value, call by reference 데이터를 보내면 밸류, 데이터가 아닌값을 보내면 레퍼런스
		int n=10;
		
		Cal ca=new Cal();
		ca.increase(n);
		
		System.out.println("main의 n값 : "+ n);
		
		int[] arr=new int[] {10,20,30};
		ca.increase(arr);
		
		System.out.println("main arr 값 : ");
		for(int t : arr) {//foreach문
			System.out.println(t+"  ");
		}
		System.out.println();
		
	}//main method

}//main class



class Cal{
	
	//전달받은 값을 1 증가
	void increase(int a) {
		a++;
		System.out.println("a의 값 :"+ a);
	}
	
	//배열을 파라미터로 받기
	void increase(int[] a) {
		for(int i=0; i<a.length; i++) {
			a[i]++;
		System.out.print(a[i]+"  ");
	}
	System.out.println();
	}
}
