package bbb;
import aaa.AAA;

//package�� �ٸ���import aaa.AAA�س� �ȱ׷��� extends�� �� extends aaa.AAA�̷��� ��ߵ�
public class BBB extends AAA{
	
	//�̹� ������� 4�� ����. ��ӹ��� �͵�
	
	void show() { 
		//System.out.println(a); //private�� �翬�� �ȵ���
		//System.out.println(b); //default�� ��Ű���� �ٸ��� ���Ұ�. ���� ��Ű���� ���� ����
		System.out.println(c); //protected�� ���� ���� ��Ű���� ������, ���ܷ� ����� ����!
		System.out.println(d);
		
		
		
		
		
	}
	

}
