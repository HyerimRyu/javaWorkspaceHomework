
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성 후 언제나 멤버값 세팅하는 메소드를 호출해야 함.
		Person p=new Person(); //멤버값들이 기본값으로 초기화
		p.setMembers("sam", 20);
		p.show();
		
 	    //2번째 객체생성도 수월함
		Person p2=new Person();
		p2.setMembers("robin", 25);
		p2.show();
		//이런 방식조차도 짜증! 왜? 언제나 객체생성 후 
		//값 대입을 위해 또 다시 .setMembers()메소드를 호출해야만 해!!
		
		//객체도 이렇게 int a=10; 바로하면 얼마나 좋아?!
		//객체를 생성하면서 메소드를 이용해서 값을 대입하고자 함.
		// 객체를 생성할 때 자동으로 메소드가 호출되는 메소드가 있다면 좋겠죠!!
		//Constructor(생성자 메소드: 객체 생성시 자동으로 호출되는 메소드)
		
		//생성자 메소드 연습을 위해... 
		First f=new First();
		
		//생성자 메소드는 객체를 생성할 때마다 호출됨.
		First f2=new First();
		
		//생성자 메소드에 파라미터 전달!!
		First f3=new First(10);
		//생성자 오버로딩...
		First f4=new First(28);
		
		//person객체에 생성자 메소드 적용
		new Person();
		
		//다른 패키지의(default) 생성자 메소드 호출
		//aaa.Test t=new aaa.Test();//ERROR
		Person p3=new Person();
		p3.show();
		
		//객체를 생성하면서 멤버값들을 전달(초기화)
		Person p4=new Person("hong", 30);
		p4.show();
		
		Person p5=new Person("kim",35);
		p5.show();
		
		Person p6=new Person("lee");
		p6.show();
		
		//this() 다른 생성자 메소드를 호출하는 기법
		
		new Second();
		new Second(50);
		new Second(40,100);
		
		//InitializationTest
		new InitializationTest();
		new InitializationTest();
		new InitializationTest();
	
		
		
		
	}

}
