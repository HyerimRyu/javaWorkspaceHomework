import java.util.*;


public class String_Memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� 6
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		
		
		//����5�� �ٽ�Ǯ��
/*		����5.
		����ڷκ��� ��ȭ��ȣ�� �Է¹޵� ù3�ڸ�, �ι�° 3~4�ڸ�, ����° 4�ڸ� ���ڸ� ���ε���
		�Է� �޾Ƽ� �ϳ��� ���ڿ��� ���ļ� �����ϰ� ����Ͻÿ�. ��, ���̿� '-'�� �����ڸ� ������ �Ѵ�.

		��)  
		  ù��° �ڸ� �Է�(3�ڸ�) : 010
		  �ι�° �ڸ� �Է�(3~4�ڸ�) : 12345
		  [�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.]
		  �ι�° �ڸ� �Է�(3~4�ڸ�) : 1234
		  ����° �ڸ� �Է�(4�ڸ�) : 567a
		  [�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.]
		  ����° �ڸ� �Է�(4�ڸ�) : 5678 

		  �Էµ� ��ȭ��ȣ�� [ 010-1234-5678 ] �Դϴ�.*/
		/*
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		*/
		
	}
}

		
		
		//����4�� �����̽� ����
		/*Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		
		System.out.println(s1.replace(" ",""));	
	}
	}	*/
		
		//����3 ����!!!!!�ٽ� ���� ����Ʈ compare!!!!!!
		/*����3.
		���α׷� ����ڷκ��� ���ܾ��� �Է� �޴´�. �׸��� ���� �Է� ���� ���ܾ �����ϴ� 
		���� �߿��� �ƽ�Ű �ڵ��� ���� ���� ū ���ڸ� ã�Ƽ� ����ϴ� ���α׷��� �ۼ��غ���.
		���� �� �Էµ� ���ܾ "LOVE"��� �� �߿��� �ƽ�Ű �ڵ� ���� ���� ū ���ڴ� V
		�̹Ƿ� V�� ��µǾ�� �Ѵ�.*/
		
		/*Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		int len=s1.length();
		
		int input=Integer.parseInt(s1);
		System.out.println(s1.compare);
	}	

*/	
	
	
	
		
		//�޸� 2�� *out of bound ���� �ذ�: -1
		/*String s1;
		String s2;
		
		Scanner scan=new Scanner(System.in);
		s1=scan.next();
		System.out.println(s1);
		
		int len=s1.length();
		
		for(int i=len; i>0; i--) {
			System.out.print(s1.charAt(i-1));
		}
		
	}*/
	
		
	
	//�޸� 1�� �̾Ƴ��� ��½� ����ȯ
	/*	Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char c=str.charAt(0);
		
		int n=str.length();
		for(int i=0; i<n; i++) {
			System.out.println((char)(str.charAt(i)+1));
		}
		
	}*/


