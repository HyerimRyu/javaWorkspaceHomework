
public class Student {
	
	//�����ִ� �����͵��� ������ ������ ����
	//Field(�ʵ�: �������)
	
	//Ŭ���� ������ ����, ����, ��� �ȵ�!!!! �̰Ŵ� ������ �ƴϾ�!! field��!!!
	String name;
	int kor;
	int eng;
	double aver;
	
	//���(method)���� �� �� ����.
	//��) ȭ�鿡 aaa��� �۾��� ����ϴ� ���!
	//Method(�޼ҵ�) ���ǹ���(c����� �Լ� ����� ����)
	void show() {
		//aaa��� �۾��� ����ϴ� ���๮!(�ڵ�)
		System.out.println("aaa");
	}
	//Main�Լ����� ��ü�� ����� ������ ���� �޼ҵ� ����
	
	//�������(�ʵ�)���� ���� ����ϴ� ���!(Method)
	void output() {
		System.out.println("�̸� :"+ name); //������� ���!
		System.out.println("���� :"+ kor);
		System.out.println("���� :"+ eng);
		System.out.println("��� :"+ aver);
		System.out.println();
	}
	
	//��հ��� ����Ͽ� aver(�������)�� �����ϴ� ���!
	void calAverage() {
		aver=(double)(kor+eng)/2;
	}
	

}
