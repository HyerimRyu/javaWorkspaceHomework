
public class Second extends First{ //First 상속
	
	int b;
	
	void showSecond() {
		System.out.println("show Second!!");
	}
	
	//Override
	void show() {
		System.out.println("Second show()메소드...");
		System.out.println();
	}

}
