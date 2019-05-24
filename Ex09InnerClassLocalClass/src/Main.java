
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inner class : Nice클래스
		//Outter class: Test클래스
		
		Test t=new Test(); //일반적인 클래스들은 그냥 인식됨.
		
		//이너클래스는 그냥 인식 불가!
//		Nice n = new Nice();
//		Test.Nice n=new Test.Nice(); //객체생성 불가: 에러: 이너클래스는 아우터 클래스의 객체를 만들지 않고는 쓸 수 없다. 
		
		//이너클래스 사용하기! : 아웃터 객체에게 이너객체 생성을 의뢰하기! 
		Test.Nice n=t.makeInnerClass();
		n.aaa();
		
		
		//static 이너 클래스 객체 생성 가능! : 아웃터 객체 없이.
		First.Hello h= new First.Hello();
		h.show();

	}

}
