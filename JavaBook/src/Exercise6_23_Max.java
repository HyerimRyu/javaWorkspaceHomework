
public class Exercise6_23_Max {
	
	
	static int max(int[]arr) {
		int max=arr[0];
		for(int i=1; i<arr.length;i++) {
			max=(max>arr[i])? max:arr[i];
			
//			if(max>arr[i])max=max;
//			else max=arr[i];
		}
			
		return max;
	}
	
	
	public static void main(String[] args) {
		int[] data= {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:"+max(data));
	}
}
