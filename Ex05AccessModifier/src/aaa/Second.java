package aaa;

public class Second {
	
	//접근제한자가 부여된 멤버변수
	private int a;
	int b;
	protected int c;
	public int d;
	
	
	//default접근 제어자의 메소드
	void aaa() {
		System.out.println("aaa");
		Third t;
	}
	
	//public접근제어자 메소드 
	public void bbb() {
		System.out.println("bbb");
	}

}
