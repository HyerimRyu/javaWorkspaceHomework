
public class Second extends First{
	//�׳ɺ��� �ϳ��� ���� �� ó�� �������� ��ӹ��� FirstŬ������\
	//����� �����ϰ� ��.
	
	//������� �߰�.
	int b;
	
	//����� �����ϴ� ���
	void setMembers(int a, int b) {
		super.a=a;  //super ��ӹ����Ŵ�! ��ӹ��� ���������� �� �� �־�
		this.b=b;
	}
	
	//���θ�������� ����ϴ� ���!
	void showSecond() {
		System.out.println("b : "+ b);
	}
	
	
	//���� �θ������� �ѹ濡 �θ���! ��ӹ��� Ŭ������ ������� ����ϴ� ���!
	void show() {
		//System.out.println("a : "+ a); //��ü�������� �� ��ü�� ���� �ϴ°� ����!! 
		showFirst();
		System.out.println("b : "+ b);
		System.out.println();
	}
	

}
