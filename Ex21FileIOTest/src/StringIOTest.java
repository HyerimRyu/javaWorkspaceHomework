import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class StringIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열!! 채팅!!!
		
		//문자열 데이터를 한 줄 씩 또는 한 단어씩 읽거나 쓰려면?! 특히, 읽을때..
		//기존 바이트스트림 방식의 InputStream은 몇 바이트를 읽어야할지 파악하기 어려워
		//그래서 좀 더 편하게 문자열 단위로 데이터의 IO를 수행하기 위해 
		//문자 스트림 방식을 사용.(Reader, Writer)
		
		
		//사용자 입력을 받아 그 데이터를 파일에 지속적으로 저장하는(덮어쓰기X) 프로그램
//		
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.print("저장할 단어 입력(no를 입력하면 종료): ");
			String str=scanner.next();
			
			if(str.equalsIgnoreCase("no")) { //대소문자 상관없이! 
				System.out.println("입력이 종료됩니다.");
				break;
			}
			
			
			//종료되지 않았다면 파일에 저장..
			//목표위치 : "본인프로젝트/files/data.txt"
			File path=new File("files");
			if( !path.exists() ) path.mkdirs();
			
			
			//경로+파일명.확장자: 파일의 전체경로
			File file=new File(path, "data.txt");
			
			//파일과 연결할 스트림(문자스트림)
			//내 데이터를 파일쪽으로 내보내기 위한 스트림(OutputStream-->Writer)
			//자바문서와 data.txt문서 사이에 스트림 만든거(FileWriter)객체생성
			try {
				FileWriter filewriter=new FileWriter(file, true); //append모드
//				filewriter.write(str); //저장은 되지만 단어구분이나 특정format으로 저장시키는것 어려움
//				filewriter.flush();
//				filewriter.close();
				
				//FileWriter를 바로 사용하기보다 좀 더 익숙한 방법으로 저장시키고 싶음. 
				//즉, 콘솔창 출력하듯이(Println) 마치 System.out.print()이렇게 쓰듯이
				//할 수 있도록 보조스트림 클래스 있어! 
				PrintWriter writer=new PrintWriter(filewriter);
				writer.println( str);
				writer.flush();
				writer.close(); //자동으로 FileWriter는 close()됨.
				
				
			} catch (IOException e) {
				System.out.println("파일쓰기 실패!! ");
			}
			
		}//while문
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("저장된 파일의 데이터들을 화면에 출력합니다.");
		System.out.println("-------------------------------------------");
		System.out.println();
		
		
		//한 줄에 한 단어씩 있으므로 읽어들인 단어를 ArrayList에 추가시키기 
		ArrayList<String> datas=new ArrayList<String>();
		
		File file=new File("files/data.txt");
		//읽어올 파일과 스트림 연결작업 시작! 
		try {
			FileReader fr=new FileReader(file);
			
//			int a = fr.read(); //한 글자씩 읽기: 영어면 1바이트, 한글이면 2~3byte가 읽어짐. 언어마다 알아서 바이트 수 결정
//			
//			System.out.println(a);
			//위 방법은 반복문 필요; 몇 글자인지 모르잖아. -->불편! 줄바꿈, 일정단위 끊어서 읽어들이기 불편함
			
			//그래서 읽어들일 때 편하게 보조문자 스트림 class있어. 
			//그 중 가장 많이 사용되는 BufferedReader를 사용! 
			BufferedReader reader = new BufferedReader(fr);
			//한 줄 씩 읽어들여..
			String line=reader.readLine(); //몇 글자가 됐던 한줄로 읽어들여. 엔터가 들어간 곳까지
			while(line!=null) {//계속 읽어
				//읽어온 데이터를 ArrayList에 추가
				datas.add(line);
				
				line=reader.readLine();//다음줄 읽어오기
			}
			
			System.out.println("파일 읽기 종료!!");
			
			//ArrayList에 추가된 데이터를 차례로 화면에 출력하기!!
			for(int i=0; i<datas.size(); i++) {
				System.out.println(i + ":" + datas.get(i));
			}
			
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일 읽기 실패!");
		}
		
		
		

	}//main method

}
