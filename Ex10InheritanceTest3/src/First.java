
public class First {
	
	private int a;
	
	//객체 생성시 한 번 자동으로 실행되는 메소드 : 생성자 메소드!! constructor 메소드
	public First() {
		System.out.println("First 객체생성!!");
	}
	
	//생성자 메소드 오버로딩
	public First(int a) {
		this.a=a;
		System.out.println("First 객체 int 생성!!");
	}
	
	public void showFirst() {
		System.out.println("a : "+ a);
	}

}
