import java.util.*;


public class StringClassAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("Hello"); //��ü����
		
		//String class�� �ֿ� �޼ҵ�(��ɵ�)
		//1. ���ڿ� �������� ����(���ڼ�)�� ���Ͻ�Ű�� ���(Method)
		int len=s.length();    //s.�� string
		System.out.println(len);
		
		
		//2. ���ڿ� ���� ��
		System.out.println(s=="Hello");//false: �ּ� ��
		System.out.println(s.equals("Hello"));     //�� ��
		System.out.println(s.equals(new String("Hello")));
		String s1="Hello";
		System.out.println(s.equals(s1));
		System.out.println("Hello".equals(s));
		
		
		//2-1. ��ҹ��� ��
		System.out.println(s.equals("hello"));
		System.out.println(s.equalsIgnoreCase("hello"));
		
		
		//3. ���ڿ����� Ư�� char������!
		char ch =s.charAt(3);
		System.out.println(ch);
		System.out.println(s.charAt(1));
		
		int n=s.length();  //�̷��� ���� ����� �� ��ȣ��
		for(int i=0; i<n; i++) {
			System.out.println(s.charAt(i));
		}
		
		
		//��ĳ�ʸ� �̿��ؼ� �ѹ���(char) �Է¹ޱ�
		Scanner scan=new Scanner(System.in);
		
//		String str=scan.next();
//		char c=str.charAt(0);
//		System.out.println(c);
//		
		
		//4. ���ڿ� �ȿ� �� ���ڰ� �� ��° �ڸ��� ������
		int index=s.indexOf('l');
		System.out.println(index);
		
		System.out.println(s.lastIndexOf('l'));
		
		System.out.println(s.indexOf("eo"));
		System.out.println(s.indexOf('e',2));
		
		
		//5. � ���ڸ� ���� �ִ���/�Ķ���ͷ� ���޵� ���ڿ��� �� ���� �ȿ� ���ԵǾ��°�?
		s="Hello World!";
		boolean b=s.contains("World");
		System.out.println(b);
		
		
		//6. ���ڿ� ����
		String s2 = s.concat("nice android!");
		System.out.println(s);
		System.out.println( s2);
		
		
		//7. Ư�� ���ڿ��� �����ϴ°�?
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.startsWith("world"));
		
		
		//7-1. Ư�� ���ڿ��� ����Ǵ°�?
		System.out.println(s.endsWith("Hello"));
		System.out.println(s.endsWith("world"));
		
		
		//8. ��ҹ��� �ڵ���ȯ
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s); //������ �ȹٲ� Hello World!
		
		
		//9. ���ڿ��� �糡�� ���鹮�� ����(�߰� ������ ���� ����)
		s="   Hel lo  ";
		System.out.println("["+s+"]");
		s=s.trim();
		System.out.println("["+s+"]");
		
		
		
		//10. Ư�� ���� �ٲ�ġ��!
		s="Hello World! Hello android! nice android";
		System.out.println(s.replace('H', 'K'));
		System.out.println(s.replace("android", "ios"));
		//�߰� ���鹮�� ���� ����
		System.out.println(s.replace(" ",""));
		
		
		
		//11. ���ڿ� �߶󳻱�!_ä���� �� 
		String s4=s.substring(5);
		System.out.println(s4);
		
		String s5=s.substring(6, 12); //! 11�� ������ 11������ ���� �ȵ�! index 6������ 12�� ���� 11����!!!����
		System.out.println(s5);
		
		
		//12. ���ڿ� ��!!_�̸� ���ļ� 
		String s6="a";
		String s7="b";
		
		//System.out.println(s6 > s7);//error:�ּҺ񱳴� �ȵ�
		System.out.println(s6.compareTo(s7));
		
		
		
		//13. ���ڿ� �и�(���ڿ��� �и��ؼ� �迭�� �������)
		s="android:ios:nice:window:java";
		
		String[] arr=s.split(":");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//�⺻�� Data�� ���ڿ��� ��ȯ!!
		String s10=String.valueOf(10);
		System.out.println(s10.length());
		
		s10=String.valueOf(3.14);
		System.out.println(s10.length());
		
		s10=String.valueOf(false);
		System.out.println(s10.length());
		
		s10=10+"";
		s10=3.14+"";
		s10=true+"";
		
		
		//���ڿ��� �⺻������...(Integer, Double, Float, Byte,,,,Boolean
		//Wrapper Ŭ����
		int t=Integer.parseInt("100");
		double d=Double.parseDouble("3.14");
		
		new Integer(10);
		
		
		//Static �޼ҵ�
		//���� ����� �ִ�...like...printf()
		
		String str=String.format("%02d:%02d:%02d",10,5,4);
		System.out.println(str);
				
				
		//å ����p232 [String Class����ϱ�]
		String proverb="A barking dog"; //new������ ����
		String s11,s12,s13,s14; //���������μ� �޼ҵ忡�� ��ȯ�� �������� �޴´�. 
		
		System.out.println("���ڿ��� ����="+ proverb.length());
		
		s11=proverb.concat(" never bites!");
		s12=proverb.replace('B', 'b');
		s13=proverb.substring(2, 5);//index 2������ �����ؼ� 5���� �����ϱ� ������ 
		s14=proverb.toUpperCase();
		
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
	    System.out.println(s14);	
		
		
				
				
	}

}
