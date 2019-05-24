
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First f=new First(); //제대로 된 캐스팅(낚시 줄 휘리릭 걸다| 빨대 꽂았어)
		//참조변수 f가 First를 캐스팅했다. 
		Second s=new Second(); //제대로 된 캐스팅
		
		//다른 종류의 캐스팅(상속관계 에서의..)
		f=new Second(); //(원래 안되는건데) 가능해!!!!!!!!!!!!!
						//부모 참조변수는 자식 객체를 참조할 수 있음. 부모가 자식을 참조할 때만 허용. 왜? 이래도 에러가 안날거 확신->업 캐스팅
		//s=new First();//Error 호로자식  
					 // 자식 참조변수가 부모객체를 참조 할 수 없어.(왜? 부모객체는 자식 객체의 멤버를 갖고 있지 않아서)->다운캐스팅
		
		
		//부모참조변수로 멤버 제어할 수 있음.
		//단, 부모객체의 멤버만 제어 가능 //딱 부모 리모컨에 있는 기능 만큼만 가능 
		f.a=10;
		f.showFirst();
		//자식객체를 참조할 수는 있더라도,
		//자식 객체의 멤버를 마음대로 쓸 수는 없음.
		//f.showSecond(); //error
		
		//그럼에도 자식객체만의 멤버-ㅕ를 사용하고 싶다면?
		f=(First)new Second(); //업 캐스팅!(묵시적 형변환!)
		Second s2; //자식 참조변수를 만들어야 함.
		s2=(Second)f;//(자식이-> 부모를): 다운캐스팅->명시적 형변환!!
		s2.showFirst();
		s2.showSecond();
		
		((Second)f).showFirst();//왜 에러? 형변환 우선순위 연산자 때문에 .먼저하고 ()해서 그래 
	    
		
		First f2=s;//업 캐스팅(부모가 자식을)
		
//		First f3=new First();//제대로 된 casting
//		Second s3; //자식
//		//다운캐스팅 자식->부모 : 호로
//		s3=(Second)f3; //다운캐스팅: 자식->부모 
//		s3.showSecond(); //error --casting 에러!! 사기친거야. 이클립스가 속은거야
//		
//		Second s4=new Second(); //제대로 된 casting
//		First f4=s4; //업 캐스팅(묵시적 형변환)
//		f4.showFirst();
		//f4.showSecond(); //error : 실제 객체가 showSecond()가 있더라도 에러
		
		//그럼 왜 이런 업캐스팅을 사용할까?  ... 를 알아보기 전에 잠깐!
		//혹시 오버라이딩 된 메소드가 있다면?? 어떻게 될까? 
		//즉 First에 show()를 오버라이드해서 Second에 show() 추가
		
		Second s5=new Second(); //제대로 된 캐스팅
		s5.show(); //오버라이드 메소드 호출(Second의 show)
		
		//업캐스팅 되었을 때!!
		First f5=new Second();
		f5.show(); //실제 참조하는 객체의 오버라이드 된 메소드 실행!
		System.out.println();
		//그럼 이 기술이 뭐에 유용한건가??
		//부모 참조변수 하나로 자식들 모두 제어가능!! 
		
		First obj;
		
		obj=new First();
		obj.show();//다형성 글씨는 같은데 성질이 다르네 ->출력결과 First
		
		
		obj=new Second();
		obj.show();//다형성 글씨는 같은데 성질이 다르네 ->출력결과 Second
		
		
		obj=new Test();
		obj.show();//다형성 글씨는 같은데 성질이 다르네 ->출력결과 Test
		
		obj=new Third(); //조부모->손자 참조가능 : UP casting
		obj.show();
		
		

	}

}
