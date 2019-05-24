import java.util.LinkedList;

public class BookLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList¶û LinkedList¶û °ÅÀÇ ¶È°°¾Æ~ ±Ùµ¥ ArrayLisit ´õ ¸¹ÀÌ ½á ArrayLisit>LinkedList
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Milk");
		list.add("Apple");
		list.add("Flower");
		list.add("Sun");
		list.add(1, "Bear");
		list.set(2, "Moon");  //setÀÌ¶û add¶û ¹«½¼ Â÷ÀÌ?!
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
