
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���������� finalŰ���� ���̱�-> ���ȭ�� ����
		final int a = 10; 
		// a=20; //error : a�� ���� �Ұ�!
		
		//����������� final ����?!
		//Test Ŭ���� ����
		
		final int b;
		b=10; //ó���� ������ �ʱ�ȭ�� �������� ó��
		// b=30; //error
		
		//�޼ҵ忡�� finalŰ���� ���� ����!
		//Test Ŭ������ show()�޼ҵ� ����� final����! 
		Test t= new Test();
		t.show();
		
		
		//class�� final����: ��� �Ұ�!!
		//final Ŭ������ ����ϴ� ���� Ư���� ���� ����.
		//��, �� Ŭ������ ����� �� �� ����.
		//First ��ӹ޴� SecondŬ������ ����� ����!! 
		First f=new First();
		f.show();

	}

}
