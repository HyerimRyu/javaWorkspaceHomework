import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-������ �������̽��� �����ϰ� �߻� �޼ҵ��� �̸��� ���ϸ� ��������
		//�� �̸��� ���� ����� �����Ͽ� Ŭ������ ������.
		//���� : Unit �������̽� ����..
		//����1 : Marine Ŭ���� ���� �� Unit ����.. // �����̶�� �������� �⺻ ��� ����(�޼ҵ��� �̸� ����)
		//����2 : Tank Ŭ���� ���� �� Unit����
		//����3 : Race Ŭ���� ���� �� Unit����
		
		//Marine, Tank, Race ��ü�� attack(), move()����� ������ Ȯ���� �� ����. ��? Unit implements�����ϱ�
		
		//������ (�������� �۾���)������� Ŭ������ �̿��Ͽ� 
		//��ü���� �� ���� �˰����� �ڵ�!!! ���嵵 ��°� �ƴմϴ�~ ��ư� ���Ű� �մϴ�.
		
		//�迭�� �̹� ���ֵ��� ������ �����ؾ߸� ��(�迭�� ����)
		//���� ������ ������ ������ ���������� �����(���� �� �Ҹ� �ݺ�!!)
		//Unit[] units=new Unit[200]; 200�� ���ٿ��� �� �ʿ� or �� �ʿ� 
		//Collection(�����͸� �����ϴ� ��) ������ �迭... ArrayListŬ���� �̿�!!  * ���, �ν�Ÿ �Խñ� �� ���� ���� ���� �Լ� �������� 
		
		ArrayList<Unit> units=new ArrayList<Unit>(); //����Ʈ ���� �߿�~<Unit�� ���� �ٴҷ���>-->���׸� ���
		//����� ���� �˾Ƴ���! 
		int num=units.size();
		System.out.println("��Ұ���: "+ num);
		
		//�迭�� Unit��ü�� �����Ͽ� �߰�/ ���� �ַ��ַ�
		units.add(new Marine());
		//Marine m=new Marine();
		//units.add(m);
		
		units.add(new Tank());
		//Tank t=new Tank();
		//units.add(t);
		units.add(new Marine());
		units.add(new Race());
		
//		for(int i=0; i<units.size(); i++) {
//			
//			Unit u=units.get(i);
//			u.attack();
//			u.move();
//			
//			System.out.println();
//		}
		
		//***�߿�!! foreach �Ǽ��� ���� ���� ����
		for(Unit u : units) {
			u.attack(); 
			u.move();
			
			
			if (u instanceof Levelupable) {
				Levelupable a=(Levelupable)u;
				a.levelUp();
			}
			
			System.out.println();
		}
		
		
		
		
		//���� for�� ����
//		Unit u=units.get(0);
//		u.attack();
//		u.move();
//		
//		
//		u=units.get(1);
//		u.attack();
//		u.move();
//		
//		
//		u=units.get(2);
//		u.attack();
//		u.move();
//		
//		u=units.get(3);
//		u.attack();
//		u.move();
//		
		
		

	}

}
