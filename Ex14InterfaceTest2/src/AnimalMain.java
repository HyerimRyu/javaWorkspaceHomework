import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Animal> ani=new ArrayList<Animal>();
		int num=ani.size();
		
		ani.add(new Cat());
		ani.add(new Dog());
		ani.add(new Dog());
		ani.add(new Pig());
		ani.add(new Pig());
		ani.add(new Cat());
		ani.add(new Cat());
		
		
		for(Animal a: ani) {
		 a.say();
		 a.eat();
		 
		//������� �Ϲ� interface
			//�Ʒ����� Ư����� 3�� 2�� 3���� ��ü ���� ���
			
			
			if(a instanceof AnimalTakeAWalkable) {
				AnimalTakeAWalkable b=(AnimalTakeAWalkable)a;
				b.walk();
			}
			System.out.println();
		}
		
		
		

	}

}
