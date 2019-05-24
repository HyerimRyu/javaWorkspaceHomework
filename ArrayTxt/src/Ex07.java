import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd= new Random();
		
		//2차원 배열 객체 생성
		int[][] arr= new int[5][5];
				
		int y,x; //y는 2차원 배열의 앞의 층번호, x는 뒤의 호실번호 		
		
		//6번문제 처럼 0~24의 인덱스 번호 반복
		for(int i=0; i<25; i++){
			
			int n= rnd.nextInt(25)+1; //1~25의 Random값 생성
			
			//1차원 배열의 인덱스번호 0~24로 된 i값을
			//2차원 배열의 인덱스번호로 변환..
			//ex) 0->0,0     1->0,1     2->0,2 ...... 5->1,0			
			y=i/5; //층 번호(2차원 배열의 앞 인덱스)
			x=i%5; //호실 번호(2차원 배열의 뒤 인덱스)
					
			arr[y][x]= n; //변환된 인덱스 번호를 이용해서 값 저장 
			
			//i번 인덱스의 배열요소에 대입된 랜덤값이
			//배열의 0번 부터 현재 i번째 이전의 값들중 같은 값이 있는지 체크
			for(int k=0; k<i; k++){
				
				//위와 같은 방식으로 k를 2차원 배열 인덱스로 변환.
				y= k/5;
				x= k%5;
				
				//6번문제와 같은 방식으로 중복값 비교 처리
				if( n == arr[y][x] ){
					i--;
					break;
				}
				
			}//제어변수 k로 제어되는 반복문
			
		}//제어변수 i로 제어되는 반복문
		
		
		//6번문제 처럼 2차원 배열의 값을 중첩반복문으로 출력
		for(int i=0; i<5; i++){			
			for(int j=0; j<5; j++){				
				System.out.printf( "%4d", arr[i][j] );
			}
			System.out.println();
		}

	}

}
