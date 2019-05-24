import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal종류(Dog, Cat, Pig) 객체들을 만들어내는 애니멀 공장객체 생성!
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
		Dog dog=(Dog)ani; //(형변환)다운 캐스팅
		dog.guardHouse();
		
		
		ani=af.makeAnimals(2);
		ani.say();
		((Cat)ani).handleDeacon(); //안드로이드에서 주구장창 쓸꺼야!!!!!((형변환).) 안드로이드에서는 가로 3~4개도 많이 써!!
		
		
		ani=af.makeAnimals(3);
		ani.say();
		((Pig)ani).eatAndEat();
		
		//makeAnimal() : 전달값만 랜덤하면 랜덤한 객체 생성 가능
		
		//여러마리를 다루려면 배열로!!   점심 뭐먹지 앱 
		Random rnd=new Random();
		Animal[] anis=new Animal[5];
		for(int i=0; i<5; i++) {
			int n=rnd.nextInt(3)+1; //1,2,3
			
			anis[i]=af.makeAnimals(n);
		}
		
		//각 객체들의 기능 호출
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
			anis[i].sleep();
			
			//각 배열 요소 객체들(Dog or Cat or Pig)
			//의 고유 기능들 실행!
			//anis[0] 이 Cat인지 Dog인지 몰라
			//Animal 참조변수가 가리키는 객체가 어떤 클래스인지 알려주는 '연산자'!->instanceof
			if(anis[i] instanceof Dog) {
				Dog d4=(Dog)anis[i]; //다운캐스팅
				d4.guardHouse();
				
			}else if(anis[i] instanceof Cat) {
				
				((Cat)anis[i]).handleDeacon();
				
			}else if(anis[i] instanceof Pig) {
				
				((Pig)anis[i]).eatAndEat();
			}
		}
		
		//실수로 Animal객체를 만들면??
		//Animal 존재이유는 상속해주기 위해서! 객체 생성 목적 아니야 
		//실수로 Animal객체가 생성되는 것을 막기위해서 
		//Animal을 추상클래스(abstract class_논문의 요약 abstract 느낌으로)로 선언!!
		//Animal ani5=new Animal(); ERROR!!! 누가 객체를 실수로 만들까봐 Animal class에 abstract걸어놔
		//ani5.say();  //??
		
		
	}

}
