
public class SutdaCard {
	
	int num;
	boolean isKwang;
	
	
	public SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	
	public SutdaCard(){
		num=1;
		isKwang=true;
		//this(1,true);//1,true 호출
	}
	
//	SutdaCard(int num){
//		this.num=num;
//		this.isKwang=isKwang;
//	}
//	
//	SutdaCard(boolean isKwang){
//		this.num=num;
//		this.isKwang=isKwang;
//	}
	public String info() {//info가 출력이 아니야!! 메인에서 직접 출력하잖아
		//******return 
		return num+((isKwang==true)?"k":" ");
		
	}


	
	

}
