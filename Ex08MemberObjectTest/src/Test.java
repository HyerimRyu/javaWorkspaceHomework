
public class Test {
	
	int a;
	Person p;
	
	//������ �޼ҵ�(���� �޼ҵ� �߿� 1����~~��ġ �մϴ�~~)//�������� �پ��ϰ� ������!! 
	//����ڰ� ��� �Է����� ���ݾ�!
	public Test() {
		//�̰� �� �����? �Ʒ��� �ϸ� ������ ���� �ڵ� �� ��������!!
		a=0;
		p=new Person();
		p.setMembers("�͸�", 0);
	}
	
	public Test(int a, Person p) {
		this.a=a;
		this.p=p;
	}
	
	public Test(int a, String name, int age) {
		this.a=a;
		//***�߿�!! ��ü ��������
		this.p=new Person();
		this.p.setMembers(name, age);
	}
	
	
	void show() {
		System.out.println("a :"+ a);
		//System.out.println("p : "+ p);//a����ϵ� p�ϸ� �ȵ�!! p�� Person��ü�ݾ�
		//System.out.println("name :"+p.name);
		//System.out.println("age :"+p.age);
		
		//******�����ü�� ����� �� ��������?!?!? Person�� ���� ���� �Ҽ� ���ݾ�!
		p.show();
	}
	//�Է±��
	void setMembers(int a, Person p) {
		this.a=a;
		this.p=p;
	}
	
	//�Է±�� �߰�:�����ε�( ���� ����, �ٸ� �Ķ����!)
	void setMembers(int a, String name, int age) {
		this.a=a;
//		this.p.name=name;
//		this.p.age=age;
		
		//������� p�� ���� �����ϰ� �ִ� ��ü�� �����Ƿ� 
		//������� ���� �����ϴ� ���� �ڵ�� ����!!  null point exception
		
		//************�߿�)���� Person��ü�� �����ϰ�..
		this.p=new Person();
		//�� ���� 
//		this.p.name=name;
//		this.p.age=age;
		this.p.setMembers(name, age);
	}
	

}
