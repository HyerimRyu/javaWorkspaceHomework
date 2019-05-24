import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal����(Dog, Cat, Pig) ��ü���� ������ �ִϸ� ���尴ü ����!
		AnimalFactory af=new AnimalFactory();
		
		Dog d=(Dog)af.makeAnimals(1);
		d.say();
		d.guardHouse();

		Cat c=(Cat)af.makeAnimals(2);
		c.say();
		c.handleDeacon();
		
		Pig p=(Pig)af.makeAnimals(3);
		p.say();
		p.eatAndEat();
		System.out.println();
		
		Animal ani;
		ani=af.makeAnimals(1); //Dog
		ani.say();
		ani.sleep();
		Dog dog=(Dog)ani; //(����ȯ)�ٿ� ĳ����
		dog.guardHouse();
		
		
		ani=af.makeAnimals(2);
		ani.say();
		((Cat)ani).handleDeacon(); //�ȵ���̵忡�� �ֱ���â ������!!!!!((����ȯ).) �ȵ���̵忡���� ���� 3~4���� ���� ��!!
		
		
		ani=af.makeAnimals(3);
		ani.say();
		((Pig)ani).eatAndEat();
		
		//makeAnimal() : ���ް��� �����ϸ� ������ ��ü ���� ����
		
		//���������� �ٷ���� �迭��!!   ���� ������ �� 
		Random rnd=new Random();
		Animal[] anis=new Animal[5];
		for(int i=0; i<5; i++) {
			int n=rnd.nextInt(3)+1; //1,2,3
			
			anis[i]=af.makeAnimals(n);
		}
		
		//�� ��ü���� ��� ȣ��
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
			anis[i].sleep();
			
			//�� �迭 ��� ��ü��(Dog or Cat or Pig)
			//�� ���� ��ɵ� ����!
			//anis[0] �� Cat���� Dog���� ����
			//Animal ���������� ����Ű�� ��ü�� � Ŭ�������� �˷��ִ� '������'!->instanceof
			if(anis[i] instanceof Dog) {
				Dog d4=(Dog)anis[i]; //�ٿ�ĳ����
				d4.guardHouse();
				
			}else if(anis[i] instanceof Cat) {
				
				((Cat)anis[i]).handleDeacon();
				
			}else if(anis[i] instanceof Pig) {
				
				((Pig)anis[i]).eatAndEat();
			}
		}
		
		//�Ǽ��� Animal��ü�� �����??
		//Animal ���������� ������ֱ� ���ؼ�! ��ü ���� ���� �ƴϾ� 
		//�Ǽ��� Animal��ü�� �����Ǵ� ���� �������ؼ� 
		//Animal�� �߻�Ŭ����(abstract class_���� ��� abstract ��������)�� ����!!
		//Animal ani5=new Animal(); ERROR!!! ���� ��ü�� �Ǽ��� ������ Animal class�� abstract�ɾ��
		//ani5.say();  //??
		
		
	}

}
