
public class Second {
	int g=10; //�������
	
	void aaa(){ //����޼ҵ�
		
		final int r=50; //�������� : �ٸ� ���������� ���Ұ�! 
		
//		AAA k = new AAA(); //����� ���� �� �� ���� �ФФ�  ����Ŭ������ ������ �� ����ؾ��� 
		
		//����Ŭ����(Local): �ٸ� ���������� �νĺҰ�!! / ��ȸ��: �޼ҵ尡 ȣ��Ǹ� ����� �޼ҵ尡 ������ �Ҹ� 
		//�������� ���� �� || ��� ����� �͸� class �� ����Ŭ������ «�͵Ǿ ��
		class AAA{
			void show() {
				System.out.println("AAA ... show"+ g);
				System.out.println("AAA...show"+ r); //����Ŭ���� �������� ��������� ��밡���ϰ� �������� ���Ұ�(�� �� �Ǵ°� ��Ŭ������ ȥ�� final�� �����.
				//final���������� ��밡��!			 // �׷��� �� �� �����ϸ� ���̳� �ƴϳ�?   ����!! (��? ���������� �޼ҵ� ������ �޸� ������ݾ�) 
													 
			}
		}
		
		AAA obj=new AAA();
		obj.show();
		
		AAA obj2=new AAA();
		obj2.show();
		
		AAA obj3=new AAA();
		obj3.show();
		
		
	}//aaa method
	
	void bbb() {
//		AAA obj=new AAA(); //ERROR ��? AAA���� ����ݾ�! 
	}//bbb Method
	
	//Inner class

}//Second class
