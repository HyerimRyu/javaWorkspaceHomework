
public class Second extends First{
	
	private int b;
	int a=50; //������ Override������ ������ ����� ����
	
	public void show() {
		//super(); //super.show();�� ����!! ***�θ������ ������ ��! ���� constructor �����ڿ����� ��밡�� �ٸ����� ����!!
		//First�� a�� ��� ���������� : �������̵� ���ݾ�!!
		//System.out.println("a : "+ a); //a private �ݾ� ����!!
		//FirstŬ������ show()ȣ��!! 
		super.show();
		System.out.println("b : "+ b);
		
		
	}

}
