
public class Person {
	
	String name; //기본값 부여: null
	int age;     //기본값 부여:0
	
	//생성자 메소드 
	public Person(){
		System.out.println("Person객체 생성");
		name="익명";
		age=0;
	}
	
	//생성자의 목적은 멤버 변수들의 초기화를 위함
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("Person객체 생성, String, int");
	}
	
	//생성자 오버로딩
	//생성자 오버로딩_이름따로
	public Person(String name) {
		this.name=name;
		this.age=0;
		System.out.println("Person객체 생성, String, int");
	}
	//생성자 오버로딩_나이따로
	public Person(int age) {
		this.name="익명";
		this.age=age;
		System.out.println("Person객체 생성, String, int");
	}
	
	//멤버 변수의 값을 대입하는 메소드 
	public void setMembers(String name, int age) {
		//***전달받은 매개변수를 멤버변수에 대입
		this.name=name;
		this.age=age;
		
	}
	//멤버변수의 값을 출력해주는 메소드
	public void show() {
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		System.out.println();
	}
	//Getter&Setter 메소드도 같이 만들어 두는게 일반적
	
	//this()를 이용한 생성자들..(위에 주석처리한거 다시 해보자)
	//위에서는 내가 일일히 값 대입하고 프린트 했지만, 아래는 훨씬 간결!! 위와 아래는 똑같은 코드!
//	public Person() {
//		this("익명",0);
//	}
//	public Person(String name) {
//		this(name,0);
//	}
//	public Person(int age) {
//		this("익명",age);
//	}
//	public Person(String name, int age) {
//		this.name=name;
//		this.age=age;
//		System.out.println("Person 객체 생성!");
//	}
//	
}
