
public class Second {
	int g=10; //멤버변수
	
	void aaa(){ //멤버메소드
		
		final int r=50; //지역변수 : 다른 지역에서는 사용불가! 
		
//		AAA k = new AAA(); //만들기 전에 쓸 수 없어 ㅠㅠㅠ  지역클래스는 정의한 후 사용해야해 
		
		//지역클래스(Local): 다른 지역에서는 인식불가!! / 일회용: 메소드가 호출되면 생기고 메소드가 끝나면 소멸 
		//생각보다 많이 써 || 상속 배워서 익명 class 가 지역클래스랑 짬뽕되어서 써
		class AAA{
			void show() {
				System.out.println("AAA ... show"+ g);
				System.out.println("AAA...show"+ r); //지역클래스 내에서는 멤버변수만 사용가능하고 지역변수 사용불가(한 번 되는건 이클립스가 혼자 final로 만든거.
				//final지역변수는 사용가능!			 // 그래서 한 번 대입하면 파이널 아니네?   에러!! (왜? 지역변수는 메소드 끝나면 메모리 사라지잖아) 
													 
			}
		}
		
		AAA obj=new AAA();
		obj.show();
		
		AAA obj2=new AAA();
		obj2.show();
		
		AAA obj3=new AAA();
		obj3.show();
		
		
	}//aaa method
	
	void bbb() {
//		AAA obj=new AAA(); //ERROR 왜? AAA지역 벗어났잖아! 
	}//bbb Method
	
	//Inner class

}//Second class
