
public class Test {
	
	public int a; //������� -- �ν��Ͻ�(�޸𸮿� ������:new��) �� ��ü���� �����Ƿ� --> �ٸ����� : �ν��Ͻ� ����
	public static int b; //����(static) ������� -- Ŭ������ �ϳ� �����Ƿ�--> �ٸ����� : Ŭ��������
	double d;
	String s;
	static String nation;
	public static final int c=50;

	//������ �޼ҵ�
	public Test() {
		a=10;
		b=50;
	}
	
	public Test(int a, int b) {
		this.a=a;
		this.b=b;
	}

	
	//static������ �ǵ���
	//static �޼ҵ嵵 ������.
	static void show() {
		//static �޼ҵ� �ȿ�����....
		//System.out.println("������� a :" + a);//�ν��Ͻ� ���� ���Ұ�!
		System.out.println("Test show...");
	}
	
	//instance �޼ҵ�(�Ϲ� �޼ҵ�)
	void aaaa() {
		System.out.println("������� a : "+ a);
		System.out.println("������� b : "+ b);
	}
	
}
