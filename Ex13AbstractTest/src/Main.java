
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] anis = new Animal[5]; //Animal�������� 5���� ��ҷ� ������ �迭��ü ����
		
		anis[0]=new Dog();
		anis[1]=new Dog();
		anis[2]=new Cat();
		anis[3]=new Cat();
		anis[4]=new Pig();
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		//����� �ȵǴ� Animal ��ü�� �����Ҽ� ���ڳ�!
		//Animal ani=new Animal();
		
		//�߻�Ŭ������ �ٷ� ��ü���� �Ұ���
		//Test t=new Test(); //ERROR
		//�߻�Ŭ������ �ݵ�� ����ؼ� ����� ��ü�� ���������ν� ���
		AAA obj=new AAA();
		obj.aaa();
		obj.show();
		Test.bbb();//static�޼ҵ�� ��ü���� �ƴ϶� Ŭ���������� ����
		
		Test t=null;
				
		t=new AAA();
		t.aaa();
		
		t=new BBB();
		t.aaa();
		
		//�̸��� ���� Ŭ����: �͸�Ŭ����(Anonymous class)
		t=new Test() {

			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("CCC aaa()");
			}
	};
t.aaa();
}//main method
}//main class
class BBB extends Test{
	@Override
	void aaa() {
		// TODO Auto-generated method stub
	System.out.println("BBB aaa()");	
	}
}

class AAA extends Test{
	//�߻� �޼ҵ带 ���� �߻�Ŭ������ ��ӹ�����
	//����� �������� ���� �޼ҵ尡 �ִٴ� ���̹Ƿ� �׳� ��ü�� �����ϵ��� �ϸ�
	//��ɾ��� �޼ҵ带 �����ϴ� ���°� ��-> ������!! ->�׷��� �ڹٿ��� ����!
	//�ݵ�� �߻�޼ҵ�� �������̵带 �ؾ߸��ؿ�~��²��� ����~

	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AAA aaa()");
		
	}
	
}

//��ü������ �ȵǴ� �߻�Ŭ������ ����� / ��? �޸� leak �̾�
abstract class Animal{
	//*******�������̵�(�ڽ� ��ü �ȿ� �ִ� ��� ����;��)
	//������ ���� �̸��� �����ϴ� �޼ҵ�
	abstract void say(); //�߻�޼ҵ�
	
}

class Dog extends Animal{
	void say() {
		//�������̵��
		System.out.println("�۸�!!");
	}
}


class Cat extends Animal{
	void say() {
		System.out.println("�߿�~");
	}
}

class Pig extends Animal{
	void say() {
		System.out.println("�ܲ�!!");
	}
}

class Duck extends Animal{

	@Override
	void say() {
		// TODO Auto-generated method stub
		
	}
	
}
