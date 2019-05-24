
public class Second extends First{
	
	private int b;
	
	//생성자 메소드
	public Second() {
		//super(); 생성자를 호출했다!!(First)생성자를 호출했다!! 
		System.out.println("Second 객체생성!!");
	}
	
	//생성자 오버로딩
	public Second(int a, int b) {
		//First(); 생성자를 호출했다!!
		
		//super.a=a; 에러!!!!!!!!!!
		super(a); //First(부모 클래스) 생성자 명시적 호출
		//super()생성자 호출은 반드시 첫번째 문장으로 있어야 해!!!
		this.b=b;
		System.out.println("Second 객체생성 int, int생성");
	}
	
	
	
	public void showSecond() {
		System.out.println("b : "+ b);
	}
	
	public void show() {
		//System.out.println("a : "+ a); //First a는 private 에러나! First가 갖고 있는 함수 호출 지꺼 지가
		showFirst(); 
		System.out.println("b : "+ b);
		System.out.println();
	}

}
