
public class Person {
	
	String name; //�⺻�� �ο�: null
	int age;     //�⺻�� �ο�:0
	
	//������ �޼ҵ� 
	public Person(){
		System.out.println("Person��ü ����");
		name="�͸�";
		age=0;
	}
	
	//�������� ������ ��� �������� �ʱ�ȭ�� ����
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("Person��ü ����, String, int");
	}
	
	//������ �����ε�
	//������ �����ε�_�̸�����
	public Person(String name) {
		this.name=name;
		this.age=0;
		System.out.println("Person��ü ����, String, int");
	}
	//������ �����ε�_���̵���
	public Person(int age) {
		this.name="�͸�";
		this.age=age;
		System.out.println("Person��ü ����, String, int");
	}
	
	//��� ������ ���� �����ϴ� �޼ҵ� 
	public void setMembers(String name, int age) {
		//***���޹��� �Ű������� ��������� ����
		this.name=name;
		this.age=age;
		
	}
	//��������� ���� ������ִ� �޼ҵ�
	public void show() {
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		System.out.println();
	}
	//Getter&Setter �޼ҵ嵵 ���� ����� �δ°� �Ϲ���
	
	//this()�� �̿��� �����ڵ�..(���� �ּ�ó���Ѱ� �ٽ� �غ���)
	//�������� ���� ������ �� �����ϰ� ����Ʈ ������, �Ʒ��� �ξ� ����!! ���� �Ʒ��� �Ȱ��� �ڵ�!
//	public Person() {
//		this("�͸�",0);
//	}
//	public Person(String name) {
//		this(name,0);
//	}
//	public Person(int age) {
//		this("�͸�",age);
//	}
//	public Person(String name, int age) {
//		this.name=name;
//		this.age=age;
//		System.out.println("Person ��ü ����!");
//	}
//	
}
