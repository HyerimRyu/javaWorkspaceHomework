import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데이터를 하나 멤버변수로 저장하여 가지고 있는 Box 객체
		Box box=new Box();
		
		box.setA(10);
		System.out.println(box.getA());
		
		Object obj=10;
		
		int a=10;
		//Integer n=new Integer(10);
		//Integer n=10; //자동 Integer객체 생성 : AutoBoxing
		
		double k=3.14;
		//Double d=new Double(3.14);
		//Double d=3.14; //자동 Double객체가 생성 : AutoBoxing
		
		
		Boolean bool=new Boolean(true);
		Object o=new Boolean(false);
		
		int m=new Integer(10); //Integer->int로 변환 된 것 Un Auto Boxing
		
		//만능박스를 만든 것처럼 보임. 일부 인정할만함
		//값을 가져올 때 좀 짜증나!(다운캐스팅이라서 명시적으로 형변환을 해야만 함)
		box.setA(10);
		int n=(int)box.getA(); //다운캐스팅이라 에러(Object->Integer->int)
		
		box.setA(3.14);
		double d=(double)box.getA();
		
		//클래스 한 개를 설계해서 여러 자료형을 모두 다 가질 수 있는 객체형으로 만들기 
		Box2<String> box2=new Box2<String>();
		box2.a="aaa";
		
		Box2<Random> box3=new Box2<Random>();
		box3.a=new Random();
		
		//<>안에 쓰는 자료형은 오직 참조형만 가능, 즉. 기본형 자료형은 사용불가!! -> wrapper class의 존재이유
		//Box2<int> Box4=new Box2<int>();
		
		//이럴 때 기본형을 참조형으로 만든 Wrapper클래스들을 이용
		Box2<Integer> Box4=new Box2<Integer>();
		//box4.a=10; //오토박싱: 기본형처럼 사용해도 됨!! 
		//int k=box4.getA(); //언오토박싱
		
		Box3<String, Integer> box5=new Box3<String, Integer>();
		box5.a="Hello";
		box5.b=10;
		
		Box3<Integer, Random> box6=new Box3<Integer, Random>();
		box6.a=20;
		box6.b=new Random();
	}

}

//멀티 제네릭
class Box3<T, K>{
	T a;
	K b;
}

//Generic 사용하기 : 설계도면을 만들 때 자료형을 결정하지 않고 사용할 때 결정하도록!! 
class Box2<T>{
	
	T a; //멤버변수
	
	public T getA() {
		return a;
	}
	
}

class Box{
	//만능자료형 Object 어떤 객체든 참조할 수 있는 멤버참조변수!!
	Object a;
	
	public void setA(Object a) {
		this.a = a;
	}
	
	public Object getA() {
		return a;
	}
	
}