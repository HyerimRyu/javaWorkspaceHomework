
public class First {
	
	int a=10;
	static int b=20;
	
	
	//static 이너클래스: 아웃터 객체 생성 없이 다른 곳에서 객체생성 가능
	//1. 이너클래스 아웃터의 static 멤버를 마음대로 쓸 수 있음 
	public static class Hello{
		
		void show() {
			System.out.println("Hello...show");
//			a=20; //error;  //아웃터의 인스턴스변수(일반변수)는 사용불가!
							//inner가 static일땐 아웃터의 static만 사용가능
			b=50; //static 은 가능! 
		}
	}

}
