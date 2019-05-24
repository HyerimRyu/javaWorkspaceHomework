
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot r=new Robot();
		r.attack();
		r.move();
		System.out.println();
		
		FlyRobot fr= new FlyRobot();
		fr.attack();
		fr.move();
		fr.fly();
		System.out.println();
		
		SwimmingRobot sr= new SwimmingRobot();
		sr.attack();
		sr.move();
		sr.swimming();
		System.out.println();

	}

}
