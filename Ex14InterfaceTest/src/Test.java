
//�������̽��� ���� ���: Ŭ������ �����ϴ� ����� ����
//�������̽��� ��ü ���� �Ұ� like �߻�Ŭ����~

public interface Test {
	
	//interface�� Ư¡��
	//1. �������̽� �ȿ����� �ν��Ͻ�, static ����, �ν��Ͻ� �޼ҵ带 ���� �� ����.
	
	//������� ���Ұ�!
//	int a;
//	static int b;
	
	//�ν��Ͻ� �޼ҵ� ����!!
//	void show() {
//		//ERROR
//	}
	
	//2. �������̽� �ȿ����� �߻�޼ҵ�, static�޼ҵ�, ����ʵ��public static final(���)�� ����
	
	//���������ڴ� ������ public: �Ƚᵵ �ڵ� public : ��? ���� ���� �ʿ����. ����� �����̾�~
	public abstract void aaa(); //�̸��� �ִ� �޼ҵ� �߻�޼ҵ�!
	void ddd(); //�ڵ� public abstract
	
	//static �޼ҵ�: JDK 1.8���� ���� ���� : �ڵ� public
	public static void bbb() {
		System.out.println("bbb");
	}
	
	//final ����ʵ� ��밡��
	public final int a=10; //�ڵ� static : �׳� static�ȵ� final �̶� ���� // �� public? �������̽��z ���� ������ Ÿ�� �����Ϸ��� �ϴ°Ŵϱ�~
	int b=20;//�ڵ� static final�� �Ǿ���! : ����� �ʱ�ȭ�� �Ǿ����� ����!! 
	
	//3. �������̽� �ȿ� �ִ� ����� ���� �ڵ� public��!!
//	private static final int c=50;
//	protected static final int d=50;
	
	
	//4. �������̽��� ���(method)������ �ϼ��� ���°� �ƴϱ⿡ �׳� ��� �Ұ�(�޸� leak). �ݵ�� ����� �����ؾ߸� ��밡��
	//5. �������̽��� ����Ϸ��� ���ο� Ŭ������ �����ϸ鼭 implementsŰ����� '����'�ؾ߸� �� (First, Second class����)
	//6. �������̽��� ������ ��Ӱ����̹Ƿ� UP casting����(���� ����)
	//7. �������̽��� ���߱���(���߻��)�� ������ // AAA, BBB �������̽�, SampleŬ���� (sample class����)
	//8. �������̽��� �ٸ� �������̽��� ��� ���� �� ����!  // KKK, SSS �������̽�  (Nice class����)
	//9. �������̽� �ȿ� �̳�Ŭ����(Inner class)�� �����ϸ� �ڵ� public static�� ��
	
	
	
	
	//�̳� Ŭ���� ����: �ڵ� public static : static ���� �ǹ�? �ƿ��� ���� ��ü ���� ����
	class Hello{
		void show() {
			System.out.println("Hello show...");
		}
	}
	
	

}//Test interface
