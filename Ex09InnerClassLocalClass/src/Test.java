
//Outter class : 이너클래스를 가지고 있는 클래스!
public class Test {
	int a; //멤버변수
	
	//멤버메소드
	void show() {
		System.out.println("Test..."+ a);
		//이너클래스의 멤버를 마음대로 사용할 수 없음.
		//k=30; //Error
		
	}//show method
	
	Nice makeInnerClass() {
		//이너클래스 객체 생성 가능!
		Nice n=new Nice();
		n.k=50; // n한테 허락받으면 사용가능 
		return n;
	}
	
	//Inner class : 클래스 안에 다른 클래스의 설계를 정의!
	//이너클래스의 특징
	//1. 외부(다른 클래스)에서 아웃터클래스명 없이는 인식불가!!
	//2. 외부에서 아웃터명을 이용하여 인식하더라도.. 객체 생성 불가 !!
	//3. 이너클래스는 아웃터 클래스 안에서만 생성할 수 있음. 
	
	//4. 이너클래스 안에서는 아웃터의 멤버를 마치 자기꺼처럼 마음대로 사용가능 
	//4-1. 아웃터는 이너의 멤버를 마음대로 쓸 수 없어.
	class Nice{
		int k=10;//멤버변수 
		
		//멤버 메소드
		void aaa() {
			a=50; //아웃터의 멤버 변수 사용, 이너는 아웃터를 마치 지꺼처럼 써. ~.도 없어. 걍 내꺼야! !!!니껀 내꺼 내꺼도 내꺼 !!!
			      //이너는 아웃터가 없으면 존재할수 없기때문에 이너가 있다면 무조건 아웃터가 메모리 내에 있기때문
			System.out.println("Nice...k:"+ k);
			System.out.println("Nice...a:"+ a);
			
			//아웃터의 멤버메소드도 가능
			show();
		}
		
	}//Nice class
	
	

}//Test Class


