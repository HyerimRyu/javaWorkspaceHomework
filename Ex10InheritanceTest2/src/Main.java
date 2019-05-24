
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Second s= new Second();
		s.a=10; //상속받은 클래스 : 상위클래스의 멤버를 내것인양 ... 
		s.b=20;
		
		System.out.println("a : "+ s.a);
		System.out.println("a : "+ s.b);
		System.out.println();
		
		
		//객체지향은 멤버변수 제어를 직접 하는것을 싫어해. 니껀 니가. 니 변수값은 니가 알아서해 
		//출력하는 기능을 만들어서 사용! 객체지향은 멤버변수 제어하는 기능을 갖고있어
		System.out.println();
		
		//Second도 출력기능 만들수 있겠죠! 
		s.showFirst(); // 상위 클래스 멤버를 내것인양
		s.showSecond(); 
		System.out.println();
		
		//여기까지 하고보니
		//Second객체에서 a,b모두 출력하는게 좋겠죠!
		//이렇게 단순하게 출력가능!
		s.show();
		
		//이런식이면 값을 대입하는 기능도 추가 가능
		//상위클래스의 a까지 값 설정이 되어야함. 
		s.setMembers(100,200);
		s.show();
		
		Second s2=new Second();
		s2.setMembers(10, 50);
		s2.show();
		
		//만들면서 값 대입하면 더 편할텐데..
		//그래서 존재하는 객체생성(new)시 자동으로 실행되는 메소드 이용!
		//Constructor!!!!!!!!!!생성자
		//Second s3=new Second(5, 3);
		//s3.show();
	}

}
