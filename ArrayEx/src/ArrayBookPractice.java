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
		
		
		
		
		
		
		
		
		
		/*//p.174 2���� �迭������ length�ʵ�
		
		 * 
		int[][] array = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
		};
		
		for ( int r = 0; r < array.length; r++) {
			for(int c=0; c<array[r].length; c++) {
				System.out.println(r+"��"+c+"��:" + array[r][c]);
			}
		}
		*/
		
		
		
		//p.171 �迭����
		
		/*final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			int r=(int) (Math.random() * 100);
			numbers[i]=r;
		}
		System.out.println("������ ����Ʈ: ");
		for (int r : numbers)
			System.out.println(r + " ");
		Arrays.sort(numbers);
		
		System.out.println("\n���ĵ� ����Ʈ: ");
		for (int r : numbers)
			System.out.println(r + " ");*/
		
		
		
		//p.167 for each
		/*int[] numbers = {10,20,30};
		for(int t:numbers)
			System.out.println(t + " ");*/
		
		
		//p.165 ���忹�༭�� ** �ٽú���!! �ͼ�������!!! �����ҵ� 
		
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
			
			System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ���.(����� -1): ");
			Scanner scan=new Scanner(System.in);
			int s = scan.nextInt();
			if(s == -1)
				break;
			if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
		}
		*/
		
		
		
		//p.163 �ֻ��� ������ (�߸���!! ���� �ȵƾ�!!)
		/*final int SIZE = 6;
		int freq[] = new int[SIZE];
		
		for(int i=0; i<10000; i++)
			++freq[(int) (Math.random() * SIZE)];
		
		System.out.println("=====================");
		System.out.println("�� ��");
		System.out.println("=====================");
		
		for(int i=0; i<SIZE; i++)
			System.out.println("" + (i+1)+""+freq[i]);*/
		
		
		
		
		//p. 160 �ּҰ� ���ϱ�
		/*int s[]= {12,3,19,6,18,8,12,4,1,19};
		int minimum;
		
		minimum=s[0];
		
		for(int i=1; i<s.length; i++) {
			if(s[i]<minimum)
				minimum=s[i];
		}
		System.out.println("�ּҰ���" + minimum + "�Դϴ�.");*/
		
		
		
		//�ִ밪 ���ϱ� {}����/ {}�ȿ� ������ ����� �ݺ��ؼ� ���� �� �־� 
		
		/*int s1[]= {12,3,19,6,18,8,12,4,1,19};
		int max;
		
		max=s1[0];
		for(int i=1; i<s1.length; i++) {
			if(s1[i]>max) 
				max=s1[i];
		}
		System.out.println("�ִ밪��"+max);
		*/
		
		
		//p.158 ���ڿ� �迭 String
		/*String[] toppings = {"Pepperoni", "Mushroom", "Onions", "Sausage", "Bacon"};
		
		for(int i=0; i<toppings.length; i++) {
			System.out.println(toppings[i]+" ");
		}*/
		
		
		
		//p.157 �迭 �ʱ�ȭ new��� ����
		/*int[] scores = {10,20,30,40,50};
		for(int i=0; i<scores.length; i++)
			System.out.println(scores[i]+"");*/
		
		
		
		
		//p.155 �迭 �Է¹޾Ƽ� ��հ� ���ϱ�
		/*final int STUDENTS = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];  //�迭 ��ü ���� ������~
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("������ �Է��Ͻÿ� : ");
			scores[i] = scan.nextInt();
		}
		for(int i=0; i < scores.length; i++)
			total += scores[i];
		
		System.out.println("��� ������"+total/STUDENTS + "�Դϴ�.");*/
	}
	}
		//p.154 �迭 �ݺ� for��
	/*	int[] s=new int[10];
		
		for(int i=0; i<s.length; i++) {
			s[i]=i;
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i] + " ");
		}
	}
}*/
