
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.p); //�������� �⺻�� null
		System.out.println();
		
		//������� �� ����(������� ����)
		t.a=10;
		 //������ �������� ��������, Ƽ�� �������� Ƽ��
		t.p=new Person(); //��ü �����Ͽ� ���������� ����
		
		System.out.println(t.a);
		System.out.println(t.p);//������(�ּ�) ���
		System.out.println();
		
		//��������� �����ϴ� �� �ٸ� ��ü�� ������� �� ���
		System.out.println(t.p.name); //***���� . .p�� �� �ٸ� ��ü�� ���������� 
		System.out.println(t.p.age);
		System.out.println();
		
		//�ᱹ ��������� �����ϴ� ��ü�� ������� ��������� ��. // . .���� ��
		t.p.name="sam";
		t.p.age=20;
		
		System.out.println(t.a);
		System.out.println(t.p.name);
		System.out.println(t.p.age);
		System.out.println();
		
		//Person�� ����� ����� ���� ������ ���°� ¥��! 
		//�� ���� p.t.�ϸ鼭 �ؾߵ�?! Person�� �ʲ��ϱ� �ʰ� �˾Ƽ� ��!!->method
		//Person Ŭ������ ����� ��±��
		t.p.show(); //�ڱⰪ�� �ڱⰡ! �׷��� . .���� ������
		System.out.println();
		
		t.show();
		System.out.println();
		
		//���ο� Test��ü�� ���� ����� �ʰ� ����� ��°���! 
		Test t2=new Test();
		t2.a=100;
		t2.p=new Person();
//		t2.p.name="robin";
//		t2.p.age=25;
		
		//����� ��������~ �ٵ� �Էµ� ������ ���� �������?!?!?! 
		//��ü�� ���Ե� �޼ҵ� �̿�����!! �ѹ��� �� �ְ� ��!!
		t2.p.setMembers("robin", 25);
		t2.show();
		
		//TestŬ������ �Է� ����� ������ �� ���ϰ� �� ���� ����!
		Test t3=new Test();
		//**********�߿�)Person��ü�� �־�� ������� ����
		Person p=new Person();
		p.setMembers("hong", 30); //call by reference
		
		t3.setMembers(10,p);
		t3.show();
		
		//���� ���� �ᱹ TestŬ���� ��ü�� ������� �� ��
		//a���� ���Ҿ� name, age ���� ��� ������ �־�� ��.
		//new set show! ��! �̷��� �ϰ� �ʹ� 
		Test t4=new Test();
		t4.setMembers(10, "kim", 35);
		t4.show();
		
		
		//������� ���ϱ�.. ��ü ���� �� ����� ������ ���� 
		//�Ź� setMembers()�޼ҵ带 ȣ���ϴ� �ڵ带 ����ϴ°� ¥����~
		//��ü ������ �� ������� �̸� ������ �� �� ������ ������!!
		
		//*****�̷���!! ����鼭 ���ְ� �;�! ��ü ������ �ڵ����� 1�� ȣ��Ǵ� �޼ҵ�: ****������ �޼ҵ�(Constructor)
		Test t5=new Test(10, "lee", 40);
		t5.show(); 
		
		Person p2=new Person("park", 45);
//		p2.setMembers("park", 45);
		
//		Test t6=new Test(20,p2);
		Test t6=new Test(20,new Person("park", 45));// Person ������ ���� ����!!!
		t6.show();
		
		Test t7=new Test();
		t7.show();

	}

}
