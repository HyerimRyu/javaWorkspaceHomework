import java.util.*;


public class String_Memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제 6
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		
		
		//문제5번 다시풀기
/*		문제5.
		사용자로부터 전화번호를 입력받되 첫3자리, 두번째 3~4자리, 세번째 4자리 숫자를 따로따로
		입력 받아서 하나의 문자열로 합쳐서 저장하고 출력하시오. 단, 사이에 '-'로 구분자를 갖도록 한다.

		예)  
		  첫번째 자리 입력(3자리) : 010
		  두번째 자리 입력(3~4자리) : 12345
		  [잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.]
		  두번째 자리 입력(3~4자리) : 1234
		  세번째 자리 입력(4자리) : 567a
		  [잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.]
		  세번째 자리 입력(4자리) : 5678 

		  입력된 전화번호는 [ 010-1234-5678 ] 입니다.*/
		/*
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		*/
		
	}
}

		
		
		//문제4번 스페이스 제거
		/*Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		
		System.out.println(s1.replace(" ",""));	
	}
	}	*/
		
		//문제3 에러!!!!!다시 보기 프린트 compare!!!!!!
		/*문제3.
		프로그램 사용자로부터 영단어을 입력 받는다. 그리고 나서 입력 받은 영단어를 구성하는 
		문자 중에서 아스키 코드의 값이 가장 큰 문자를 찾아서 출력하는 프로그램을 작성해보자.
		예를 들어서 입력된 영단어가 "LOVE"라면 이 중에서 아스키 코드 값이 가장 큰 문자는 V
		이므로 V가 출력되어야 한다.*/
		
		/*Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		int len=s1.length();
		
		int input=Integer.parseInt(s1);
		System.out.println(s1.compare);
	}	

*/	
	
	
	
		
		//메모 2번 *out of bound 오류 해결: -1
		/*String s1;
		String s2;
		
		Scanner scan=new Scanner(System.in);
		s1=scan.next();
		System.out.println(s1);
		
		int len=s1.length();
		
		for(int i=len; i>0; i--) {
			System.out.print(s1.charAt(i-1));
		}
		
	}*/
	
		
	
	//메모 1번 뽑아내고 출력시 형변환
	/*	Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char c=str.charAt(0);
		
		int n=str.length();
		for(int i=0; i<n; i++) {
			System.out.println((char)(str.charAt(i)+1));
		}
		
	}*/


