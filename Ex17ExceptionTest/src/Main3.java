
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ڵ带 ���� ���ܸ� ������ �ߵ�!!
		try {
			System.out.println("aaa");
			//������ ���ܹ߻�!!-������ catch������ �̵���Ű�� ����
			throw new Exception();
			
			//System.out.println("bbb"); : throw�ϸ� �� �ڵ尡 ����� �� �����Ƿ� ����
			
			
		}catch(NullPointerException e) {
			System.out.println("null�߻�!!");
		}catch(Exception e) { //Exception�� �ֻ����̱� ������ �갡 �� ���� ������ ����, �̰� �� �������� ��ġ
			System.out.println("���ܹ߻�!!");
		}
		//[Ȱ����]
		//�޼ҵ忡 ����� ��û���� �� ���� ������ ����� ������ �ʾ�����...
		//��, ���� ������ ������ ���ܻ�Ȳ�̴ٶ�� ���������� ��!
		//Java���� ��� ����� ������� �ؼ� ���ܶ�� �Ǵ��ϴ� �˰����� ����.
		int n;
		try {
			aaa(10,15);
		}catch(Exception e) {
			System.out.println("��� ����� �����Դϴ�.");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	static int aaa(int a, int b) throws Exception{
		
		//������ ������ ��Ȳ�� ��, ������ ���ܹ߻�!!
		if(a<b) {
			throw new MyException("aaa"); //���� ���� ����Ŭ���� ��ü
		}
		//����, throw�� �Ǹ� �Ʒ� �ִ� �����۾��� �������� ����
		return a-b;
	}
	

}

//������ Exception����� 
class MyException extends Exception{
	public MyException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
}
