

public class YieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadAA t1=new ThreadAA();
		ThreadBB t2= new ThreadBB();
		
		t1.start();
		t2.start();
		
		//5�� �� A�� ����(B�� CPU��� �纸)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		t2.flag=false;
		t1.flag=true;
		
		//5�� �ڿ� A,B�� �� ����!!??
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		t1.isRun=false;
		t2.isRun=false;
	}

}//main �� 



class ThreadAA extends Thread{
	
	boolean flag=true;
	boolean isRun=true;
	
	@Override
	public void run() {
		while(true) {
			if(flag) {
				System.out.println("AAThread running...");
			}else {
				Thread.yield(); //�ٸ� �����忡�� CPU������ �纸!! 
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
				Thread.yield(); //�ٸ� �����忡�� CPU������ �纸!! 
			}
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
	}
}//ThreadBB 
