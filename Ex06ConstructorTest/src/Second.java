
public class Second {
	
	int a;
	int b;
	
	//������ �޼ҵ�
	public Second() {
		//�ٸ� ������ ȣ�� ������!! 
		//Second(10,20); <--�̰� ���������� �ȵ�.
		this(10,20);
	}
	
	public Second(int a) {
		//System.out.println("aaa");//ERROR
//		this.a=a;
//		this.b=a;
		//this. ��� this()
		this(a,a); //ù��° ���๮���θ� ���� �տ� �ٸ���(ex.print) ������ �ȵ�. ��ü�� ���� �� ��� �����ؾ��� �Ʒ�ó��
		System.out.println("aaa");//ERROR
	}

	public Second(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	
	//�Ϲݸ޼ҵ�
	void aaa() {
		bbb();//�ٸ� �޼ҵ� ȣ�� ����!!
	}
	
	void bbb() {
		
	}
}
