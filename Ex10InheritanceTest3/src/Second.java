
public class Second extends First{
	
	private int b;
	
	//������ �޼ҵ�
	public Second() {
		//super(); �����ڸ� ȣ���ߴ�!!(First)�����ڸ� ȣ���ߴ�!! 
		System.out.println("Second ��ü����!!");
	}
	
	//������ �����ε�
	public Second(int a, int b) {
		//First(); �����ڸ� ȣ���ߴ�!!
		
		//super.a=a; ����!!!!!!!!!!
		super(a); //First(�θ� Ŭ����) ������ ����� ȣ��
		//super()������ ȣ���� �ݵ�� ù��° �������� �־�� ��!!!
		this.b=b;
		System.out.println("Second ��ü���� int, int����");
	}
	
	
	
	public void showSecond() {
		System.out.println("b : "+ b);
	}
	
	public void show() {
		//System.out.println("a : "+ a); //First a�� private ������! First�� ���� �ִ� �Լ� ȣ�� ���� ����
		showFirst(); 
		System.out.println("b : "+ b);
		System.out.println();
	}

}
