
import java.util.Scanner;

public class IdChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		String data;
		
		while(true){
			System.out.print(" 입력값 : ");
			data= scanner.nextLine();
			
			//입력된 글자의 길이를 얻어오기
			int len= data.length();
			int sum=0; //각 자리수의 덧셈누적 값 저장용
			
			if( len < 16){
				
				//주민번호 판별 로직
				int k=2;
				for( int i=0; i< len-1 ; i++){ //마지막 자리는 연산에서 제외
					char ch= data.charAt(i);
					if( ch>='0' && ch<='9' ){
						sum += ( (ch-48)*k );
						k++;
						if(k>9) k=2;
					}					
				}
				
				int M = (11-(sum%11))%10;
				
				int m= data.charAt(len-1) - 48; //마지막 자리수의 문자값을 정수값으로 전환
				if( M == m ){
					System.out.println("... 주민번호가 맞습니다. \n");
				}else{
					System.out.println("... 개인정보가 아닙니다. \n");
				}
				
			}else{
				
				//카드번호 판별 로직
				
				int count=0; //data안에 있는 숫자의 개수를 카운팅 하기 위한 변수
				for( int i=0; i<len; i++){
					char ch= data.charAt(i);
					if( ch>='0' && ch<='9' ) count++;
				}
				
				//data안의 숫자의 개수가 16개면 카드번호가 맞는 것으로 인식
				if(count==16){
					System.out.println("... 카드번호가 맞습니다. \n");					
				}else{
					System.out.println("... 개인정보가 아닙니다. \n");
				}
					
			}
			
		}

	}

}
