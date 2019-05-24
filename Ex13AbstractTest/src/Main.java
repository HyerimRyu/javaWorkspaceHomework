
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] anis = new Animal[5]; //Animal참조변수 5개를 요소로 가지는 배열객체 생성
		
		anis[0]=new Dog();
		anis[1]=new Dog();
		anis[2]=new Cat();
		anis[3]=new Cat();
		anis[4]=new Pig();
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		//만들면 안되는 Animal 객체를 생성할수 있자네!
		//Animal ani=new Animal();
		
		//추상클래스는 바로 객체생성 불가능
		//Test t=new Test(); //ERROR
		//추상클래스는 반드시 상속해서 상속한 객체를 생성함으로써 사용
		AAA obj=new AAA();
		obj.aaa();
		obj.show();
		Test.bbb();//static메소드는 객체명이 아니라 클래스명으로 접근
		
		Test t=null;
				
		t=new AAA();
		t.aaa();
		
		t=new BBB();
		t.aaa();
		
		//이름이 없는 클래스: 익명클래스(Anonymous class)
		t=new Test() {

			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("CCC aaa()");
			}
	};
t.aaa();
}//main method
}//main class
class BBB extends Test{
	@Override
	void aaa() {
		// TODO Auto-generated method stub
	System.out.println("BBB aaa()");	
	}
}

class AAA extends Test{
	//추상 메소드를 가진 추상클래스를 상속받으면
	//기능이 구현되지 않은 메소드가 있다는 것이므로 그냥 객체를 생성하도록 하면
	//기능없는 메소드를 보유하는 상태가 됨-> 안좋아!! ->그래서 자바에서 불허!
	//반드시 추상메소드는 오버라이드를 해야만해요~노는꼴은 못봐~

	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AAA aaa()");
		
	}
	
}

//객체생성이 안되는 추상클래스로 만들기 / 왜? 메모리 leak 이야
abstract class Animal{
	//*******오버라이드(자식 객체 안에 있는 기능 쓰고싶어요)
	//내용은 없고 이름만 존재하는 메소드
	abstract void say(); //추상메소드
	
}

class Dog extends Animal{
	void say() {
		//오버라이드용
		System.out.println("멍멍!!");
	}
}


class Cat extends Animal{
	void say() {
		System.out.println("야옹~");
	}
}

class Pig extends Animal{
	void say() {
		System.out.println("꿀꿀!!");
	}
}

class Duck extends Animal{

	@Override
	void say() {
		// TODO Auto-generated method stub
		
	}
	
}
