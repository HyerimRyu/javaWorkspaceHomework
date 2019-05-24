package aaa;

public class Person {
	
	//이름, 나이, 국적(정보 은닉)
	private String name;   //이름
	private int age;       //나이
	private String nation; //국적

	//멤버메소드 
	public void setMembers(String name, int age, String nation) {
		//전달받은 값들을 멤버변수에 대입!!
		//this 본인 class에서 쓸때. 필드와 지역변수 이름 같을 때 여기!! 구분해주려고 this 사용
		this.name=name;
		this.age=age;
		this.nation=nation;
	}
	
	public void show() {
		System.out.println(name+","+age+","+nation);
	}//private된 필드에 접근하는 방법
	//멤버값 하나씩 대입하는 메소드 : Setters
	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	//멤버값 하나씩 리턴시켜주는 메소드 : Getters
	public String getName() {
		return name;
	}
	public String getNation() {
		return nation;
	}
	public int getAge() {
		return age;
	}
	
	
	
	
}
