
public class Student extends Person{
	
	private String major;
	
	public Student() {
		major="";
	}
	
	public Student(String name, int age, String major) {
		//*******super. �ƴϾ�!!! super() �����ڴϱ�!!
		super(name,age);
		this.major=major;
	}
	
	public void show() {
		super.show();
		System.out.println("major : "+ major);
	}

}
