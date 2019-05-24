
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("String 배열길이 입력 : ");
		int num= s.nextInt();
		
		//입력된 수(num) 길이의 String형 배열객체 생성
		String[] arr= new String[num];
		
		for(int i=0; i<arr.length; i++){
			System.out.print("문자열 입력 : ");
			arr[i]= s.next();
		}
		
		//foreach문을 이용한 반복문
		for(String t: arr){
			System.out.println(t);
		}

	}

}
