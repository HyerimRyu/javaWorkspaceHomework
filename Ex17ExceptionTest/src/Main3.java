
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//코드를 통해 예외를 강제로 발동!!
		try {
			System.out.println("aaa");
			//억지로 예외발생!!-억지로 catch문으로 이동시키는 문법
			throw new Exception();
			
			//System.out.println("bbb"); : throw하면 이 코드가 실행될 수 없으므로 에러
			
			
		}catch(NullPointerException e) {
			System.out.println("null발생!!");
		}catch(Exception e) { //Exception이 최상위이기 때문에 얘가 맨 위에 있으면 에러, 이건 맨 마지막에 위치
			System.out.println("예외발생!!");
		}
		//[활동예]
		//메소드에 계산을 요청했을 때 절대 음수의 결과가 나오지 않았으면...
		//즉, 만약 음수가 나오면 예외상황이다라고 인지했으면 함!
		//Java언어에서 계산 결과가 음수라고 해서 예외라고 판단하는 알고리즘은 없음.
		int n;
		try {
			aaa(10,15);
		}catch(Exception e) {
			System.out.println("계산 결과가 음수입니다.");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	static int aaa(int a, int b) throws Exception{
		
		//음수가 나오는 상황일 때, 강제로 예외발생!!
		if(a<b) {
			throw new MyException("aaa"); //내가 만든 예외클래스 객체
		}
		//만약, throw가 되면 아래 있는 뺄셈작업은 수행하지 않음
		return a-b;
	}
	

}

//나만의 Exception만들기 
class MyException extends Exception{
	public MyException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
}
