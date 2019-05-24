
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.p); //참조형의 기본값 null
		System.out.println();
		
		//멤버변수 값 설정(멤버변수 접근)
		t.a=10;
		 //에어컨 리모컨은 에어컨만, 티비 리모컨은 티비만
		t.p=new Person(); //객체 생성하여 참조변수에 대입
		
		System.out.println(t.a);
		System.out.println(t.p);//참조값(주소) 출력
		System.out.println();
		
		//멤버변수로 존재하는 또 다른 객체의 멤버변수 값 출력
		System.out.println(t.p.name); //***주의 . .p가 또 다른 객체의 참조변수라서 
		System.out.println(t.p.age);
		System.out.println();
		
		//결국 멤버변수로 존재하는 객체의 멤버값도 대입해줘야 해. // . .으로 들어가
		t.p.name="sam";
		t.p.age=20;
		
		System.out.println(t.a);
		System.out.println(t.p.name);
		System.out.println(t.p.age);
		System.out.println();
		
		//Person의 멤버값 출력을 위해 일일이 쓰는것 짜증! 
		//왜 내가 p.t.하면서 해야돼?! Person이 너꺼니까 너가 알아서 해!!->method
		//Person 클래스에 멤버값 출력기능
		t.p.show(); //자기값은 자기가! 그래도 . .으로 들어가야해
		System.out.println();
		
		t.show();
		System.out.println();
		
		//새로운 Test객체를 만들어도 어렵지 않게 멤버값 출력가능! 
		Test t2=new Test();
		t2.a=100;
		t2.p=new Person();
//		t2.p.name="robin";
//		t2.p.age=25;
		
		//출력은 쉬워졌어~ 근데 입력도 일일히 내가 해줘야해?!?!?! 
		//객체값 대입도 메소드 이용하자!! 한번에 쭉 넣고 끝!!
		t2.p.setMembers("robin", 25);
		t2.show();
		
		//Test클래스도 입력 기능이 있으면 더 편하게 값 대입 가능!
		Test t3=new Test();
		//**********중요)Person객체가 있어야 멤버대입 가능
		Person p=new Person();
		p.setMembers("hong", 30); //call by reference
		
		t3.setMembers(10,p);
		t3.show();
		
		//위를 보면 결국 Test클래스 객체의 멤버값을 줄 때
		//a값과 더불어 name, age 까지 모두 대입해 주어야 함.
		//new set show! 끝! 이렇게 하고 싶다 
		Test t4=new Test();
		t4.setMembers(10, "kim", 35);
		t4.show();
		
		
		//여기까지 보니까.. 객체 생성 후 멤버값 대입을 위해 
		//매번 setMembers()메소드를 호출하는 코드를 써야하는게 짜증나~
		//객체 생성할 때 멤버값을 미리 대입해 줄 수 있으면 좋겠죠!!
		
		//*****이렇게!! 만들면서 값주고 싶어! 객체 생성시 자동으로 1번 호출되는 메소드: ****생성자 메소드(Constructor)
		Test t5=new Test(10, "lee", 40);
		t5.show(); 
		
		Person p2=new Person("park", 45);
//		p2.setMembers("park", 45);
		
//		Test t6=new Test(20,p2);
		Test t6=new Test(20,new Person("park", 45));// Person 생성자 덕에 가능!!!
		t6.show();
		
		Test t7=new Test();
		t7.show();

	}

}
