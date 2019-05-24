

//인터페이스를 상속받는 인터페이스를 만들 때는 extends 키워드 사용!
public interface SSS extends KKK{ //extends KKK는 상속 같은거 또 쓰기 귀찮다~ implements는 안돼 다른 개념이야
	
	
	//보이지는 않지만 이미 이 SSS인터페이스 안에 KKK클래스 안에 있는 aaa(). bbb()가 존재함
	public abstract void ccc();
	

}
