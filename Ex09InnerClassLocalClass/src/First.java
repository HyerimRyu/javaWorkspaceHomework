
public class First {
	
	int a=10;
	static int b=20;
	
	
	//static �̳�Ŭ����: �ƿ��� ��ü ���� ���� �ٸ� ������ ��ü���� ����
	//1. �̳�Ŭ���� �ƿ����� static ����� ������� �� �� ���� 
	public static class Hello{
		
		void show() {
			System.out.println("Hello...show");
//			a=20; //error;  //�ƿ����� �ν��Ͻ�����(�Ϲݺ���)�� ���Ұ�!
							//inner�� static�϶� �ƿ����� static�� ��밡��
			b=50; //static �� ����! 
		}
	}

}
