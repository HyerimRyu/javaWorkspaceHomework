
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		//길이가 5인 int형 배열객체 생성
		int[] arr= new int[5];
		
		int sum=0; //총합
		int max, min; //최대값, 최소값
		
		//배열의 첫번째 요소에 값을 입력받고
		//이값은 최대값,최소값 변수에 대입
		//처음 입력된 값이므로 비교대상이 없기에 최소값이면서 최대값
		System.out.print("input : ");
		arr[0]= s.nextInt();
		max= min = arr[0];
		
		//배열의 1번 인덱스부터 끝까지 값을 입력받고
		//최대값과 최소값 변수와 비교하면서 값 교체
		for(int i=1; i<arr.length ; i++){
			System.out.print("input : ");
			arr[i]= s.nextInt();
			sum+= arr[i];
			if(arr[i]>max) max=arr[i]; //현재 입력된 값이 max변수에 저장된 값보다 크면 현재값으로 max값 변경
			if(arr[i]<min) min=arr[i]; //현재 입력된 값이 min변수에 저장된 값보다 작으면 현재값으로 min값 변경
		}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		System.out.println("sum : "+sum);		

	}

}
