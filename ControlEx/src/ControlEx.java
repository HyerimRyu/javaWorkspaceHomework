import java.util.Random;
import java.util.Scanner;

public class ControlEx {
	public static void main(String[]args) {
		
	}
	
	
}//class끝


/*//메모 4번 
	public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	
	int a=input.nextInt();
	
	for(int i=9; i>0; i--){
		System.out.println(a+"*"+i+"="+a*i);
	}
	}

*/
//메모3번 다시 풀기 카운트..!!! 합계!!!
	/*public static void main(String[]args) {
		
		while(true) {
			
			Scanner input=new Scanner(System.in);
			int userInput=input.nextInt();
		
			int count=0;
			for(int i=0; i<count; i++) {
				
				int sum=0;
				sum=sum+userInput;
		
			
			if(userInput==0) {
				
				System.out.println("사용자 입력값 합계: "+sum);
				break;
			}
			
			}
		}
	}
	
}//class끝
*/
//메모2 for문 반복 횟수 범위 설정 주의 
	/*public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		for(int i=3; i<=a; i+=3) {
			for(int j=1; j<=a; j++) {
				System.out.print(i*j+"\n");
			}
			
		}
		
	}
	

*/

//메모1 제어문 
	/*public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		for(int i=0;i<a; i++) {
			System.out.println("Hello World!");
		}
	}
	

*/
//메모 4번 합계 평균 최대갑 최소값
	/*public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int userInput1=scan.nextInt();
		int userInput2=scan.nextInt();
		int userInput3=scan.nextInt();
		
		int sum=0;
		sum=userInput1+userInput2+userInput3;
		
		int average=0;
		average=userInput1+userInput2+userInput3/3;
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+average);
		
		//최대값
		int max=0;
		
		if(userInput1>=userInput2&&userInput1>=userInput3) {
			max=userInput1;
		}else if(userInput2 >=userInput1&&userInput2>=userInput3) {
			max=userInput2;
		}
		else {
			max=userInput3;
		}
		System.out.println("최대감:"+max);
		
		
		//최소값
		int min=0;
		if(userInput1<=userInput2&&userInput1<=userInput3) {
			min=userInput1;
		}else if(userInput2 <=userInput1&&userInput2<=userInput3) {
			min=userInput2;
		}
		else {
			min=userInput3;
		}
		System.out.println("최소감:"+min);
	}*/
	
	


	
	//메모3번 절대값 출력
	/*public static void main(String[]args) {
		
		Scanner userInput=new Scanner(System.in);
		int absolute=userInput.nextInt();
		absolute=(absolute<0? -absolute:absolute);
		System.out.println("절대값 출력:"+absolute);
	}
	
	*/
	
	



	//메모2번 직사각형 넓이 구하기
	/*public static void main(String[] args) {
		
		System.out.println("두 점의 좌표 x,y를 입력하시오");
		
		Scanner scan=new Scanner(System.in);
		
		int inputX=scan.nextInt();
		int inputY=scan.nextInt();
		int inputXx=scan.nextInt();
		int inputYy=scan.nextInt();
		
		int result=0;
		result=inputX*inputY;
		
		System.out.println("좌 상단의 x좌표: "+inputX);
		System.out.println("좌 상단의 y좌표: "+inputY);
		System.out.println("우 상단의 x좌표: "+inputXx);
		System.out.println("우 상단의 x좌표: "+inputYy);
		
		System.out.println("두 점이 이루는 직사각형의 넓이는 "+result);
		*/


		
		
	
	
	
	//연습문제 1번 입 출력
	/*public static void main(String[]args) {
		
	int getMoney;
	int price=7500;
	int tax=price/10;
	int rest=0;
	
	
	Scanner pay=new Scanner(System.in);
	getMoney=pay.nextInt();
	rest=getMoney-price-tax;
	
	System.out.println("받은돈: " + getMoney);
	System.out.println("상품가격: " + price);
	System.out.println("부가세: " + tax);
	System.out.println("잔돈: " + rest);
	*/
	
	
	
	/*
	public static void main(String[] args) {
		int answer=59;
		int guess;
		Scanner sc=new Scanner(System.in);
		int tries = 0;
		
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess =sc.nextInt();
			tries++;
			
			if(guess>answer)
				System.out.println("제시한 정수가 높습니다.");
			if (guess < answer)
				System.out.println("제시한 정수가 낮습니다.");
		}while(guess !=answer);
		
		System.out.println("축하합니다. 시도횟수=" + tries);*/
	

		
	
	//랜덤값 난수합 구하기
/*	
	public static void main(String[] args) {
		Random generator=new Random();
		
		System.out.print("난수의 개수: ");
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int sum=0;
		
		for(int i=0; i<count; i++) {
			int number=generator.nextInt(100);
			sum+= number;
		}
		System.out.print("난수"+count+"개의 합은"+sum);*/
	

	
	
	//RANDOM 랜덤값 맞추기
/*	public static void main(String[]args) {
		//랜덤값을 만들어 주는 아저씨(Random객체)생성
		Random rnd = new Random(); //이름이 없어서 이름은 참조변수로 줘야해 
		
		int r=rnd.nextInt(10); //0~9
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("input : ");
			int user = scan.nextInt();
			
			if(user>r) System.out.println(user + "보다 작습니다.");
			else if(user < r) System.out.println(user + "보다 큽니다.");
			else {
				System.out.println("정답입니다.");
				break;
		}
		}//while
		
		}
		*/
		


	//String에서 n의 값 구하기
	/*
	public static void main(String[] args) {
		
		String s="no news is good news";
		int n=0;
		
		for(int i=0; i<s.length(); i++) {
			//n이 나오는 횟수 셈
			if(s.charAt(i) != 'n')continue;
			
			n++;
		}
		System.out.println("문장에서 발견된 n의 개수"+n);
		
	}*/
	
	
	//평균값
	/*public static void main(String[] args) {
		int total=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("점수를 입력하시오: ");
			int grade=scan.nextInt();
			if(grade<0)
				break;
			
			total += grade;
			count++;
		}
		System.out.println("평균은 "+ total/count);
	}*/
	
	
	
	//별찍기 for문 중첩
	/*public static void main(String[] args) {
		for(int y=0; y<5; y++) {
			for(int x=0; x<10; x++)
				System.out.print("*");
			System.out.println("");
		}
	}*/
	
	
	//입력받은 값의 팩토리얼 구하기
/*	public static void main(String[] args) {
		long fact =1;
		int n;
		
		System.out.println("정수를 입력하시오");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		System.out.printf("%d!은 %d 입니다.", n, fact);
		}
	}
	*/
	
	
	
	//1~10까지 더하기
	/*public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println("합계="+sum);
	}
	*/
	
	
	//입력받은 구구단 출력 
	/*public static void main(String[] args) {
		int n;
		int i=1;
		System.out.print("원하는 구구단 단 적어");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		while(i<=9) {
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
	}*/
	
	
	/* while문 반복 i++;주의
	 * public static void main(String[] args) {
		int i=0;
		while(i<5) {
			System.out.println("환영합니다.");
			i++;
		}
		System.out.println("반복이 종료되었습니다.");
	}*/
	

	//성과급 계산
	/*public static void main(String args[]) {
		final int targetSales=1000;
		int mySales;
		int bonus;
		String result;
		
		Scanner input=new Scanner(System.in);
		System.out.print("실적을 입력하시오. (단위:만원); ");
		mySales=input.nextInt();
		
		if(mySales >= targetSales) {
			result="실적달성";
			bonus=(mySales-targetSales)/10;
		} else {
			result = "실적달성 못함";
			bonus=0;
		}
		System.out.println(result+"\n"+"보너스"+bonus);
	}
	*/
	
	
	/* 입력받은 두 수 중 최대값max 구하기
	public static void main(String[] args) {
		int x,y,max;
		Scanner input=new Scanner(System.in);
				System.out.print("첫 번째 정수: ");
				x=input.nextInt();
				
				System.out.print("두 번째 정수");
				y=input.nextInt();
				
				//조건식 시작
				if (x>y)
					max=x;
				else
					max=y;
				
				System.out.println("큰 수는 " + max);
	}
	*/
	
	/* 입력받은 값 홀수짝수 구분	
	public static void main(String[] args) {
		
		//if문을 사용하여 홀수와 짝수 구분
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = input.nextInt();
		
		//조건 시작
		if(number %2 ==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println("프로그램 종료");
	
	}
	*/
	
	
	/* 수업 내용
	public static void main(String[] args) {
		
		int a=-8;
		System.out.println(a>>>2); 
		
		
		//switch문
		//boolean b=true;//error
		char b='가';//error
		
		//가능한것: byte, short, char, int, String
		
		
		switch(b) {
		case '가':
			System.out.println(5);;
			break;
		case '나':
			System.out.println(10);
		}
		
		//특정 위치로의 break, continue
		for(int i=0; i<5; i++){
			for(int k=0; k<10; k++) {
				if(k==5) break;
				System.out.println(i+","+k);
			}
			System.out.println();
		}
		
		//이런표현이 가능한가?
		for(int k=0, n=10; k<5; k++, n--, a+=10) {
		
	}*/


