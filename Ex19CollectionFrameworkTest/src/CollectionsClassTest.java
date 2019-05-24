import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collections클래스의 static메소드
		//1) Collections.sort();
		//2) Collecions.shuffle();
		//3) Collections.binarySearch();
		
		ArrayList<String> datas=new ArrayList<String>();
		
		datas.add("asdggs");
		datas.add("Nice");
		datas.add("Great");
		datas.add("Nice");
		datas.add("World");
		datas.add("Hello");
		System.out.println(datas.toString());
		
		Collections.sort(datas);
		System.out.println(datas.toString());
		
		Collections.shuffle(datas);
		System.out.println(datas.toString());
		

	}

}
