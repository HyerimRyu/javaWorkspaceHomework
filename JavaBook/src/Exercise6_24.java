
public class Exercise6_24 {
	
	static int abs(int value) {
		//Absolute Value: 주어진 값의 절대값 반환
		int result=Math.abs(value);
		return result;
	}	
		public static void main(String[] args) {
			
			int value=5;
			System.out.println(value+"의 절대값:"+abs(value));
			value=-10;
			System.out.println(value+"의 절대값:"+abs(value));
		}
	
}
