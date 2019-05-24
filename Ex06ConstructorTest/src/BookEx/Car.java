package BookEx;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	//여기 주의!!
	private int id;
	static int numbers=0;
	
	public Car(String m, String c, int s) {
		model=m;
		color=c;
		speed=s;
		//자동차 개수 증가하고 id에 대입
		id=++numbers;
	}

}
