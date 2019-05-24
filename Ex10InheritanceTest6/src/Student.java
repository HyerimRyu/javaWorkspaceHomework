
public class Student extends Person{
	
	private String major;
	
	public Student() {
		major="";
	}
	
	public Student(String name, int age, String major) {
		//*******super. 아니야!!! super() 생성자니까!!
		super(name,age);
		this.major=major;
	}
	
	public void show() {
		super.show();
		System.out.println("major : "+ major);
	}

}
