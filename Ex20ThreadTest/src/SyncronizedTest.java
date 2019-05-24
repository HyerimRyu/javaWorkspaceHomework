
public class SyncronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MP3 mp3=new MP3();
		
		//������ Thread��ü ���� : MainThread�� ���� �۾�����!! 
		MyThread t=new MyThread(mp3);
		t.start(); //run()�޼ҵ� ����! ->5�� �ҿ�
		
		mp3.play(); // Main Thread�� ����
		
		//�̷��� �Ǹ� ���ÿ� 1���� Mp3�� �ǵ帮�� �Ǿ�
		//����� ���׹���
		//�̸� �ذ��ϱ� ���� �ϳ��� Thread�� Play�ϰ� ������
		//�ٸ� �����尡 play()�� �� ȣ���ص� ��� ����Ű�� ��� �ʿ�!! 
		//���ÿ� ����Ǹ� �ȵǴ� �޼ҵ�(Play()�޼ҵ�)�� ����ȭ ó��-->synchronizedó���� ��. ���ʸ� �������. ����������
		
	}

}

//�����÷��̾� Ŭ���� 
class MP3{
	int musicNum=0;
	
	//����ȭó��
	//���1. �޼ҵ带 ��ä�� ����ȭó��
	/*synchronized void play() {
		System.out.println(Thread.currentThread().getName()+"�κ��� �÷��� ����� ���������ϴ�.");
		
		//5�� ���� musicNum�� �ش��ϴ� �������� ���..
		musicNum++;
		for(int i=0; i<5; i++) {
			System.out.println(musicNum + "�� ���� �����~~"+ Thread.currentThread().getName());
			
			//1�� ��� 
			try {
				Thread.sleep(1000);//1000ms : 1��
			} catch (Exception e) {} 
		}
	}*/
	
	//���2. Ư�� �ڵ� ������ ����ȭ(synchronized) �� ó��
	void play() {
		//�� �ڵ�� ����ȭ ó���� �Ǿ����� ����. �׷��Ƿ� ��ٸ��� ����.
		System.out.println(Thread.currentThread().getName()+"�κ��� �÷��� ����� ���������ϴ�.");
		
		//�� �κи� ����ȭ ��ó��
		synchronized(this) {
			musicNum++;
			for(int i=0; i<5; i++) {
				System.out.println(musicNum + "�� ���� �����~~"+ Thread.currentThread().getName());
				
				//1�� ��� 
				try {
					Thread.sleep(1000);//1000ms : 1��
				} catch (Exception e) {} 
			}
		}
		//5�� ���� musicNum�� �ش��ϴ� �������� ���..
		
	}
}


//Mp3�÷��̾ �����Ű�� ����� ���� Thread Ŭ���� ����
class MyThread extends Thread{
	MP3 mp3;
	
	public MyThread(MP3 mp3) {
		this.mp3=mp3;
	}
	
	@Override
	public void run() {
		if(mp3!=null) { //�ڵ� �����ϰ� ¥�°� �߿�
			mp3.play();
		}
	
		
	}
}
