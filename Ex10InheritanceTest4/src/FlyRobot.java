
public class FlyRobot extends Robot{
	
	//이미 attack();과 move();기능 있어!
	
	//이미 있는 어택기능 마음에 안들어!
	//기존 어택 메소드를 새로 다시 만들기
	//Overriding(오버라이딩) : 기존(상속받은) 메소드와 똑같은 메소드를 다시 정의
	void attack() {
		System.out.println("미사일 발사!!");
	}
	
	void move() {
		System.out.println("슝~~~~~~~~~~");
	}

	
	
	//fly만 추가하면 돼!
	void fly() {
		System.out.println("오~ 난다!!!");
	}
}
