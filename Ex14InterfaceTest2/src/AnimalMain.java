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
		 
		//여기까지 일반 interface
			//아래부터 특별기능 3중 2만 3마리 전체 공통 노노
			
			
			if(a instanceof AnimalTakeAWalkable) {
				AnimalTakeAWalkable b=(AnimalTakeAWalkable)a;
				b.walk();
			}
			System.out.println();
		}
		
		
		

	}

}
