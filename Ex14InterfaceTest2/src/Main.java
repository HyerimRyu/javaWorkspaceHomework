import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-팀장이 인터페이스를 설계하고 추상 메소드의 이름을 정하면 팀원들은
		//그 이름을 토대로 기능을 구현하여 클래스를 설계함.
		//팀장 : Unit 인터페이스 설계..
		//팀원1 : Marine 클래스 정의 및 Unit 구현.. // 유닛이라면 가져야할 기본 기능 구현(메소드의 이름 통일)
		//팀원2 : Tank 클래스 정의 및 Unit구현
		//팀원3 : Race 클래스 정의 및 Unit구현
		
		//Marine, Tank, Race 객체는 attack(), move()기능이 있음을 확신할 수 있음. 왜? Unit implements했으니까
		
		//팀장은 (직원들이 작업한)만들어진 클래스를 이용하여 
		//객체생성 및 게임 알고리즘을 코딩!!! 팀장도 노는거 아닙니다~ 어렵고 빡신거 합니다.
		
		//배열은 이미 유닛들의 개수를 고정해야만 함(배열의 단점)
		//실제 게임은 유닛의 개수가 지속적으로 변경됨(생성 및 소멸 반복!!)
		//Unit[] units=new Unit[200]; 200개 오바오바 덜 필요 or 더 필요 
		//Collection(데이터를 수집하는 얘) 유동적 배열... ArrayList클래스 이용!!  * 페북, 인스타 게시글 등 개수 제한 없이 게속 무한으로 
		
		ArrayList<Unit> units=new ArrayList<Unit>(); //리스트 기차 중에~<Unit만 끌고 다닐래욥>-->제네릭 기술
		//요소의 개수 알아내기! 
		int num=units.size();
		System.out.println("요소개수: "+ num);
		
		//배열에 Unit객체들 생성하여 추가/ 기차 주렁주렁
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
		
		//***중요!! foreach 실수의 여지 적고 간단
		for(Unit u : units) {
			u.attack(); 
			u.move();
			
			
			if (u instanceof Levelupable) {
				Levelupable a=(Levelupable)u;
				a.levelUp();
			}
			
			System.out.println();
		}
		
		
		
		
		//위에 for문 돌려
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
