
public class SyncronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MP3 mp3=new MP3();
		
		//별도의 Thread객체 생성 : MainThread와 동시 작업가능!! 
		MyThread t=new MyThread(mp3);
		t.start(); //run()메소드 실행! ->5초 소요
		
		mp3.play(); // Main Thread가 실행
		
		//이렇게 되면 동시에 1개의 Mp3를 건드리게 되어
		//사용이 뒤죽박죽
		//이를 해결하기 위해 하나의 Thread가 Play하고 있으면
		//다른 스레드가 play()를 또 호출해도 잠시 대기시키는 기법 필요!! 
		//동시에 실행되면 안되는 메소드(Play()메소드)에 동기화 처리-->synchronized처리를 함. 차례를 지켜줘요. 막들어오지마
		
	}

}

//음악플레이어 클래스 
class MP3{
	int musicNum=0;
	
	//동기화처리
	//방법1. 메소드를 통채로 동기화처리
	/*synchronized void play() {
		System.out.println(Thread.currentThread().getName()+"로부터 플레이 명령이 내려졌습니다.");
		
		//5초 동안 musicNum에 해당하는 음악파일 재생..
		musicNum++;
		for(int i=0; i<5; i++) {
			System.out.println(musicNum + "번 음악 재생중~~"+ Thread.currentThread().getName());
			
			//1초 대기 
			try {
				Thread.sleep(1000);//1000ms : 1초
			} catch (Exception e) {} 
		}
	}*/
	
	//방법2. 특정 코드 영역만 동기화(synchronized) 블럭 처리
	void play() {
		//이 코드는 동기화 처리가 되어있지 않음. 그러므로 기다리지 않음.
		System.out.println(Thread.currentThread().getName()+"로부터 플레이 명령이 내려졌습니다.");
		
		//이 부분만 동기화 블럭처리
		synchronized(this) {
			musicNum++;
			for(int i=0; i<5; i++) {
				System.out.println(musicNum + "번 음악 재생중~~"+ Thread.currentThread().getName());
				
				//1초 대기 
				try {
					Thread.sleep(1000);//1000ms : 1초
				} catch (Exception e) {} 
			}
		}
		//5초 동안 musicNum에 해당하는 음악파일 재생..
		
	}
}


//Mp3플레이어를 실행시키는 기능을 가진 Thread 클래스 선언
class MyThread extends Thread{
	MP3 mp3;
	
	public MyThread(MP3 mp3) {
		this.mp3=mp3;
	}
	
	@Override
	public void run() {
		if(mp3!=null) { //코드 안전하게 짜는게 중요
			mp3.play();
		}
	
		
	}
}
