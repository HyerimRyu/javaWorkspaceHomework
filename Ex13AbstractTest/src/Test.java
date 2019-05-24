
//추상클래스: 그냥 사용하는 것이 아니라 반드시 상속해서 사용해야해
public abstract class Test {
	
	int a; //인스턴스변수: 일반변수
	static int b=10; //static 변수
	
	//생성자 메소드-->추상클래스는 바로 new가 안될뿐, (상속받은)자식을 통해서 객체 생성 가능해요~
	public Test() {
		System.out.println("Test 생성자!!");
	}
	
	//인스턴스 메소드
	void show() {
		System.out.println("show..");
	}
	
	//추상메소드
	abstract void aaa();
	//abstract void ccc();
	//abstract static void ddd(); //ERROR: abstract와 static은 동시에 사용 불가 
	
	//static 메소드
	static void bbb() {
		System.out.println("static..."+b);
	}

}
