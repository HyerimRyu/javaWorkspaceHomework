
//다중구현(다중상속) : 개수 제한 없음. ,로 여러개 지정가능함. 
public class Sample implements AAA, BBB{

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}
	//중복된 이름의 추상메소드는 1개만 오버라이드 하면 됨!! 기능이 없으면 어차피 쭉정이야~
		//--->중복된 이름은 하나만 하면 돼~ 어차피 기능 없잖아~
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

}
