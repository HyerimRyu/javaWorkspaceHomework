
public class Exercise6_24 {
	
	static int abs(int value) {
		//Absolute Value: �־��� ���� ���밪 ��ȯ
		int result=Math.abs(value);
		return result;
	}	
		public static void main(String[] args) {
			
			int value=5;
			System.out.println(value+"�� ���밪:"+abs(value));
			value=-10;
			System.out.println(value+"�� ���밪:"+abs(value));
		}
	
}
