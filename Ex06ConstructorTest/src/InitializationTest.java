
public class InitializationTest {
	
	//1. 기본값 초기화 - 0
	int a=10; //2. 명시적 초기화
	static int b;
	
	//3.0 static 초기화 블럭 : 객체가 처음 만들어 질 때 한 번 실행(객체 개수 상관없이)
	static
	{
		//a=10; 일반 멤버변수는 초기화 못함.
		System.out.println("static 초기화 블럭!!");
	}
	
	
	//3.1 초기화 블럭(Region) : 인스턴스 초기화 블럭 : 객체 생성 때 마다 실행/ 단점: 값을 받아오지 못해 그래서 잘 안써 
	{
		//생성자 메소드 전에 실행되는 영역: 객체보다 먼저 실행
		a=20;
		a++;
		System.out.println(a);
		//이런 실행문 조차 가능한 영역!!
		if(a<25) {
			a--;
		}
		
	}
	
	//4. 생성자 메소드
	public InitializationTest() {
		// TODO Auto-generated constructor stub
		a=50;
	}

}
