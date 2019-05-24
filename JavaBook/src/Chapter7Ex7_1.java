/*
public class Chapter7Ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class SutdaDeck{
			final int CARD_NUM=20;
			SutdaCard[] cards = new SutdaCard[CARD_NUM];
			
			SutdaDeck() {
				//int[] sutda
				
			}
		}

		class SutdaCard{
			int num;
			boolean isKwang;
			
			SutdaCard(){
				this(1, true);
			}
			SutdaCard(int num, boolean isKwang){
				this.num=num;
				this.isKwang=isKwang;
			}
			//info()대신 object클래스의 toString()을 오버라이딩 했다.
			public String toString() {
				return num + (isKwang?"K":"");
			}
//		}
		class Exercise7_1{
			public static void main(String args[]) {
				SutdaDeck deck = new SutdaDeck();
				
				for(int i=0; i<deck.cards.length; i++)
					System.out.println(deck.cards[i]+",");
			}
		}
*/