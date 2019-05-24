
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		//3개층을 가진 2차원 배열객체 생성
		//각 층의 호실수를 아직 미정
		int[][] arr=new int[3][];
		
		int studentNum=0;//전체 학생수
		
		//2차원 배열 arr의 길이(lenth : 3)만큼 반복
		for(int i=0; i<arr.length; i++){
			//먼저 해당 반의 인원수 입력
			System.out.print("["+(i+1)+"반] 인원수 입력 : ");			
			int num= s.nextInt();
			//입력된 인원수(num)만큼의 1차원 배열 객체 생성
			//생성된 1차원 배열객체를 2차원 배열객체의 3개의 참조변수에 차례로 대입
			arr[i]= new int[num];
			
			//천체 학생수에 학생수 누적
			studentNum+=num;
			
			//입력된 학생 수(num) 만큼 점수 입력
			for(int k=0; k<num; k++){
				System.out.print( "["+(i+1)+"반 "+(k+1)+"번] : ");
				arr[i][k]= s.nextInt();
			}
			
			System.out.println();			
		}
		
		//모든 입력이 끝났으므로 배열 값 출력
		System.out.println("---Java Programming 성적표----");
		
		int total=0; //천체 평균용		
		double max=0; //최우수반 검증용
		int maxBan=1; //최우수반 번호(기본 1반)
		for(int i=0; i<arr.length; i++){//3번 반복
			
			System.out.print("["+(i+1)+"반]"); //출력형태
			
			int sum=0; //평균 계산을 위한 합계누적용 변수
			for(int k=0; k<arr[i].length; k++){//각 반의 학생수 만큼 반복
				System.out.print( arr[i][k]+" ");
				sum+=arr[i][k]; //(i+1)반 학생 점수 누적
				total+=arr[i][k]; //전체 평균용 총점 누적
			}
			
			//평균 : 총점/학생수
			double aver= (double)sum/(double)arr[i].length;
			System.out.println("[평균 : "+ aver+"]");
						
			//최 우수반 검증
			if(aver>max){
				max=aver;
				maxBan=(i+1);
			}
		}
		
		System.out.println("-----------------------------");
		
		//전체 평균 : 전체 학생 총점/전체 학생수
		float total_aver= (float)total/studentNum;
		
		// %.2f => 소수점 밑으로 2자리까지 실수값을 출력해라.(반올림됨)
		System.out.printf("전체평균 : %.2f \n", total_aver);
		
		System.out.println("최 우수반["+maxBan+"]");		

	}

}
