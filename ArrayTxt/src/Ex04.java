import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		int[] seat=new int[10];
		
		//일단 좌석입력을 무한반복 
		while(true){
			System.out.print("좌석을 예약하시겠습니까(1(Y) 또는 0(N)? ");
			int a= s.nextInt();
			if(a==0){//예약 종료
				System.out.println("예약을 종료합니다.");
				break;//무한 반복문 종료
			}
			
			//0이 아니면 종료가 안되었으므로 예약작업수행(0이 아니면 모두 Yes로 판단할 것임)
			System.out.println("현재의 예약 상태는 다음과 같습니다.          ");
			System.out.println("---------------------------------------");
			System.out.println("좌석번호 : 1  2  3  4  5  6  7  8  9  10 ");
			System.out.println("---------------------------------------");
			System.out.print("예약상태 : ");
			for(int t : seat)
				System.out.print( t +"  ");
			System.out.println();
			System.out.println();
			
			int n;//좌석 번호
			while(true){
				System.out.print("몇번째 좌석을 예약하시겠습니까? ");
				n= s.nextInt();
				
				//좌석이 비어있다면 좌석번호 입력 종료.
				if(seat[n-1]==0) break;
				
				//break가 안되었다면. 이미 예약된 좌석이므로 다시 입력토록 함
				System.out.println("죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요.\n");				
			}
			
			//여기까지 왔다면 비어있는 좌석을 선택한 상태임.
			seat[n-1]=1; //해당 좌석번호의 배열인덱스이 1값 대입
			System.out.println(n+"번 좌석 예약되었습니다. \n");
		}

	}

}
