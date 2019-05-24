
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test t1=new Test(10,30);
//		Test t2=new Test(20,40);
//		Test t3=new Test(30,50);
//		
//		System.out.println(Test.b);
//		
////		t1.a=10;
////		t1.b=50;
//		
//		//b=50; ERROR
//		
//		//t1객체의 일반 변수(a)를 변경해도 다른 객체의 a는 변경되지 않음. 다른 변수야!!
//		//즉, 일반변수는 객체마다 가지고 있는 변수! 
//		t1.a=10;
//		System.out.println(t1.a);
//		System.out.println(t2.a);
//		System.out.println(t3.a);
//		System.out.println();
//		
//		
//		//static변수는 객체마다 있는게 아니라 
//		//한 개만 존재하므로 어떤 객체를 이용해서 변경하든 
//		//나머지 객체도 영향을 미침
//		t2.b=20;
//		System.out.println(t1.b);
//		System.out.println(t2.b);
//		System.out.println(t3.b);
//		System.out.println();
//		
//		
//		t3.b=30;
//		System.out.println(t1.b);
//		System.out.println(t2.b);
//		System.out.println(t3.b);
//		System.out.println();
//		
//		//그래서 static변수는 한 객체의 변수라고 보기에 부적절해!
//		//사용할 때 객체명을 이용하기보다는 클래스에 1개이므로
//		//클래스명을 써서 접근하는 방식을 권장함. 
//		Test.b=40;
//		System.out.println(Test.b);
		
		//같은 클래스의 객체들이 모두 같은 값을 공유하고 싶을 때.
		//First, Second클래스의 객체가 각각 몇개 만들어 질까
		
		/*new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		System.out.println();
		
		new Second();
		new Second();
		new Second();
		System.out.println();*/
		
		/*System.out.println(Test.b);
		Test.show(); //객체생성 없이 호출가능! 
		
		
		Second.b=20;//static 변수 사용
		
		Test.show();//static 메소드 : 객체 생성 없이 호출 가능!
		
		Test t=new Test();
		t.aaaa(); //instance 메소드: 객체가 있어야만 호출가능!
		t.show(); //경고~ 이렇게(t.show();) 말고~ Test.show();이렇게 써야지~
*/		
		//System.out.
	
		AAA.b.show();
		System.out.println();
		
		

	}

}
