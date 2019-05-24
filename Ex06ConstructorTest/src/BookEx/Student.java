package BookEx;

public class Student {
	private int number;
	private String name;
	private int age;

	//constructor
	Student(){
		number=100;
		name="New Student";
		age=18;
	}
	
	//Constructor Overloading
	Student(int number, String name, int age){
		this.number=number;
		this.name=name;
		this.age=age;
	}
	
	//책 거지같이 써놨어!!
	public String toString() {
		return "Student [number=" + number + ", name="+ name+", age="+age+"]";
	}
	
	
}
