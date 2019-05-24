
public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread를 만드는 방법은 2가지가 있어
		//1. Thread 클래스를 상속(extends)한 클래스를 선언하여 사용하는 방법
		//2. Runnable 인터페이스를 구현(implements : 상속하는거랑 같은 말)한 클래스를 선언하여 사용
		
		//왜 2가지 방법이 존재할까??
		//다중 상속의 효과를 보고싶어서!!!!!!!!!!!!!??
		//Person클래스의 능력을 가지면서 동시에 스레드의 능력도 보유한 객체 생성
		PersonThread pt = new PersonThread();
		
		//스레드 실행은 start()메소드로 !! run()은 직접 호출 안돼!
		//run()을 직접 호출하면 그건 별도의 스레드가 아닌 run()을 호출한 main스레드가 실행시키는 상황! 
		//pt.start(); //불가!! Runnable은 start()메소드가 없음
		
		
		//Runnable객체(pt)를 실행시켜주는 별도의 trigger용 Thread가 필요해!!!!!!!!!!!!!!!
		Thread t=new Thread(pt); //생성자에 Runnable객체 전달
		t.start(); //전달받은 Runnable객체의 start()를 대신 해줌! 

	}

}

//Person의 멤버 능력을 가지면서 Thread의 능력도 있는 클래스를 만들고 싶어 
class PersonThread extends Person implements Runnable{

	@Override
	public void run() {
	 
		for(int i=0; i<5; i++) {
			System.out.println("name: "+ name +","+ "age :" + age);
			
			try {
				Thread.sleep(1000);
			}catch (Exception e) {} 
		}
		
	}
	
}

class Person{
	String name;
	int age;
}


