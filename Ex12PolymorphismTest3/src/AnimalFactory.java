
public class AnimalFactory {
	
	//�ִϸ�(Dog, Cat, Pig ��ü)�� ������ ��� �޼ҵ� 
	Animal makeAnimals(int n) {
		
		Animal ani=null;
		
		switch(n) {
		case 1:
			ani=new Dog(); //UP casting
			break;
			
		case 2:
			ani=new Cat();
			break;
			
		case 3:
			ani=new Pig();
			break;
		}//switch �޼ҵ� ������
		
		return ani;  //UP casting return
	}

}
