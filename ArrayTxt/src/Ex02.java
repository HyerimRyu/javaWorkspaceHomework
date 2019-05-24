
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하세요 : ");
		int num= s.nextInt();
		
		//입력된 수(num) 길이의 int형 배열객체 생성
		int[] arr= new int[num];
		
		System.out.println();//한줄 띄기
		
		int sum=0;		
		for(int i=0; i<arr.length; i++){
			System.out.print("학생 "+(i+1)+"의 성적을 입력하세요 : ");
			arr[i]= s.nextInt();
			
			//입력된 점수가 0보다 작거나 100보다 크면 잘못입력으로 판단
			if(arr[i]<0 || arr[i]>100){
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
				i--; //반복문이 돌때마다 i값이 증가하므로 미리 i값을 1빼서 현재 번째를 다시 하도록 함.
				continue; //잘못 입력된 값이므로 아래의 sum연산을 하지 않도록 함.
			}
			
			sum+= arr[i]; //입력된 점수값들 누적
		}
		
		//평균값에 소숫점이 나오도록 형변환
		System.out.println("성적 평균은 "+ (double)(sum/num) +" 입니다.");
		
	}

}
