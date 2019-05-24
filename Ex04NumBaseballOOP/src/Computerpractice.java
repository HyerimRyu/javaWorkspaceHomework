import java.util.Random;

public class Computerpractice {
	
	//정답맞추기 멤버변수
	private int a100, a10, a1;
	
	//랜덤값
	public void Random() {
		Random rnd=new Random();
		
		while(true) {
		a100=rnd.nextInt(10);
		a10=rnd.nextInt(10);
		a1=rnd.nextInt(10);
		
		//중복체크
		if(a100!=a10 && a100!=a1 && a10!=a1)break;
		}//while
	}//random 
	
	
		
	}
	

