
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TThread t= new TThread();
		t.start(); //�ڵ����� run �޼ҵ� ����
		
		TThread t2= new TThread();
		t2.start(); //�ڵ����� run �޼ҵ� ����
		
		
		RThread r=new RThread();
		//������ trigger�� ������ �ʿ�
		Thread k=new Thread(r);
		k.start();//��� start()���ֱ�

	}

}


class RThread implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);//500ms, 0.5��
			} catch (InterruptedException e) {}
		
	}
	
}

}
class TThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);//500ms, 0.5��
			} catch (InterruptedException e) {}
		}
		
	}
}

