
public class Ex7_14SutdaCard {
	
	final int NUM;
	final boolean IS_KWANG;
	
	Ex7_14SutdaCard(){
		this(1, true);
	}
	
	Ex7_14SutdaCard(int num, boolean isKwang){
		this.NUM=num;
		this.IS_KWANG=isKwang;
	}
	
	public String toString() {
		return NUM + (IS_KWANG ? "K" : " ");
	}
}


class Exercise7_14{
	public static void main(String args[]) {
		SutdaCard card = new SutdaCard(1, true);
	}
}