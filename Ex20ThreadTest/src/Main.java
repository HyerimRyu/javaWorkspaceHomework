
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//동시에 했으면 하는 작업 2개 구현
		//예) 다운로드 하면서 음악 듣기 or 채팅하기...etc
		
		//아직 네트워크를 배우지 않았으니까 그냥 느낌만 살짝 맛보기~
		//20개 정도의 파일 다운로드 하는 작업
	/*	for(int i=0; i<20; i++) {
			System.out.println(i + "번 파일 다운로드중 ...");
			
			//강제로 잠시 대기
			for(int k=0; k<500000000L; k++) {
				
			}
		}
		System.out.println("파일 다운로드 완료!!");*/
		
		//20개 음악 재생하는 작업 느낌만 맛보자 
		/*for(int i=0; i<20; i++) {
			System.out.println(i+"번 음악 재생~");
			
			//강제로 잠시 대기
			for(int k=0; k<500000000L; k++) {
				
			}
		}
		System.out.println("음악재생 완료!! ");*/
		
		//위의 2개의 작업이 동시에 되면 더 빠르게 작업처리를 하겠죠?!
		//어떻게?! 직원 더 뽑아~ 분할업무!!! 
		//여기서 보통 일반적인 객체와 Thread를 혼동해!! 주의!!!!!!!!!!!
		//객체를 따로 만든다고 해서 새로운 직원이 생기는 것이 아니야! 
		
		
		//서로 다른 객체에 기능을 실행시킴
		//얘네 안돼안돼 동시에 실행시키는거 아니야~ 객체가 2마리일 뿐 실제로는 메인 스레드가 혼자 한거야
//		WorkerA workerA=new WorkerA();
//		workerA.work();
//		
//		WorkerB workerB=new WorkerB();
//		workerB.work();
		
		//진짜 사장(메인 스레드)말고, 직원 스레드 객체를 만들어야 동시 작업 가능해 어떻게?! 
		//Thread능력 하사받기-->Thread클래스 상속!! 
		//즉, 일반 클래스가 아니라 Thread를 상속한 클래스를 객체로 만들어서 사용! 
		
		
		//다운로드 작업 <- 별도의 Thread객체에게 작업 맡기기
		ThreadA a=new ThreadA(); // 직원채용
		a.start();//작업 시작 요청(Thread객체에 run()메소드가 자동으로 실행)
		
		//음악재생작업 <- 별도의 Thread객체에게 작업 맡기기
		ThreadB b= new ThreadB();
		b.start();
		
		
		//Thread의 우선권(CPU 점유시간) 순위부여 가능(0~10단계)(낮음-높음)
		a.setPriority(1);//낮음
		b.setPriority(10);//높음
		
		
		//Thread.sleep()을 하면 우선순위가 무의미해짐
		//반복횟수가 너무 적으면 우선순위가 별 의미가 없음
		//작업에 소요되는 시간이 짧으면 우선순위가 의미없어
		//반복 횟수 좀 길게!! ... 20 -->2000번 
		//Main Thread는 기본 우선순위(5)로 지정되어 있어
		
		
		//MainThread도 Thread이므로 위의 a,b작업자(Thread)와 동시에 별개의 작업 가능.
		for(int k=100; k<120; k++) {
			//현재 이 코드를 실행시키는 스레드가 누구인지?
			Thread t=Thread.currentThread();
			String name=t.getName();
			System.out.println(name+":"+k);
			
		/*	try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		System.out.println("Main Thread종료!!!");
		
		
		
	}

}

//파일 다운로드를 하는 클래스(Thread 상속받어)
class ThreadA extends Thread{
	//모든 Thread클래스의 작업이 이 메소드 안에서 작성해야만 해. 
	//Thread클래스에 있는 run()메소드를 오버라이드해서 사용해야해
	@Override
	public void run() {
		//20개 정도의 파일 다운로드 하는 작업
				for(int i=0; i<20; i++) {
				String name=Thread.currentThread().getName();
				System.out.println(name + ":" + i + "번 파일 다운로드중 ...");
							
				/*//강제로 잠시 대기(0.5초: 500ms 대기)
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				}
				System.out.println("파일 다운로드 완료!!");
	}
	
}



//음악 재생 클래스(Thread상속받은)
class ThreadB extends Thread{
	@Override
	public void run() {
		//20개 음악 재생하는 작업 느낌만 맛보자 
				for(int i=0; i<20; i++) {
				String name=Thread.currentThread().getName();
				System.out.println(name + ":" + i + "번 음악 재생~");
							
				/*//강제로 잠시 대기
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			  }
			   System.out.println("음악재생 완료!! ");
		
	}
}




//파일을 다운로드하는 클래스 
class WorkerA{
	void work() {
		//20개 정도의 파일 다운로드 하는 작업
		for(int i=0; i<20; i++) {
		System.out.println(i + "번 파일 다운로드중 ...");
					
		//강제로 잠시 대기
		for(int k=0; k<500000000L; k++) {
						
		    }
		}
		System.out.println("파일 다운로드 완료!!");
		
	}
}

//음악을 재생하는 클래스
class WorkerB{
	void work() {
		//20개 음악 재생하는 작업 느낌만 맛보자 
		for(int i=0; i<20; i++) {
		System.out.println(i+"번 음악 재생~");
					
		//강제로 잠시 대기
		for(int k=0; k<500000000L; k++) {
						
		  }
	  }
	   System.out.println("음악재생 완료!! ");
		
	}
}
