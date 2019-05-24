
public class FlyRobot {
	
	//이 로봇도 로봇이니.. 이름은 있어야 겠네!
	String name;
	int HP;
	int wing; // 추가된 변수 
	
	//로봇이 갖고 있는 기본 기능인 공격기능, 이동기능은 있어야겠지.  
	
	void attack() {
		System.out.println("주먹발사~~~");
	}

	void move() {
		System.out.println("아장아장....");
	}
	
	//추가로 나는 기능 
	void fly() {
		System.out.println("오~~난다!!! 나만 난다!!!");
	}

}
