package mine;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int[] arr=new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("1-100이하의 정수 10개 써");
			int userInput=scan.nextInt();
			
			for(int j=0; j<10; j++) {
				if(userInput<(10*j)+1) {
					arr[j]++;  //배열에 카운트
					break;
			}	
			}	
		}//for
		
		for(int k=0; k<10; k++) {
			System.out.print(((k*10)+1)+"-"+((k*10)+10)+":");
			
			for(int h=0; h<arr[k]; h++) {
				System.out.print("*");
		}
		System.out.println();
		}
		
		
		
	}

}
