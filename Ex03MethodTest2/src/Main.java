import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		
		stu.name="sam";
		stu.kor=80;
		stu.eng=70;
		
		stu.show();
		
		Student stu2=new Student();
		//값 일일이 대입하는게 너무 짜증나!!
		
		//"robin", 100, 50 값들을 한 번에 입력하는 기능 
		//기능(Method)를 호출하면서 값을 전달할 때 사용하는 것이 () 파라미터!!
		//stu2.입력기능("robin", 100, 50);//Student 클래스에 기능 설계! 
		//전달하는 값(robin, 100, 50)(인수: argument)을 보내면 Method에는 인수를 받을 수 있는 매개변수(parameter)가 있어야 해 
		stu2.setMembers("robin", 100, 50);
		stu2.show();
		
		Student stu3=new Student();
		stu3.setMembers("hong", 80, 45);
		stu3.show();
		
		//멤버변수 중에서 하나만 값 변경하기!!
		//접근제한자를 배우면 필수로 만들어야 할 기능!
		//stu3.eng=600;//이 문법이 불가능할 수 있어. 
		//멤버값 하나만 변경하는 기능도 만들어 두는 것이 좋음
		stu3.setName("kim");
		
		//멤버값을 일일이 대입하는 기능 사용하기!!
		Student stu4=new Student();
		stu4.setName("lee");
		stu4.setKor(70);
		//stu4.eng=800;//오류의 가능성이 많음.
		stu4.setEng(800);//막아주게끔.. 
		stu4.setEng(80);
		
		stu4.show();
		
		//학생의 총점을 출력하기!!
		int total=stu4.kor+stu4.eng;
		System.out.println("총점 : "+ total);
		
		total=stu3.kor+stu4.eng;//실수의 여지 많음
		System.out.println("총점 : "+total);
		
		//총점계산도 Student객체의 기능으로 있으면 좋겠죠????!
		int t=stu4.calTotal(); //total값을 계산해서 리턴해줌!  /////////////*** 리턴값 받을 때 =써!!!
		System.out.println("총점 : "+ t);
		
		//사실 return을 받은 형태의 메소드 호출은 익숙함!
		Random rnd=new Random();
		int n=rnd.nextInt(); //이런형태!!! int n에 nextInt()의 리턴값을 받은거야..!! 
		
		//평균을 계산해주는 기능!!
		double aver=stu4.calAverage();//메소드의 리턴자료형 주의!
		System.out.println("평균 : "+ aver);
		
		aver=stu4.calAverage2(); //메소드의 리턴자료형 주의
		System.out.println("평균 : "+aver);
		
		//평균과 총점을 모두 계산해주는 기능?! 가능할까요?
		//즉, 2개 값 return(리턴)하기? 가능?! 안돼욥 C언어랑 같아요
		//리턴 2개 이상은 불가능!!! ERROR!!!! 
		
		//멤버변수의 값을 리턴받는 기능!!
		//멤버변수 하나 값 입력하기(setXXX)의 반대기능!!
		//name변수에 stu4객체의 name멤버변수 값 대입하기 
		//만약, 접근제한자를 배우면 불가능해짐!! 
		String name=stu4.getName();
		int kor=stu4.getKor();
		int eng=stu4.getEng();
		
		
		//메소드만 있는 클래스도 가능함!!
		//실제로 많이 필요로 함! 
	}

}
