
public class AnimalFactory {
	
	//애니멀(Dog, Cat, Pig 객체)을 만들어내는 기능 메소드 
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
		}//switch 메소드 마지막
		
		return ani;  //UP casting return
	}

}
