import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����͸� �ϳ� ��������� �����Ͽ� ������ �ִ� Box ��ü
		Box box=new Box();
		
		box.setA(10);
		System.out.println(box.getA());
		
		Object obj=10;
		
		int a=10;
		//Integer n=new Integer(10);
		//Integer n=10; //�ڵ� Integer��ü ���� : AutoBoxing
		
		double k=3.14;
		//Double d=new Double(3.14);
		//Double d=3.14; //�ڵ� Double��ü�� ���� : AutoBoxing
		
		
		Boolean bool=new Boolean(true);
		Object o=new Boolean(false);
		
		int m=new Integer(10); //Integer->int�� ��ȯ �� �� Un Auto Boxing
		
		//���ɹڽ��� ���� ��ó�� ����. �Ϻ� �����Ҹ���
		//���� ������ �� �� ¥����!(�ٿ�ĳ�����̶� ��������� ����ȯ�� �ؾ߸� ��)
		box.setA(10);
		int n=(int)box.getA(); //�ٿ�ĳ�����̶� ����(Object->Integer->int)
		
		box.setA(3.14);
		double d=(double)box.getA();
		
		//Ŭ���� �� ���� �����ؼ� ���� �ڷ����� ��� �� ���� �� �ִ� ��ü������ ����� 
		Box2<String> box2=new Box2<String>();
		box2.a="aaa";
		
		Box2<Random> box3=new Box2<Random>();
		box3.a=new Random();
		
		//<>�ȿ� ���� �ڷ����� ���� �������� ����, ��. �⺻�� �ڷ����� ���Ұ�!! -> wrapper class�� ��������
		//Box2<int> Box4=new Box2<int>();
		
		//�̷� �� �⺻���� ���������� ���� WrapperŬ�������� �̿�
		Box2<Integer> Box4=new Box2<Integer>();
		//box4.a=10; //����ڽ�: �⺻��ó�� ����ص� ��!! 
		//int k=box4.getA(); //�����ڽ�
		
		Box3<String, Integer> box5=new Box3<String, Integer>();
		box5.a="Hello";
		box5.b=10;
		
		Box3<Integer, Random> box6=new Box3<Integer, Random>();
		box6.a=20;
		box6.b=new Random();
	}

}

//��Ƽ ���׸�
class Box3<T, K>{
	T a;
	K b;
}

//Generic ����ϱ� : ���赵���� ���� �� �ڷ����� �������� �ʰ� ����� �� �����ϵ���!! 
class Box2<T>{
	
	T a; //�������
	
	public T getA() {
		return a;
	}
	
}

class Box{
	//�����ڷ��� Object � ��ü�� ������ �� �ִ� �����������!!
	Object a;
	
	public void setA(Object a) {
		this.a = a;
	}
	
	public Object getA() {
		return a;
	}
	
}