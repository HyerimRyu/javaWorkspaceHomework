
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inner class : NiceŬ����
		//Outter class: TestŬ����
		
		Test t=new Test(); //�Ϲ����� Ŭ�������� �׳� �νĵ�.
		
		//�̳�Ŭ������ �׳� �ν� �Ұ�!
//		Nice n = new Nice();
//		Test.Nice n=new Test.Nice(); //��ü���� �Ұ�: ����: �̳�Ŭ������ �ƿ��� Ŭ������ ��ü�� ������ �ʰ�� �� �� ����. 
		
		//�̳�Ŭ���� ����ϱ�! : �ƿ��� ��ü���� �̳ʰ�ü ������ �Ƿ��ϱ�! 
		Test.Nice n=t.makeInnerClass();
		n.aaa();
		
		
		//static �̳� Ŭ���� ��ü ���� ����! : �ƿ��� ��ü ����.
		First.Hello h= new First.Hello();
		h.show();

	}

}
