
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot=new Robot(); //ĳ���� �����
		robot.attack(); //�ڵ� ����
		robot.move();
		System.out.println();
		
		//����ٴϴ� �κ� ����;�!!!
		//��, �κ��� �κ��ε� ���� ����� �߰��� �κ� ����ʹٰ�!!!
		
		//���� RobotŬ������ ���� ����� �߰��ϸ� ���� �κ��� �����.
		//�׷��Ƿ� ���ο� Ŭ������ ���� ���� ��� �߰�!!
		
		FlyRobot fr=new FlyRobot();
		fr.attack();
		fr.move();
		fr.fly();
		System.out.println();
		//�̹����� �����ϴ� �κ��� ����ʹ�~
		//�� ���� �۾� �ݺ��ϴ� Ŭ���� ����� ��������� �߰��ؾߵ�!!!
		//�̷� �� �ڹ��� <���>������ ����ϸ� �ս��� Ŭ���� ���� ����! 
		
		SwimmimgRobot sr=new SwimmimgRobot();
		sr.name="aa";
		sr.HP=100;
		sr.attack();
		sr.move();
		sr.swimming();
		System.out.println();
		
		
		

	}

}
