
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ex) App에 캐릭터 3종류(Dog, Cat, pig)
		
		
		Dog d=new Dog();
		d.say();
		
		Cat c=new Cat();
		c.say();
		
		Pig p= new Pig();
		p.say();
		
		//만약 이런 동물객체가 여러 마리라면??
		//Dog가 5마리, Cat이 10마리, Pig가 4마리 
		//이런식이면 
		//배열로 처리하면 반복문 적용 등 손쉽게 프로그래밍 가능할텐데
		//3개의 클래스가 서로 다른 자료형이므로 배열로 한번에 묶는게 불가능
		// arr= new [5]; ERROR!!
		
		//이럴 때 Dog, Cat, Pig가 Animal과 상속관계라면!!! 
		//Animal클래스 설계 
		
		Animal ani1=new Dog(); //업 캐스팅: 부모 참조변수로 자식 객체 참조하기
		Animal ani2=new Cat();
		Animal ani3=new Pig();
		System.out.println();
		
		ani1.say();
		ani2.say();
		ani3.say();
		System.out.println();
		
		//위와 같은것이 가능하다면, 배열로 여러 Animal종류의 객체를 참조할 수 있음. 
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
		
		
		//위의 처리를 반복문으로 작성가능
		for(int i=0; i<5; i++) {
			anis[i].say();
		}
		System.out.println();
		
		//for each문 이용
		for(Animal t : anis) {
			t.say();
		}
		
		
		

	}

}
