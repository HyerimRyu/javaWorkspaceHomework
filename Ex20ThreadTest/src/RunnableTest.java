
public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread�� ����� ����� 2������ �־�
		//1. Thread Ŭ������ ���(extends)�� Ŭ������ �����Ͽ� ����ϴ� ���
		//2. Runnable �������̽��� ����(implements : ����ϴ°Ŷ� ���� ��)�� Ŭ������ �����Ͽ� ���
		
		//�� 2���� ����� �����ұ�??
		//���� ����� ȿ���� ����;!!!!!!!!!!!!!??
		//PersonŬ������ �ɷ��� �����鼭 ���ÿ� �������� �ɷµ� ������ ��ü ����
		PersonThread pt = new PersonThread();
		
		//������ ������ start()�޼ҵ�� !! run()�� ���� ȣ�� �ȵ�!
		//run()�� ���� ȣ���ϸ� �װ� ������ �����尡 �ƴ� run()�� ȣ���� main�����尡 �����Ű�� ��Ȳ! 
		//pt.start(); //�Ұ�!! Runnable�� start()�޼ҵ尡 ����
		
		
		//Runnable��ü(pt)�� ��������ִ� ������ trigger�� Thread�� �ʿ���!!!!!!!!!!!!!!!
		Thread t=new Thread(pt); //�����ڿ� Runnable��ü ����
		t.start(); //���޹��� Runnable��ü�� start()�� ��� ����! 

	}

}

//Person�� ��� �ɷ��� �����鼭 Thread�� �ɷµ� �ִ� Ŭ������ ����� �;� 
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


