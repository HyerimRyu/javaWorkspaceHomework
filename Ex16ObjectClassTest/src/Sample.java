
public class Sample {
	public Sample() {
		// TODO Auto-generated constructor stub
		System.out.println("Sample ����");
	}
	
	//��ü�� �Ҹ�� �� �ڵ����� 1�� ����Ǵ� �޼ҵ�
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("��ü�� �Ҹ�Ǿ����ϴ�.!! ");
	}

}
