import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���̸��� ��ǻ�� ��ü ����!!
		Computer com=new Computer();
		
		//��ǻ�� ��ü���� ���䰪�� �����ϰ� ����� ����!!
		com.makeNumbers();
		
		/*System.out.print(com.com100);
		System.out.print(com.com10);
		System.out.print(com.com1);*/
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			//Ű���� �Է¹ޱ�!!
			String userNumber=scanner.next();
			
			//��ǻ�Ϳ��� ���� �Է¹��� ���� �������ְ� ���� ���
			boolean result=com.checkAnswer(userNumber);
			
			//�����̸� �ݺ�����!! 
			if(result) {
				break;
			}
		}//while
		    //���Ѵٸ� �� �� ��?!
		
	}

}
