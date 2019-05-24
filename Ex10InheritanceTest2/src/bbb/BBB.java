package bbb;
import aaa.AAA;

//package가 다를때import aaa.AAA해놔 안그러면 extends할 때 extends aaa.AAA이렇게 써야돼
public class BBB extends AAA{
	
	//이미 멤버변수 4개 존재. 상속받은 것들
	
	void show() { 
		//System.out.println(a); //private은 당연히 안돼지
		//System.out.println(b); //default라 패키지가 다르면 사용불가. 같은 패키지만 접근 가능
		System.out.println(c); //protected도 원래 같은 패키지만 되지만, 예외로 상속은 가능!
		System.out.println(d);
		
		
		
		
		
	}
	

}
