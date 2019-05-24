
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스는 직접 new 객체생성 불가!!
		//Test t=new Test();
		
		//사용하려면? 상속받은 클래스를 만들어서 객체를 생성해야해
		First f=new First();
		f.aaa();
		f.ddd();
		
		//s도 100% .aaa, .ddd 갖고 있을꺼야 : 확실하게 확신--->게임 만들 때 인터페이스 상속받으면 객체(unit)마다 필수(공통) 요소 오버라이드
		Second s=new Second();
		s.aaa();
		s.ddd(); 
		
		
		//인터페이스 6번 특징 
		Test t;//인터페이스 참조변수(부모 참조변수)
		t=new First(); //가능:업캐스팅 // 앞쪽과 뒤쪽 달라야죠 
		t.aaa();
		t.ddd();
		
		t=new Second();
		t.aaa(); //100% 오버라이드 된 것 추상클래스는 장담할 수 없어.(오버라이드가 아닌 기능 부를수도 있잖아) 
		t.ddd();
		
		Test.Hello h=new Test.Hello(); //static 이너클래스는 객체 생성 가능
		h.show();
		
	}

}

