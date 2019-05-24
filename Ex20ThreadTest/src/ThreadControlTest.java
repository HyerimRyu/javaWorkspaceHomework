
public class ThreadControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CThread t=new CThread();
		t.start();
		
		//3초 후에 일시정지(pause) - wait()메소드 이용!
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		
		
		t.pauseThread();
		
		
		//3초 후에 이어서 진행(resume) - notify()메소드 이용! 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		t.resumeThread();
	
		
		
		//3초 후에 퇴근(Thread 종료)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//run()종료 시키는 명령-->stop!!!!!!!
		//t.stop(); //deprecate 된 메소드: 가급적 쓰지마~~강제종료돼서 작업 마무리가 안 된 상태에서 갑자기 멈출 수 있어 
		//t.isRun=false;
		//객체의 멤버값은 그 객체가 직접하도록 하는 것이 OOP의 기본원칙! 
		t.stopThread();
		
		System.out.println("main종료: 퇴근! 수고했오");

	}

}//main


class CThread extends Thread{ //스레드는 일회용 그래서 반복문 많이 돌려 무한히 
	
	private boolean isRun=true;
	private boolean isWait=false;
	
	@Override
	public void run() {
		//타이어 4개 조립하는 작업
		while(isRun) {
			System.out.println("1번 타이어 조립");
			System.out.println("2번 타이어 조립");
			System.out.println("3번 타이어 조립");
			System.out.println("4번 타이어 조립");
			System.out.println();
			
			if(isWait) {//wait();  혹시 isWait이 wait이면 wait해
				try {
					synchronized (this) {
						wait(); //wait의 디자인패턴 : 혹시 isWait이면 wait해
					}
				} catch (InterruptedException e1) {}
				
			}
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}//while
		System.out.println("퇴근!!");
		
	}//run method 
	
	//isRun 변수의 값을 변경하는 메소드 
	public void stopThread() {
		isRun=false;
		synchronized (this) {
			this.notify();
		}
	}
	
	//isWait을 true로 변경하는 메소드
	//일시정지하는 메소드
	public void pauseThread() {
		isWait = true;
	}
	
	//이어하기 메소드
	public void resumeThread() {
		isWait=false; //이걸 바꿔놔야 다시 wait되지 않음
		synchronized (this) {
			this.notify();
		}
		
	}
	
	
}//CThread class






