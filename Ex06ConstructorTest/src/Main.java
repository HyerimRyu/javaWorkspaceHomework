
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü���� �� ������ ����� �����ϴ� �޼ҵ带 ȣ���ؾ� ��.
		Person p=new Person(); //��������� �⺻������ �ʱ�ȭ
		p.setMembers("sam", 20);
		p.show();
		
 	    //2��° ��ü������ ������
		Person p2=new Person();
		p2.setMembers("robin", 25);
		p2.show();
		//�̷� ��������� ¥��! ��? ������ ��ü���� �� 
		//�� ������ ���� �� �ٽ� .setMembers()�޼ҵ带 ȣ���ؾ߸� ��!!
		
		//��ü�� �̷��� int a=10; �ٷ��ϸ� �󸶳� ����?!
		//��ü�� �����ϸ鼭 �޼ҵ带 �̿��ؼ� ���� �����ϰ��� ��.
		// ��ü�� ������ �� �ڵ����� �޼ҵ尡 ȣ��Ǵ� �޼ҵ尡 �ִٸ� ������!!
		//Constructor(������ �޼ҵ�: ��ü ������ �ڵ����� ȣ��Ǵ� �޼ҵ�)
		
		//������ �޼ҵ� ������ ����... 
		First f=new First();
		
		//������ �޼ҵ�� ��ü�� ������ ������ ȣ���.
		First f2=new First();
		
		//������ �޼ҵ忡 �Ķ���� ����!!
		First f3=new First(10);
		//������ �����ε�...
		First f4=new First(28);
		
		//person��ü�� ������ �޼ҵ� ����
		new Person();
		
		//�ٸ� ��Ű����(default) ������ �޼ҵ� ȣ��
		//aaa.Test t=new aaa.Test();//ERROR
		Person p3=new Person();
		p3.show();
		
		//��ü�� �����ϸ鼭 ��������� ����(�ʱ�ȭ)
		Person p4=new Person("hong", 30);
		p4.show();
		
		Person p5=new Person("kim",35);
		p5.show();
		
		Person p6=new Person("lee");
		p6.show();
		
		//this() �ٸ� ������ �޼ҵ带 ȣ���ϴ� ���
		
		new Second();
		new Second(50);
		new Second(40,100);
		
		//InitializationTest
		new InitializationTest();
		new InitializationTest();
		new InitializationTest();
	
		
		
		
	}

}
