
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ex) App�� ĳ���� 3����(Dog, Cat, pig)
		
		
		Dog d=new Dog();
		d.say();
		
		Cat c=new Cat();
		c.say();
		
		Pig p= new Pig();
		p.say();
		
		//���� �̷� ������ü�� ���� �������??
		//Dog�� 5����, Cat�� 10����, Pig�� 4���� 
		//�̷����̸� 
		//�迭�� ó���ϸ� �ݺ��� ���� �� �ս��� ���α׷��� �������ٵ�
		//3���� Ŭ������ ���� �ٸ� �ڷ����̹Ƿ� �迭�� �ѹ��� ���°� �Ұ���
		// arr= new [5]; ERROR!!
		
		//�̷� �� Dog, Cat, Pig�� Animal�� ��Ӱ�����!!! 
		//AnimalŬ���� ���� 
		
		Animal ani1=new Dog(); //�� ĳ����: �θ� ���������� �ڽ� ��ü �����ϱ�
		Animal ani2=new Cat();
		Animal ani3=new Pig();
		System.out.println();
		
		ani1.say();
		ani2.say();
		ani3.say();
		System.out.println();
		
		//���� �������� �����ϴٸ�, �迭�� ���� Animal������ ��ü�� ������ �� ����. 
		Animal[] anis=new Animal[5];
		System.out.println(anis[0]);
		System.out.println(anis[1]);
		System.out.println(anis[2]);
		System.out.println();
		
		anis[0]=new Dog();
		anis[1]=new Cat();
		anis[2]=new Cat();
		anis[3]=new Pig();
		anis[4]=new Dog();
		
		
		System.out.println(anis[0]);
		System.out.println(anis[1]);
		System.out.println(anis[2]);
		System.out.println();
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		
		//���� ó���� �ݺ������� �ۼ�����
		for(int i=0; i<5; i++) {
			anis[i].say();
		}
		System.out.println();
		
		//for each�� �̿�
		for(Animal t : anis) {
			t.say();
		}
		
		
		

	}

}
