
public class Second extends First{
	//그냥보면 하나도 없는 것 처럼 보이지만 상속받은 First클래스의\
	//멤버를 보유하게 됨.
	
	//멤버변수 추가.
	int b;
	
	//멤버값 대입하는 기능
	void setMembers(int a, int b) {
		super.a=a;  //super 상속받은거다! 상속받은 하위에서만 쓸 수 있어
		this.b=b;
	}
	
	//본인멤버변수를 출력하는 기능!
	void showSecond() {
		System.out.println("b : "+ b);
	}
	
	
	//각각 부르지말고 한방에 부르자! 상속받은 클래스의 멤버까지 출력하는 기능!
	void show() {
		//System.out.println("a : "+ a); //객체멤버출력은 그 객체가 직접 하는게 좋아!! 
		showFirst();
		System.out.println("b : "+ b);
		System.out.println();
	}
	

}
