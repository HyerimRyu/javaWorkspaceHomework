
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̽��� ���� new ��ü���� �Ұ�!!
		//Test t=new Test();
		
		//����Ϸ���? ��ӹ��� Ŭ������ ���� ��ü�� �����ؾ���
		First f=new First();
		f.aaa();
		f.ddd();
		
		//s�� 100% .aaa, .ddd ���� �������� : Ȯ���ϰ� Ȯ��--->���� ���� �� �������̽� ��ӹ����� ��ü(unit)���� �ʼ�(����) ��� �������̵�
		Second s=new Second();
		s.aaa();
		s.ddd(); 
		
		
		//�������̽� 6�� Ư¡ 
		Test t;//�������̽� ��������(�θ� ��������)
		t=new First(); //����:��ĳ���� // ���ʰ� ���� �޶���� 
		t.aaa();
		t.ddd();
		
		t=new Second();
		t.aaa(); //100% �������̵� �� �� �߻�Ŭ������ ����� �� ����.(�������̵尡 �ƴ� ��� �θ����� ���ݾ�) 
		t.ddd();
		
		Test.Hello h=new Test.Hello(); //static �̳�Ŭ������ ��ü ���� ����
		h.show();
		
	}

}

