
public class First {
	
	private int a;
	
	//��ü ������ �� �� �ڵ����� ����Ǵ� �޼ҵ� : ������ �޼ҵ�!! constructor �޼ҵ�
	public First() {
		System.out.println("First ��ü����!!");
	}
	
	//������ �޼ҵ� �����ε�
	public First(int a) {
		this.a=a;
		System.out.println("First ��ü int ����!!");
	}
	
	public void showFirst() {
		System.out.println("a : "+ a);
	}

}
