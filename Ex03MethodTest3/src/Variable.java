
public class Variable {
	
	//멤버변수(Field) : 객체가 생성될 때!(new 될때) 메모리에 생성, 
	//멤버변수 기본값 존재0, 순서 상관없어, 어디서든 알아들어 like 전역변수
	//객체가 소멸될때!!(더이상 참조되지 않을때)변수 없어짐.
	int a;
	int b;
	
	int k;
	
	//메소드 안에 변수 선언
	void aaa() {
		//지역변수는 메소드가 호출될 때 만들어짐. 메소드가 종료되면 지역변수 제거
		int k;//지역변수
		
		System.out.println(a); //0
		//System.out.println(k); //ERROR 지역변수는 자동초기화 안되어있어 쓰레기..!!
		c=50; //순서 아래에 있는데 왜 가능? 멤버변수는 객체가 생성되면 생성되기 때문에!!
		      //멤버변수는 순서 상관없어!!
		
		bbb();//OK!위와 같은 이유로 Class안에서는 순서 상관 없어
	}
	
	int c; //메소드 사이에 멤버변수 선언! 
	
	//다른 메소드
	void bbb() {
		//멤버변수는 이 클래스 안에 어떤 메소드에서도 인식 가능!
		a=30;
		//aaa() 메소드의 지역변수 k는 다른 메소드에서는 인식불가능!!
		//k=30;//ERROR
		
		//멤버변수와 같은 이름을 가진 지역변수가 있을 수 있을까? OK!!
		int a;//지역변수
		a=50;
	}

//	파라미터(매개변수)는 지역변수의 일종
	void ccc(int x, int a) {//멤버변수와 같은 이름의 매개변수 가능함!!
		a=50; //지역변수 a를 의미함.
		
	}
	
	void ddd() {
//		k=50;
//		int k; //ERROR!! 프로그램은 순차적

		ddd(); //재귀호출: 가능!
		}
	
	int d;
}
