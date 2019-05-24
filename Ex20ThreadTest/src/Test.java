
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TThread t= new TThread();
		t.start(); //자동으로 run 메소드 실행
		
		TThread t2= new TThread();
		t2.start(); //자동으로 run 메소드 실행
		
		
		RThread r=new RThread();
		//별도의 trigger용 스레드 필요
		Thread k=new Thread(r);
		k.start();//대신 start()해주기

	}

}


class RThread implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);//500ms, 0.5초
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
				Thread.sleep(500);//500ms, 0.5초
			} catch (InterruptedException e) {}
		}
		
	}
}

