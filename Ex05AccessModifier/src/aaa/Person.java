package aaa;

public class Person {
	
	//�̸�, ����, ����(���� ����)
	private String name;   //�̸�
	private int age;       //����
	private String nation; //����

	//����޼ҵ� 
	public void setMembers(String name, int age, String nation) {
		//���޹��� ������ ��������� ����!!
		//this ���� class���� ����. �ʵ�� �������� �̸� ���� �� ����!! �������ַ��� this ���
		this.name=name;
		this.age=age;
		this.nation=nation;
	}
	
	public void show() {
		System.out.println(name+","+age+","+nation);
	}//private�� �ʵ忡 �����ϴ� ���
	//����� �ϳ��� �����ϴ� �޼ҵ� : Setters
	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	//����� �ϳ��� ���Ͻ����ִ� �޼ҵ� : Getters
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
