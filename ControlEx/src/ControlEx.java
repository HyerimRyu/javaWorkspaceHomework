import java.util.Random;
import java.util.Scanner;

public class ControlEx {
	public static void main(String[]args) {
		
	}
	
	
}//class��


/*//�޸� 4�� 
	public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	
	int a=input.nextInt();
	
	for(int i=9; i>0; i--){
		System.out.println(a+"*"+i+"="+a*i);
	}
	}

*/
//�޸�3�� �ٽ� Ǯ�� ī��Ʈ..!!! �հ�!!!
	/*public static void main(String[]args) {
		
		while(true) {
			
			Scanner input=new Scanner(System.in);
			int userInput=input.nextInt();
		
			int count=0;
			for(int i=0; i<count; i++) {
				
				int sum=0;
				sum=sum+userInput;
		
			
			if(userInput==0) {
				
				System.out.println("����� �Է°� �հ�: "+sum);
				break;
			}
			
			}
		}
	}
	
}//class��
*/
//�޸�2 for�� �ݺ� Ƚ�� ���� ���� ���� 
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

//�޸�1 ��� 
	/*public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		for(int i=0;i<a; i++) {
			System.out.println("Hello World!");
		}
	}
	

*/
//�޸� 4�� �հ� ��� �ִ방 �ּҰ�
	/*public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int userInput1=scan.nextInt();
		int userInput2=scan.nextInt();
		int userInput3=scan.nextInt();
		
		int sum=0;
		sum=userInput1+userInput2+userInput3;
		
		int average=0;
		average=userInput1+userInput2+userInput3/3;
		
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+average);
		
		//�ִ밪
		int max=0;
		
		if(userInput1>=userInput2&&userInput1>=userInput3) {
			max=userInput1;
		}else if(userInput2 >=userInput1&&userInput2>=userInput3) {
			max=userInput2;
		}
		else {
			max=userInput3;
		}
		System.out.println("�ִ밨:"+max);
		
		
		//�ּҰ�
		int min=0;
		if(userInput1<=userInput2&&userInput1<=userInput3) {
			min=userInput1;
		}else if(userInput2 <=userInput1&&userInput2<=userInput3) {
			min=userInput2;
		}
		else {
			min=userInput3;
		}
		System.out.println("�ּҰ�:"+min);
	}*/
	
	


	
	//�޸�3�� ���밪 ���
	/*public static void main(String[]args) {
		
		Scanner userInput=new Scanner(System.in);
		int absolute=userInput.nextInt();
		absolute=(absolute<0? -absolute:absolute);
		System.out.println("���밪 ���:"+absolute);
	}
	
	*/
	
	



	//�޸�2�� ���簢�� ���� ���ϱ�
	/*public static void main(String[] args) {
		
		System.out.println("�� ���� ��ǥ x,y�� �Է��Ͻÿ�");
		
		Scanner scan=new Scanner(System.in);
		
		int inputX=scan.nextInt();
		int inputY=scan.nextInt();
		int inputXx=scan.nextInt();
		int inputYy=scan.nextInt();
		
		int result=0;
		result=inputX*inputY;
		
		System.out.println("�� ����� x��ǥ: "+inputX);
		System.out.println("�� ����� y��ǥ: "+inputY);
		System.out.println("�� ����� x��ǥ: "+inputXx);
		System.out.println("�� ����� x��ǥ: "+inputYy);
		
		System.out.println("�� ���� �̷�� ���簢���� ���̴� "+result);
		*/


		
		
	
	
	
	//�������� 1�� �� ���
	/*public static void main(String[]args) {
		
	int getMoney;
	int price=7500;
	int tax=price/10;
	int rest=0;
	
	
	Scanner pay=new Scanner(System.in);
	getMoney=pay.nextInt();
	rest=getMoney-price-tax;
	
	System.out.println("������: " + getMoney);
	System.out.println("��ǰ����: " + price);
	System.out.println("�ΰ���: " + tax);
	System.out.println("�ܵ�: " + rest);
	*/
	
	
	
	/*
	public static void main(String[] args) {
		int answer=59;
		int guess;
		Scanner sc=new Scanner(System.in);
		int tries = 0;
		
		do {
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			guess =sc.nextInt();
			tries++;
			
			if(guess>answer)
				System.out.println("������ ������ �����ϴ�.");
			if (guess < answer)
				System.out.println("������ ������ �����ϴ�.");
		}while(guess !=answer);
		
		System.out.println("�����մϴ�. �õ�Ƚ��=" + tries);*/
	

		
	
	//������ ������ ���ϱ�
/*	
	public static void main(String[] args) {
		Random generator=new Random();
		
		System.out.print("������ ����: ");
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int sum=0;
		
		for(int i=0; i<count; i++) {
			int number=generator.nextInt(100);
			sum+= number;
		}
		System.out.print("����"+count+"���� ����"+sum);*/
	

	
	
	//RANDOM ������ ���߱�
/*	public static void main(String[]args) {
		//�������� ����� �ִ� ������(Random��ü)����
		Random rnd = new Random(); //�̸��� ��� �̸��� ���������� ����� 
		
		int r=rnd.nextInt(10); //0~9
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("input : ");
			int user = scan.nextInt();
			
			if(user>r) System.out.println(user + "���� �۽��ϴ�.");
			else if(user < r) System.out.println(user + "���� Ů�ϴ�.");
			else {
				System.out.println("�����Դϴ�.");
				break;
		}
		}//while
		
		}
		*/
		


	//String���� n�� �� ���ϱ�
	/*
	public static void main(String[] args) {
		
		String s="no news is good news";
		int n=0;
		
		for(int i=0; i<s.length(); i++) {
			//n�� ������ Ƚ�� ��
			if(s.charAt(i) != 'n')continue;
			
			n++;
		}
		System.out.println("���忡�� �߰ߵ� n�� ����"+n);
		
	}*/
	
	
	//��հ�
	/*public static void main(String[] args) {
		int total=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("������ �Է��Ͻÿ�: ");
			int grade=scan.nextInt();
			if(grade<0)
				break;
			
			total += grade;
			count++;
		}
		System.out.println("����� "+ total/count);
	}*/
	
	
	
	//����� for�� ��ø
	/*public static void main(String[] args) {
		for(int y=0; y<5; y++) {
			for(int x=0; x<10; x++)
				System.out.print("*");
			System.out.println("");
		}
	}*/
	
	
	//�Է¹��� ���� ���丮�� ���ϱ�
/*	public static void main(String[] args) {
		long fact =1;
		int n;
		
		System.out.println("������ �Է��Ͻÿ�");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		System.out.printf("%d!�� %d �Դϴ�.", n, fact);
		}
	}
	*/
	
	
	
	//1~10���� ���ϱ�
	/*public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println("�հ�="+sum);
	}
	*/
	
	
	//�Է¹��� ������ ��� 
	/*public static void main(String[] args) {
		int n;
		int i=1;
		System.out.print("���ϴ� ������ �� ����");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		while(i<=9) {
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
	}*/
	
	
	/* while�� �ݺ� i++;����
	 * public static void main(String[] args) {
		int i=0;
		while(i<5) {
			System.out.println("ȯ���մϴ�.");
			i++;
		}
		System.out.println("�ݺ��� ����Ǿ����ϴ�.");
	}*/
	

	//������ ���
	/*public static void main(String args[]) {
		final int targetSales=1000;
		int mySales;
		int bonus;
		String result;
		
		Scanner input=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�. (����:����); ");
		mySales=input.nextInt();
		
		if(mySales >= targetSales) {
			result="�����޼�";
			bonus=(mySales-targetSales)/10;
		} else {
			result = "�����޼� ����";
			bonus=0;
		}
		System.out.println(result+"\n"+"���ʽ�"+bonus);
	}
	*/
	
	
	/* �Է¹��� �� �� �� �ִ밪max ���ϱ�
	public static void main(String[] args) {
		int x,y,max;
		Scanner input=new Scanner(System.in);
				System.out.print("ù ��° ����: ");
				x=input.nextInt();
				
				System.out.print("�� ��° ����");
				y=input.nextInt();
				
				//���ǽ� ����
				if (x>y)
					max=x;
				else
					max=y;
				
				System.out.println("ū ���� " + max);
	}
	*/
	
	/* �Է¹��� �� Ȧ��¦�� ����	
	public static void main(String[] args) {
		
		//if���� ����Ͽ� Ȧ���� ¦�� ����
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		number = input.nextInt();
		
		//���� ����
		if(number %2 ==0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		System.out.println("���α׷� ����");
	
	}
	*/
	
	
	/* ���� ����
	public static void main(String[] args) {
		
		int a=-8;
		System.out.println(a>>>2); 
		
		
		//switch��
		//boolean b=true;//error
		char b='��';//error
		
		//�����Ѱ�: byte, short, char, int, String
		
		
		switch(b) {
		case '��':
			System.out.println(5);;
			break;
		case '��':
			System.out.println(10);
		}
		
		//Ư�� ��ġ���� break, continue
		for(int i=0; i<5; i++){
			for(int k=0; k<10; k++) {
				if(k==5) break;
				System.out.println(i+","+k);
			}
			System.out.println();
		}
		
		//�̷�ǥ���� �����Ѱ�?
		for(int k=0, n=10; k<5; k++, n--, a+=10) {
		
	}*/


