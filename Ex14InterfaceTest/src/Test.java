
//인터페이스의 정의 모습: 클래스를 정의하는 모습과 동일
//인터페이스는 객체 생성 불가 like 추상클래스~

public interface Test {
	
	//interface의 특징들
	//1. 인터페이스 안에서는 인스턴스, static 변수, 인스턴스 메소드를 만들 수 없음.
	
	//멤버변수 사용불가!
//	int a;
//	static int b;
	
	//인스턴스 메소드 에러!!
//	void show() {
//		//ERROR
//	}
	
	//2. 인터페이스 안에서는 추상메소드, static메소드, 멤버필드는public static final(상수)만 가능
	
	//접근제한자는 무조건 public: 안써도 자동 public : 왜? 정보 은닉 필요없어. 상속이 목적이야~
	public abstract void aaa(); //이름만 있는 메소드 추상메소드!
	void ddd(); //자동 public abstract
	
	//static 메소드: JDK 1.8버전 부터 가능 : 자동 public
	public static void bbb() {
		System.out.println("bbb");
	}
	
	//final 멤버필드 사용가능
	public final int a=10; //자동 static : 그냥 static안돼 final 이라 가능 // 왜 public? 인터페이스틑 팀내 프로토 타입 공유하려고 하는거니까~
	int b=20;//자동 static final이 되었음! : 명시적 초기화가 되어있을 때만!! 
	
	//3. 인터페이스 안에 있는 멤버는 전원 자동 public임!!
//	private static final int c=50;
//	protected static final int d=50;
	
	
	//4. 인터페이스는 기능(method)구현이 완성된 상태가 아니기에 그냥 사용 불가(메모리 leak). 반드시 기능을 구현해야만 사용가능
	//5. 인터페이스를 사용하려면 새로운 클래스를 정의하면서 implements키워드로 '구현'해야만 해 (First, Second class참고)
	//6. 인터페이스도 일종의 상속개념이므로 UP casting가능(메인 참고)
	//7. 인터페이스는 다중구현(다중상속)이 가능함 // AAA, BBB 인터페이스, Sample클래스 (sample class참고)
	//8. 인터페이스도 다른 인터페이스를 상속 받을 수 있음!  // KKK, SSS 인터페이스  (Nice class참고)
	//9. 인터페이스 안에 이너클래스(Inner class)를 정의하면 자동 public static이 됨
	
	
	
	
	//이너 클래스 설계: 자동 public static : static 무슨 의미? 아웃터 없이 객체 생성 가능
	class Hello{
		void show() {
			System.out.println("Hello show...");
		}
	}
	
	

}//Test interface
