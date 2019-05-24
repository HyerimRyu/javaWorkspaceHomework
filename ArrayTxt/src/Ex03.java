import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		//1자리,10자리,20자리..90자리까지의 개수를 저장하기 위한 배열생성
		//0번 인덱스는 1자리의 개수, 1번 인덱스는 10자리의 개수...9번인덱스는 90자리의 개수
		int[] range= new int[10];
		
		for(int i=0; i<10; i++){
			System.out.print("1~100사이의 정수 입력 : ");
			int n= s.nextInt(); //정수 입력
			
			//n의 숫자 범위를 판별하기 위한 반복문////////
			for(int k=0; k<10; k++){
				//k가 0,1,2..반복할때 마다 10,20,30..보다 작은지 판별 
				if( n< ((k+1)*10) ){
					range[k]++; //해당 번째의 카운트값 증가
					break; //범위 판별을 종료
				}
			}///////////////////////////////////////			
		}
		System.out.println(Arrays.toString(range));
		//범위가 모두 판별되었다면 이를 *개수로 표시
		for(int i=0; i<10; i++){
			
			System.out.print( (10*i+1)+" - "+((i+1)*10)+ " : " ); //출력의 모양
			//range[]객체의 각 요소에 저장된 개수를 이용하여 *개수 표시
			for(int k=0; k<range[i]; k++){
				System.out.print("*");
			}
			
			//줄바꾸기
			System.out.println();			
		}

	}

}
