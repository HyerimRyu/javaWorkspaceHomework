
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//지역변수에 final키워드 붙이기-> 상수화된 변수
		final int a = 10; 
		// a=20; //error : a는 변경 불가!
		
		//멤버변수에도 final 가능?!
		//Test 클래스 설계
		
		final int b;
		b=10; //처음값 대입은 초기화의 개념으로 처리
		// b=30; //error
		
		//메소드에도 final키워드 적용 가능!
		//Test 클래스에 show()메소드 만들고 final적용! 
		Test t= new Test();
		t.show();
		
		
		//class에 final적용: 상속 불가!!
		//final 클래스를 사용하는 것은 특별한 점이 없음.
		//단, 이 클래스를 상속해 줄 수 없음.
		//First 상속받는 Second클래스를 만들면 에러!! 
		First f=new First();
		f.show();

	}

}
