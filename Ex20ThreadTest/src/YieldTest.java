

public class YieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadAA t1=new ThreadAA();
		ThreadBB t2= new ThreadBB();
		
		t1.start();
		t2.start();
		
		//5초 후 A만 실행(B가 CPU사용 양보)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		t2.flag=false;
		t1.flag=true;
		
		//5초 뒤에 A,B둘 다 종료!!??
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		t1.isRun=false;
		t2.isRun=false;
	}

}//main 끝 



class ThreadAA extends Thread{
	
	boolean flag=true;
	boolean isRun=true;
	
	@Override
	public void run() {
		while(true) {
			if(flag) {
				System.out.println("AAThread running...");
			}else {
				Thread.yield(); //다른 스레드에게 CPU점유권 양보!! 
			}
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}//ThreadAA

class ThreadBB extends Thread{
	
	boolean flag=true;
	boolean isRun=true;
	

	@Override
	public void run() {
		while(true) {
			if(isRun) {
				System.out.println("AAThread running...");
			}else {
				Thread.yield(); //다른 스레드에게 CPU점유권 양보!! 
			}
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
	}
}//ThreadBB 
