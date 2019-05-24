
public class Second {
	
	int a;
	int b;
	
	//생성자 메소드
	public Second() {
		//다른 생성자 호출 가능함!! 
		//Second(10,20); <--이건 문법적으로 안돼.
		this(10,20);
	}
	
	public Second(int a) {
		//System.out.println("aaa");//ERROR
//		this.a=a;
//		this.b=a;
		//this. 대신 this()
		this(a,a); //첫번째 실행문으로만 가능 앞에 다른거(ex.print) 있으면 안돼. 객체를 만든 후 기능 발현해야지 아래처럼
		System.out.println("aaa");//ERROR
	}

	public Second(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	
	//일반메소드
	void aaa() {
		bbb();//다른 메소드 호출 가능!!
	}
	
	void bbb() {
		
	}
}
