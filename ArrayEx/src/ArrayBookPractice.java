import java.util.*;


public class ArrayBookPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p.186 RaggedArray
		final int MAX_ROWS = 5;
		
		int[][] ragged = new int[MAX_ROWS + 1][];
		for(int r =0; r <=MAX_ROWS; r++)
			ragged[r] = new int[r + 1];
		
		for(int r =0; r < ragged.length; r++)
			for(int c =0; c<ragged[r].length; c++) {
				ragged[r][c] = c;
			}
		
		for(int r=0; r < ragged.length; r++) {
			for(int c=0; c<ragged[r].length; c++)
				System.out.println(ragged[r][c] + " ");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		/*//p.174 2차원 배열에서의 length필드
		
		 * 
		int[][] array = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
		};
		
		for ( int r = 0; r < array.length; r++) {
			for(int c=0; c<array[r].length; c++) {
				System.out.println(r+"행"+c+"열:" + array[r][c]);
			}
		}
		*/
		
		
		
		//p.171 배열정렬
		
		/*final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			int r=(int) (Math.random() * 100);
			numbers[i]=r;
		}
		System.out.println("최초의 리스트: ");
		for (int r : numbers)
			System.out.println(r + " ");
		Arrays.sort(numbers);
		
		System.out.println("\n정렬된 리스트: ");
		for (int r : numbers)
			System.out.println(r + " ");*/
		
		
		
		//p.167 for each
		/*int[] numbers = {10,20,30};
		for(int t:numbers)
			System.out.println(t + " ");*/
		
		
		//p.165 극장예약서비스 ** 다시보기!! 익숙해지기!!! 유용할듯 
		
		/*final int size = 10;
		int[] seats = new int[size];
		
		while(true) {
			System.out.println("--------------------");
			for(int i=0; i<size; i++)
				System.out.println(i+1 + " ");
			System.out.println("\n--------------------");
			for(int i=0; i<size; i++)
				System.out.println(seats[i] + " ");
			System.out.println("\n--------------------");
			
			System.out.print("원하시는 좌석번호를 입력하세요.(종료는 -1): ");
			Scanner scan=new Scanner(System.in);
			int s = scan.nextInt();
			if(s == -1)
				break;
			if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("예약되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
			}
		}
		*/
		
		
		
		//p.163 주사위 던지기 (잘몰라!! 이해 안됐어!!)
		/*final int SIZE = 6;
		int freq[] = new int[SIZE];
		
		for(int i=0; i<10000; i++)
			++freq[(int) (Math.random() * SIZE)];
		
		System.out.println("=====================");
		System.out.println("면 빈도");
		System.out.println("=====================");
		
		for(int i=0; i<SIZE; i++)
			System.out.println("" + (i+1)+""+freq[i]);*/
		
		
		
		
		//p. 160 최소값 구하기
		/*int s[]= {12,3,19,6,18,8,12,4,1,19};
		int minimum;
		
		minimum=s[0];
		
		for(int i=1; i<s.length; i++) {
			if(s[i]<minimum)
				minimum=s[i];
		}
		System.out.println("최소값은" + minimum + "입니다.");*/
		
		
		
		//최대값 구하기 {}주의/ {}안에 있으면 결과값 반복해서 찍을 수 있어 
		
		/*int s1[]= {12,3,19,6,18,8,12,4,1,19};
		int max;
		
		max=s1[0];
		for(int i=1; i<s1.length; i++) {
			if(s1[i]>max) 
				max=s1[i];
		}
		System.out.println("최대값은"+max);
		*/
		
		
		//p.158 문자열 배열 String
		/*String[] toppings = {"Pepperoni", "Mushroom", "Onions", "Sausage", "Bacon"};
		
		for(int i=0; i<toppings.length; i++) {
			System.out.println(toppings[i]+" ");
		}*/
		
		
		
		//p.157 배열 초기화 new없어도 가능
		/*int[] scores = {10,20,30,40,50};
		for(int i=0; i<scores.length; i++)
			System.out.println(scores[i]+"");*/
		
		
		
		
		//p.155 배열 입력받아서 평균값 구하기
		/*final int STUDENTS = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];  //배열 객체 이제 만들어요~
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("성적을 입력하시오 : ");
			scores[i] = scan.nextInt();
		}
		for(int i=0; i < scores.length; i++)
			total += scores[i];
		
		System.out.println("평균 성적은"+total/STUDENTS + "입니다.");*/
	}
	}
		//p.154 배열 반복 for문
	/*	int[] s=new int[10];
		
		for(int i=0; i<s.length; i++) {
			s[i]=i;
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i] + " ");
		}
	}
}*/
