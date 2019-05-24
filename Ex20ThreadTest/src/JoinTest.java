
public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JThread j=new JThread();
		j.start(); //5초 소요되는 작업 시작
		
		//j의 작업이 끝날때까지 다른 스레드들은 작업 멈췄으면 ->block
		try {
			j.join(); //쟤꺼에 조인했으니까 건들지마-> jThread의 run()작업이 끝날때까지 다른 스레드들은 모두 올스톱
		} catch (InterruptedException e1) {} 
		
		
		//join은 synchronized와 다름
		//synchronized는 같은 자원(객체)를 건드릴 때 블럭킹됨. 
		
		//join()은 같은 객체 사용이고 뭐고 상관없이 그냥 다 블럭킹!! join은 무대뽀로 기다려 
		
		
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
