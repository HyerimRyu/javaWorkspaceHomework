import aaa.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ��Ű���� Ŭ���� ��ü ����
		First f=new First();
		//f.a=50;//private�� ���ٺҰ�!!
		
		//���� ��Ű�� �ȿ����� private�� ������ ��� ���������ڿ� ����
		f.b=10;
		f.c=20;
		f.d=30;
		
		f.aaa(); //���� ��Ű���� default �޼ҵ� ���ٰ���
		
		
		//�ٸ� ��Ű���� Ŭ���� ��ü ����
		aaa.Second s=new aaa.Second();
//		s.a=10;//private ERROR
//		s.b=20;//default ERROR
//		s.c=30;//protected ERROR
		
		//�ٸ� ��Ű�� Ŭ������ ��ü����� public�� ���ٰ���
		s.d=40;//public ����
		//��, �ٸ� ��Ű���� �ϴ��� ��ӹ����� protected���� ����
		
		//s.aaa();//default-ERROE
		s.bbb(); // public-OK
		
		// aaa.Third t;
		
		
		//�⺻������ OOP������ ���������� �߿��� �����̾
		//�������(������:����)�� �ܺο� �������� �ʵ��� �ϴ� ���� �̴�!!(������ class�� ����)
		//�������(Filed)�� �⺻������ private���� ����!
		//����޼ҵ�� �⺻������ public���� ����!!
		//ex) �� ����� ���� ���� : ����� ���� : �̸�, ����, ����
		Person p=new Person();
		// p.name='sam'; //�Ұ���
		//private������� ������ ���??? ***�޼ҵ�***(�� �޼ҵ�? ���� �ɷ�������) �̿��ϴ� ��� ����!!!!!!!!!
		p.setMembers("sam", 20, "Ghana");
		p.setMembers("rim", 30, "korea");
		p.show();
		
		//��� �ϳ��� �� ����.. ���̺���, ��������
		//p.age=21; //�Ұ�!!
		p.setAge(21);//���԰���
		
		//���̿� ���� ���ǽ�
		if(p.getAge()< 20){
			System.out.println("�̼�����!!");
		}
		
		

	}

}
