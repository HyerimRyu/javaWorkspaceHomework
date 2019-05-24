
public class BookPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new MyThread2();
		t.start();

	}

}

class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i=10; i>=0; i--)
			System.out.println(i + " ");
	}
}


