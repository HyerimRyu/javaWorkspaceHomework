
public class Test {
	
	public int a; //멤버변수 -- 인스턴스(메모리에 안착됨:new됨) 된 객체마다 있으므로 --> 다른말로 : 인스턴스 변수
	public static int b; //정적(static) 멤버변수 -- 클래스에 하나 있으므로--> 다른말로 : 클래스변수
	double d;
	String s;
	static String nation;
	public static final int c=50;

	//생성자 메소드
	public Test() {
		a=10;
		b=50;
	}
	
	public Test(int a, int b) {
		this.a=a;
		this.b=b;
	}

	
	//static변수가 되듯이
	//static 메소드도 가능함.
	static void show() {
		//static 메소드 안에서는....
		//System.out.println("멤버변수 a :" + a);//인스턴스 변수 사용불가!
		System.out.println("Test show...");
	}
	
	//instance 메소드(일반 메소드)
	void aaaa() {
		System.out.println("멤버변수 a : "+ a);
		System.out.println("멤버변수 b : "+ b);
	}
	
}
