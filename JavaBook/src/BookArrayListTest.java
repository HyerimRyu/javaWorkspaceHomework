import java.util.ArrayList;

public class BookArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("MIlk");
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
