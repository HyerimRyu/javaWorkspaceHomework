
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
		//this(1,true);//1,true ȣ��
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
	public String info() {//info�� ����� �ƴϾ�!! ���ο��� ���� ������ݾ�
		//******return 
		return num+((isKwang==true)?"k":" ");
		
	}


	
	

}
