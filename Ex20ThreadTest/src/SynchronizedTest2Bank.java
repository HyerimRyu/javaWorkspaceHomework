
public class SynchronizedTest2Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���°�ü ����
		Account acc=new Account();
		
		//acc���¿� 100���� �ְ� ���� ��1
		TestThread t1=new TestThread(acc);
		
		//acc���¿� 100���� �ְ� ���� ��2
		TestThread t2=new TestThread(acc);
		
		//����� ������ �� �� 100�� �Ա� ��� ����! 
		t1.start();
		t2.start();
	}

}

//������� Ŭ����
class Account {
	int money=0;
	
	//�Աݱ��: ����ȭ ó���� �Ǿ����� ����. ���������� ���׹��� �� �� ����. 
	//����ȭ ó�� ��. 
	//���1. �޼ҵ� ��°�� ����ȭ ó�� 
	/*synchronized void add(int m) {
		System.out.println(Thread.currentThread().getName()+":"+"���� �ܾ�:"+money);
		money += m;
		System.out.println(Thread.currentThread().getName()+":"+"�Ա� �� �ܾ�:"+money);
		System.out.println();
	}
	*/
	//���2. ����ȭ �� �̿�
		void add(int m) {
			
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+":"+"���� �ܾ�:"+money);
				money += m;
				System.out.println(Thread.currentThread().getName()+":"+"�Ա� �� �ܾ�:"+money);
				System.out.println();
		}
	}
}

//������¿� �Ա��ϴ� ����� ���� ThreadŬ���� ����-> ���ÿ� �ϴ� �ý����� ����� ���� ������ ����
class TestThread extends Thread{
	Account acc;
	public TestThread(Account acc) {
		this.acc=acc;
	}
	
	@Override
	public void run() {
		acc.add(100);
	}
	
	
}

