
//�߻�Ŭ����: �׳� ����ϴ� ���� �ƴ϶� �ݵ�� ����ؼ� ����ؾ���
public abstract class Test {
	
	int a; //�ν��Ͻ�����: �Ϲݺ���
	static int b=10; //static ����
	
	//������ �޼ҵ�-->�߻�Ŭ������ �ٷ� new�� �ȵɻ�, (��ӹ���)�ڽ��� ���ؼ� ��ü ���� �����ؿ�~
	public Test() {
		System.out.println("Test ������!!");
	}
	
	//�ν��Ͻ� �޼ҵ�
	void show() {
		System.out.println("show..");
	}
	
	//�߻�޼ҵ�
	abstract void aaa();
	//abstract void ccc();
	//abstract static void ddd(); //ERROR: abstract�� static�� ���ÿ� ��� �Ұ� 
	
	//static �޼ҵ�
	static void bbb() {
		System.out.println("static..."+b);
	}

}
