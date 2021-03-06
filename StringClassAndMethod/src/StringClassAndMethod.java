import java.util.*;


public class StringClassAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("Hello"); //객체생성
		
		//String class의 주요 메소드(기능들)
		//1. 문자열 데이터의 길이(글자수)를 리턴시키는 기능(Method)
		int len=s.length();    //s.는 string
		System.out.println(len);
		
		
		//2. 문자열 값의 비교
		System.out.println(s=="Hello");//false: 주소 비교
		System.out.println(s.equals("Hello"));     //값 비교
		System.out.println(s.equals(new String("Hello")));
		String s1="Hello";
		System.out.println(s.equals(s1));
		System.out.println("Hello".equals(s));
		
		
		//2-1. 대소문자 비교
		System.out.println(s.equals("hello"));
		System.out.println(s.equalsIgnoreCase("hello"));
		
		
		//3. 문자열에서 특정 char얻어오기!
		char ch =s.charAt(3);
		System.out.println(ch);
		System.out.println(s.charAt(1));
		
		int n=s.length();  //이렇게 쓰는 방법을 더 선호해
		for(int i=0; i<n; i++) {
			System.out.println(s.charAt(i));
		}
		
		
		//스캐너를 이용해서 한문자(char) 입력받기
		Scanner scan=new Scanner(System.in);
		
//		String str=scan.next();
//		char c=str.charAt(0);
//		System.out.println(c);
//		
		
		//4. 문자열 안에 그 문자가 몇 번째 자리에 있을까
		int index=s.indexOf('l');
		System.out.println(index);
		
		System.out.println(s.lastIndexOf('l'));
		
		System.out.println(s.indexOf("eo"));
		System.out.println(s.indexOf('e',2));
		
		
		//5. 어떤 문자를 갖고 있는지/파라미터로 전달된 문자열이 내 문자 안에 포함되었는가?
		s="Hello World!";
		boolean b=s.contains("World");
		System.out.println(b);
		
		
		//6. 문자열 결합
		String s2 = s.concat("nice android!");
		System.out.println(s);
		System.out.println( s2);
		
		
		//7. 특정 문자열로 시작하는가?
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.startsWith("world"));
		
		
		//7-1. 특정 문자열로 종료되는가?
		System.out.println(s.endsWith("Hello"));
		System.out.println(s.endsWith("world"));
		
		
		//8. 대소문자 자동변환
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s); //원본은 안바껴 Hello World!
		
		
		//9. 문자열의 양끝쪽 공백문자 제거(중간 공백은 제거 안함)
		s="   Hel lo  ";
		System.out.println("["+s+"]");
		s=s.trim();
		System.out.println("["+s+"]");
		
		
		
		//10. 특정 문자 바꿔치기!
		s="Hello World! Hello android! nice android";
		System.out.println(s.replace('H', 'K'));
		System.out.println(s.replace("android", "ios"));
		//중간 공백문자 제거 가능
		System.out.println(s.replace(" ",""));
		
		
		
		//11. 문자열 잘라내기!_채팅할 때 
		String s4=s.substring(5);
		System.out.println(s4);
		
		String s5=s.substring(6, 12); //! 11번 이지만 11번까지 쓰면 안돼! index 6번부터 12번 전인 11까지!!!주의
		System.out.println(s5);
		
		
		//12. 문자열 비교!!_이름 정렬순 
		String s6="a";
		String s7="b";
		
		//System.out.println(s6 > s7);//error:주소비교는 안됨
		System.out.println(s6.compareTo(s7));
		
		
		
		//13. 문자열 분리(문자열을 분리해서 배열로 만들어줌)
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
		
		//기본형 Data를 문자열로 변환!!
		String s10=String.valueOf(10);
		System.out.println(s10.length());
		
		s10=String.valueOf(3.14);
		System.out.println(s10.length());
		
		s10=String.valueOf(false);
		System.out.println(s10.length());
		
		s10=10+"";
		s10=3.14+"";
		s10=true+"";
		
		
		//문자열을 기본형으로...(Integer, Double, Float, Byte,,,,Boolean
		//Wrapper 클래스
		int t=Integer.parseInt("100");
		double d=Double.parseDouble("3.14");
		
		new Integer(10);
		
		
		//Static 메소드
		//포멧 만들어 주는...like...printf()
		
		String str=String.format("%02d:%02d:%02d",10,5,4);
		System.out.println(str);
				
				
		//책 예제p232 [String Class사용하기]
		String proverb="A barking dog"; //new연산자 생략
		String s11,s12,s13,s14; //참조변수로서 메소드에서 반환된 참조값을 받는다. 
		
		System.out.println("문자열의 길이="+ proverb.length());
		
		s11=proverb.concat(" never bites!");
		s12=proverb.replace('B', 'b');
		s13=proverb.substring(2, 5);//index 2번부터 시작해서 5번에 도달하기 전까지 
		s14=proverb.toUpperCase();
		
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
	    System.out.println(s14);	
		
		
				
				
	}

}
