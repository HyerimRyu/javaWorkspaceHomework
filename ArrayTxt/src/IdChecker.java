
import java.util.Scanner;

public class IdChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		String data;
		
		while(true){
			System.out.print(" �Է°� : ");
			data= scanner.nextLine();
			
			//�Էµ� ������ ���̸� ������
			int len= data.length();
			int sum=0; //�� �ڸ����� �������� �� �����
			
			if( len < 16){
				
				//�ֹι�ȣ �Ǻ� ����
				int k=2;
				for( int i=0; i< len-1 ; i++){ //������ �ڸ��� ���꿡�� ����
					char ch= data.charAt(i);
					if( ch>='0' && ch<='9' ){
						sum += ( (ch-48)*k );
						k++;
						if(k>9) k=2;
					}					
				}
				
				int M = (11-(sum%11))%10;
				
				int m= data.charAt(len-1) - 48; //������ �ڸ����� ���ڰ��� ���������� ��ȯ
				if( M == m ){
					System.out.println("... �ֹι�ȣ�� �½��ϴ�. \n");
				}else{
					System.out.println("... ���������� �ƴմϴ�. \n");
				}
				
			}else{
				
				//ī���ȣ �Ǻ� ����
				
				int count=0; //data�ȿ� �ִ� ������ ������ ī���� �ϱ� ���� ����
				for( int i=0; i<len; i++){
					char ch= data.charAt(i);
					if( ch>='0' && ch<='9' ) count++;
				}
				
				//data���� ������ ������ 16���� ī���ȣ�� �´� ������ �ν�
				if(count==16){
					System.out.println("... ī���ȣ�� �½��ϴ�. \n");					
				}else{
					System.out.println("... ���������� �ƴմϴ�. \n");
				}
					
			}
			
		}

	}

}
