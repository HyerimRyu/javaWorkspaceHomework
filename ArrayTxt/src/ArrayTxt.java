import java.util.Scanner;

public class ArrayTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seat=new int[10];
		
		System.out.println("�¼��� �����Ͻðڽ��ϱ� (1(Y) �Ǵ� 0(N)? ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		System.out.println("������ ���� ���´� ������ �����ϴ�.");
		System.out.println("------------------------------");
		System.out.println("�¼���ȣ: 1  2  3  4  5  6  7  8  9  10");
		System.out.println("------------------------------");
		System.out.println("�������: 0  0  0  0  0  1  1  1  0  1");
		
		
		
		
		
	}//���� ��
}//Ŭ���� ��

		
		//���� 3�� ***�迭 ī��Ʈ �׷���
		/*Scanner scan=new Scanner(System.in);
		int[] num=new int[10];
		
		//1. 10�� �Է�
		for(int i=0; i<10; i++) {
			System.out.println("1-100���� ���� �Է�");
			int a=scan.nextInt();
			
			 //2. �迭 ī��Ʈ
			for(int j=0; j<10; j++) {	
			if((j*10)+1<=a && (j+1)*10>=a) num[j]++;
		  }
		}
		
		//3. ����� ���
		for(int j=0; j<10; j++) {
			System.out.println(((10*j)+1)+"-"+((10*j)+10)+":");
			for(int k=0; k<num[j]; k++) System.out.print("*");
			System.out.print("\n");
		}//for��

			
		}//main

	}//class
*/		
/*		//����2�� �Է¹��� ������ ��� ���ϱ�
		
		Scanner scan=new Scanner(System.in);
		int a=0;
		System.out.println("�л��� ���� �Է��Ͻÿ� : " );
		a=scan.nextInt();
		int[] grade=new int[a];
		int sum=0;
		
		for(int i=0; i<a; i++) {
			System.out.println("�л�" +(i+1)+ "�� ������ �Է��ϼ��� : ");
			grade[i]=scan.nextInt();
			if(grade[i]>100) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���");i--;continue;		
			}
			sum+=grade[i];
		}
			System.out.println("���� �����"+ sum/a+"�Դϴ�.");
		}
	}	*/
	
	
		//����1. �迭 �ִ밪 �ּҰ� ����_�迭 �ʱ�ȭ, ���ǽ� �񱳴�� ���� 
	/*	int[] arr=new int[5];
		
		Scanner scan=new Scanner(System.in);
		System.out.println("5���� ������ �Է��Ͻÿ�");
		
		//�迭�� �� ����
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=scan.nextInt();
		}
		
		int min, max, sum;
		
		//����! �迭������ arr[0]���� �ʱ�ȭ
		min=arr[0];
		max=arr[0];
		sum=arr[0];
		
		//����! ���ǽĿ��� ���ϴ� ����� 1���� ���� 
		for(int j=1; j<arr.length; j++) {
			min=(arr[j]==min)? arr[j]:(arr[j]<min)?arr[j]:min;
			max=(arr[j]==max)? arr[j]:(arr[j]>max)?arr[j]:max;
		         sum +=arr[j]; 
		}
		
		System.out.println("�ּҰ���"+ min +"�Դϴ�.");
        System.out.println("�ִ밪��"+ max +"�Դϴ�.");
        System.out.println("������"+ sum +"�Դϴ�.");
	}

}*/
