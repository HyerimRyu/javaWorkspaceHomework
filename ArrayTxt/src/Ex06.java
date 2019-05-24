import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Random값을 만들어 주는 객체 생성
		Random rnd= new Random();
		
		int[] arr= new int[25];		
		
		for(int i=0; i<25; i++){
			arr[i]= rnd.nextInt(25)+1; //1~25
			
			//i번 인덱스의 배열요소에 대입된 랜덤값이
			//배열의 0번 부터 현재 i번째 이전의 값들중 같은 값이 있는지 체크
			for(int j=0; j<i ;j++){
				
				if(arr[i]==arr[j]){//현재 i번째의 값과 이전 값들중 같은것이 있다면...
					i--; //반복을 하면 i변수가 자동으로 증가되므로 현재 i번째를 다시 하도록 미리 i값 감소
					break;
				}
			}			
		}
		
		int i=0;
		while(i<25){			
			//arr[i]안의 정수값을 출력하되 자리수와 상관없이 무조건 4칸씩 공간을 차지하도록 출력형식 지정
			System.out.printf("%4d", arr[i]);
			
			i++;//i값 증가
			//5번마다 줄바꿈(5의 배수마다)
			if(i%5==0) System.out.println();			
		}

	}

}
