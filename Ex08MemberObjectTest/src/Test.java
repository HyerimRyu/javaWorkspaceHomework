
public class Test {
	
	int a;
	Person p;
	
	//생성자 메소드(거의 메소드 중에 1빠로~~위치 합니다~~)//종류별로 다양하게 만들어요!! 
	//사용자가 어떻게 입력할지 모르잖아!
	public Test() {
		//이거 왜 만들어? 아래꺼 하면 메인의 위의 코드 다 에러나서!!
		a=0;
		p=new Person();
		p.setMembers("익명", 0);
	}
	
	public Test(int a, Person p) {
		this.a=a;
		this.p=p;
	}
	
	public Test(int a, String name, int age) {
		this.a=a;
		//***중요!! 객체 만들어라잉
		this.p=new Person();
		this.p.setMembers(name, age);
	}
	
	
	void show() {
		System.out.println("a :"+ a);
		//System.out.println("p : "+ p);//a출력하듯 p하면 안돼!! p는 Person객체잖아
		//System.out.println("name :"+p.name);
		//System.out.println("age :"+p.age);
		
		//******멤버객체의 멤버꺼 왜 내가해줘?!?!? Person은 지꺼 지가 할수 있잖아!
		p.show();
	}
	//입력기능
	void setMembers(int a, Person p) {
		this.a=a;
		this.p=p;
	}
	
	//입력기능 추가:오버로딩( 같은 글자, 다른 파라미터!)
	void setMembers(int a, String name, int age) {
		this.a=a;
//		this.p.name=name;
//		this.p.age=age;
		
		//멤버변수 p는 현재 참조하고 있는 객체가 없으므로 
		//멤버변수 값을 대입하는 위의 코드는 에러!!  null point exception
		
		//************중요)먼저 Person객체를 생성하고..
		this.p=new Person();
		//값 대입 
//		this.p.name=name;
//		this.p.age=age;
		this.p.setMembers(name, age);
	}
	

}
