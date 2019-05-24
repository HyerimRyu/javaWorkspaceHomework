import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int형 3칸짜리 배열객체 생성
		int[] arr = new int[3]; //가장 많이 사용, 올바른 표현
		
		/*int [] arr2 = new int[3]; //ok
		int arr3[]= new int[3]; //ok
		
		int[] arr;//int형 배열 참조변수
		arr4= new int[3]; //가능
		arr4 = arr2; //가능
*/		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);

		//배열 요소에 값 대입
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		//for문 범위 내가 세지말고, length써~!
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//배열의 초기화
		int[] arr2=new int[] {10,20,30};
		
		//ERROR 배열 초기화 할 때 배열 갯수 쓰면 에러야!!!!!!!!너가 실수할 수도 있잖아!!!실수할 여지 노노!!!!
		// int[] arr2=new int[3] {10,20,30}; 
		
		//ERROR!!! 방 갯수 없는건 초기화 할때만 가능해 
		// int[] arr3=new int[];
		
		//초기화의 약식 표기법
		int[] arr3= {10,20,30}; //자동 new int[]  
		
		
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" , ");
		}
		System.out.println();
		
		
		//초기화에 들어갈 값으로 변수를 줄 수 있는가?
		final int n=10;
		int[] arr4 = new int[] {n, n+1, n+2};
		
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" , ");
		}
		System.out.println();
		
		//배열의 길이(요소 개수) 변수로 지정 가능함
		Scanner scan=new Scanner(System.in);
		
		// int k=scan.nextInt();  스캔받아서 가능
		int k=5;
		int[] arr5 = new int[k];
		
		for(int i=0; i<arr5.length; i++) {
			System.out.print(arr5[i]+" , ");
		}
		System.out.println();
		
		
		//배열 참조변수에 개수 명시 불가!
		//int[] arr7;  ERROR!!!  C언어가 아니야!!
		
		
		//배열 참조변수 끼리의 대입
		double[] arr7 = new double[] {1.1, 2.2, 3.3};
		double[] arr8=arr7; //같은 배열 객체 공유
		//double[] arr9=arr8+arr7; ERROR!!!!!!!!!! 주소 연산이라 안돼!!
		
		for(int i=0; i<arr7.length; i++) {
			System.out.print(arr7[i]+", ");
		}
		System.out.println();
		
		for(int i=0; i<arr8.length; i++) {
			System.out.print(arr8[i]+", ");
		}
		System.out.println();
		
		//다른 참조변수에 의한 값 변경 영향!
		arr8[1]=3.14;
		
		for(int i=0; i<arr7.length; i++) {
			System.out.print(arr7[i]+", ");
		}
		System.out.println();

		//배열 객체의 copy하기
		int[] arr9=new int[] {5,6,7};
		int[] arr10=new int[arr9.length];
		
		for(int i=0; i<arr9.length; i++) 
			arr10[i]=arr9[i];
		
		//arr10의 객체와 arr9의 객체는 서로 다른 객체야
		// arr10[1]=100;  arr10의 값 바꿔도 arr9에 영향 안줘요~!!!
		
		//참조형 변수의 배열!
		int a,b,c;
		int[] arr11=new int[3];
		
		String s1, s2, s3;
		s1=new String("Hello");
		s2=new String("Hello");
		s3=new String("Hello");
		
		String[] arr12=new String[3];
		System.out.println(arr12);
		
		arr12[0]=new String("Hello");
		arr12[1]=new String("nice");
		arr12[2]=new String("android");
		
		//참조형 변수 배열의 초기화
		String[] arr13=new String[] {new String("Hello"), new String("nice"), new String("android")};
		String[] arr14=new String[] {"Hello", "nice", "android"};
		String[] arr15= {"Hello", "nice", "android"};
		
		//또 다른 참조형..
		Random[] arr16=new Random[3];
		arr16[0]=new Random();
		int m=arr16[0].nextInt();
		
		Random[] arr17=new Random[] { new Random(), new Random(), new Random() };
		Random[] arr18= {new Random(), new Random(), new Random() };
		
		
		//for each문..(확장형 for문)
		for(int i=0; i<arr.length; i++) {
			int t=arr[i];
			
		}
		
		//******for each문 // 페이스북, 인스타그램 등 게시글// 오직 처음부터 끝까지만 ++만 돼 --안돼. 0부터 끝번
		int total=0;
		for(int t : arr) {
			System.out.println(t);
		}
		System.out.println("합계 : "+ total);
		
		
		//foreach
		String[] arr19=new String[3];
		//String 객체 없어. 배열참조스트링형 만든거
		arr19[0]=new String("Hello");
		arr19[1]=new String("nice");
		arr19[2]=new String("world");
		
		for( String t : arr19) {
			System.out.println(t.length());
		}
		
		
		
		
		
		
		
	}
	


}
