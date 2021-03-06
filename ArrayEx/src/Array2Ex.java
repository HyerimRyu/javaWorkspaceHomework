import java.util.ArrayList;

public class Array2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {
				{10,20,30},
				{10,20,30,40,50},
				{5,6,7,8}
		};
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				System.out.println(arr[i][k]+" ");
			}
			System.out.println();
		}
		
		
		//다차원 배열에 대한 for each
		for(int[] t : arr) {
			for(int n : t) {
				System.out.println(n + "  ");
			}
			System.out.println();
		}
		
		
		//3차 배열
		int[][][] arr2=new int[2][][];
		arr2[0]=new int[3][];
		arr2[1]=new int[4][];
		
		arr2[0][0]=new int[5];
		arr2[0][1]=new int[4];
		arr2[0][2]=new int[3];
		
		arr2[1][0]=new int[5];
		arr2[1][1]=new int[4];
		arr2[1][2]=new int[3];
		arr2[1][3]=new int[10];
		
		
		//유동적 배열
		ArrayList<String> list= new ArrayList<String>();
		System.out.println(list.size());
		
		list.add(new String("Hello"));
		list.add(new String("nice"));
		list.add(new String("world"));
		list.add(new String("android"));
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.add(2, new String("kkk"));
		
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(2);
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//for each문
		for(String t: list) {
			System.out.println(t);
		}
		
		//기본형은 에러야~ : 기본형 변수 사용불가
		//new ArrayList<int>();
		}
	}

