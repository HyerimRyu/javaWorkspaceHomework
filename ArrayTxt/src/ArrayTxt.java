import java.util.Scanner;

public class ArrayTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seat=new int[10];
		
		System.out.println("좌석을 예약하시겠습니까 (1(Y) 또는 0(N)? ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		System.out.println("현재의 예약 상태는 다음과 같습니다.");
		System.out.println("------------------------------");
		System.out.println("좌석번호: 1  2  3  4  5  6  7  8  9  10");
		System.out.println("------------------------------");
		System.out.println("예약상태: 0  0  0  0  0  1  1  1  0  1");
		
		
		
		
		
	}//메인 끝
}//클래스 끝

		
		//문제 3번 ***배열 카운트 테러블
		/*Scanner scan=new Scanner(System.in);
		int[] num=new int[10];
		
		//1. 10번 입력
		for(int i=0; i<10; i++) {
			System.out.println("1-100까지 정수 입력");
			int a=scan.nextInt();
			
			 //2. 배열 카운트
			for(int j=0; j<10; j++) {	
			if((j*10)+1<=a && (j+1)*10>=a) num[j]++;
		  }
		}
		
		//3. 별찍기 출력
		for(int j=0; j<10; j++) {
			System.out.println(((10*j)+1)+"-"+((10*j)+10)+":");
			for(int k=0; k<num[j]; k++) System.out.print("*");
			System.out.print("\n");
		}//for문

			
		}//main

	}//class
*/		
/*		//문제2번 입력받은 값으로 평균 구하기
		
		Scanner scan=new Scanner(System.in);
		int a=0;
		System.out.println("학생의 수를 입력하시오 : " );
		a=scan.nextInt();
		int[] grade=new int[a];
		int sum=0;
		
		for(int i=0; i<a; i++) {
			System.out.println("학생" +(i+1)+ "의 성적을 입력하세요 : ");
			grade[i]=scan.nextInt();
			if(grade[i]>100) {
				System.out.println("잘못된 성적입니다. 다시 입력하세요");i--;continue;		
			}
			sum+=grade[i];
		}
			System.out.println("성적 평균은"+ sum/a+"입니다.");
		}
	}	*/
	
	
		//문제1. 배열 최대값 최소값 총합_배열 초기화, 조건식 비교대상 주의 
	/*	int[] arr=new int[5];
		
		Scanner scan=new Scanner(System.in);
		System.out.println("5개의 정수를 입력하시오");
		
		//배열에 값 저장
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=scan.nextInt();
		}
		
		int min, max, sum;
		
		//주의! 배열에서는 arr[0]으로 초기화
		min=arr[0];
		max=arr[0];
		sum=arr[0];
		
		//주의! 조건식에서 비교하는 대상인 1부터 시작 
		for(int j=1; j<arr.length; j++) {
			min=(arr[j]==min)? arr[j]:(arr[j]<min)?arr[j]:min;
			max=(arr[j]==max)? arr[j]:(arr[j]>max)?arr[j]:max;
		         sum +=arr[j]; 
		}
		
		System.out.println("최소값은"+ min +"입니다.");
        System.out.println("최대값은"+ max +"입니다.");
        System.out.println("총합은"+ sum +"입니다.");
	}

}*/
