import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=divide(10,5);
			System.out.println(x);
		}catch(ArithmeticException e) {
			System.out.println("대신 예외객체 받아 처리...");
		}
		
		try {
			aaa();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ccc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//이 함수는 다소 위험함. 왜? 에러의 여지가 있는 코드..
	//이를 개선하기 위해 예외처리 .. try
//	static int divide(int a, int b) {
//		try {
//			return a/b;
//		}catch(ArithmeticException e) {
//			return ???; //이렇게 뭐라고 써야할지 모르는 상황도 발생할 수 있음.
//		}
//		
//	}
	
	//이 메소드안의 코드에서 예외 발생할 여지가 있으므로 
	//예외 발생하는 문법 try를 써야 하지만 그 쓰임이 다소 애매하면 ..
	//예외 객체를 메소드를 호출한 쪽에 떠넘기는 기법(throws)사용
	static int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}
	
	//throws 옆에 명시한 Exception클래스의 종류에 따라 강제성을 가질 수 있음.
	//혹시 throws를 한 Exception이 Checked Exception의 일종이라면
	//이 메소드를 호출한 쪽에서 반드시 try-catch를 해줘야만 함. 
	

	
	//throws 전달의 전달도 가능(마치 폭탄 떠넘기기처럼)
	static void aaa() throws MalformedURLException{
		
		bbb();
		
		System.out.println("aaa");
		
	}
	
	static void bbb() throws MalformedURLException{
		URL url=new URL("http://www.daum.net");
	}
	
	
	//만약, throws에 최상위 Exception클래스를 명시하면
	//실제 발생한 Exception 객체가 Checked 인지, UnChecked인지 구별 할 방법이 없어서
	//이 메소드를 호출하는 쪽에서는 무조건 try-catch를 해야함!!!
	static void ccc() throws Exception{
		
	}
		
	//이런식으로 특정 예외 클래스를 throws옆에 명시하는 기법
	void ddd() throws NullPointerException{
			
	}
	
	//만약 저 위 메소드에서 Null예외가 아닌 에러가 발생하면 에러!!
	
	//여러 예외를 모두 떠넘기고 싶다면?  //이걸 더 많이 써 
	void eee() throws NullPointerException, ArithmeticException, NumberFormatException{
		
	}
	//물론, 한방에 예외 다 적용 가능
	void fff() throws Exception{
		
		
	}

}
