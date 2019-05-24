
public class Second extends First{
	
	private int b;
	int a=50; //변수도 Override되지만 가급적 사용지 않음
	
	public void show() {
		//super(); //super.show();와 구분!! ***부모생성자 생성할 때! 내꺼 constructor 생성자에서만 사용가능 다른데선 못써!!
		//First의 a를 대신 출력해줘야지 : 오버라이딩 됐잖아!!
		//System.out.println("a : "+ a); //a private 잖아 에러!!
		//First클래스의 show()호출!! 
		super.show();
		System.out.println("b : "+ b);
		
		
	}

}
