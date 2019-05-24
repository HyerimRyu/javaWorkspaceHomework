
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot=new Robot(); //캐릭터 만들고
		robot.attack(); //코드 진행
		robot.move();
		System.out.println();
		
		//날라다니는 로봇 갖고싶어!!!
		//즉, 로봇은 로봇인데 나는 기능이 추가된 로봇 갖고싶다고!!!
		
		//기존 Robot클래스에 나는 기능을 추가하면 기존 로봇이 변경됨.
		//그러므로 새로운 클래스를 만들어서 나는 기능 추가!!
		
		FlyRobot fr=new FlyRobot();
		fr.attack();
		fr.move();
		fr.fly();
		System.out.println();
		//이번에는 수영하는 로봇이 갖고싶다~
		//또 같은 작업 반복하는 클래스 만들고 수영기능을 추가해야돼!!!
		//이럴 때 자바의 <상속>개념을 사용하면 손쉽게 클래스 설계 가능! 
		
		SwimmimgRobot sr=new SwimmimgRobot();
		sr.name="aa";
		sr.HP=100;
		sr.attack();
		sr.move();
		sr.swimming();
		System.out.println();
		
		
		

	}

}
