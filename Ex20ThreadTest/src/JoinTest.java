
public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JThread j=new JThread();
		j.start(); //5�� �ҿ�Ǵ� �۾� ����
		
		//j�� �۾��� ���������� �ٸ� ��������� �۾� �������� ->block
		try {
			j.join(); //������ ���������ϱ� �ǵ�����-> jThread�� run()�۾��� ���������� �ٸ� ��������� ��� �ý���
		} catch (InterruptedException e1) {} 
		
		
		//join�� synchronized�� �ٸ�
		//synchronized�� ���� �ڿ�(��ü)�� �ǵ帱 �� ��ŷ��. 
		
		//join()�� ���� ��ü ����̰� ���� ������� �׳� �� ��ŷ!! join�� ����Ƿ� ��ٷ� 
		
		
		for(int i=0; i<10; i++) {
			System.out.println("main...");
			try {Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		

	}

}

class JThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("aaa");
			
			try {Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
