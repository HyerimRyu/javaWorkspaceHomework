import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	//바이트 스트림: 이미지, 동영상, 음악 등 텍스트 외의 모든 것 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("저장할 데이터 입력 : ");
		//파일에 저장할 데이터
		String data= scanner.next();
		data+="/n";
		
		//데이터를 저장할 파일의 경로와 파일명.확장자까지 가지고 있는 객체 생성
		//경로를 지정하지 않으면 기본적으로 이 자바 문서가 있는 프로젝트 폴더에 저장! 
		File file=new File("aaa.txt");
		
		//특정(내가 만든) 폴더 안에 파일 저장
		//파일의 경로구분자( 역슬래시(\))는 운영체제마다 다름.
		//windows-->\(역슬래시)도 되고, /(슬래시)도 됨: 리눅스, 맥은---> /(슬래시)
		file=new File("kkk\\aaa.txt"); //역슬래시는 2개 \\쓰고, 슬래시는 / 한번만! 
		file=new File("kkk/aaa.txt"); //이 형태를 많이 써!!!!!!!!!! 
		//file=new File("kkk"+File.separator+"aaa.txt"); //알아서 구분자 결정해줌 
		
		// 미리 kkk폴더를 만들지 않으면 에러남
		// 만약 프로그램적으로 폴더를 만들고 싶다면
		// 폴더를 만들어 달라는 명령을 수행해야함
		
		// 폴더가 없을 때 만들어야 하겠죠. 그러므로 가장 먼저 그 폴더명이 있는지 검사!
		// 파일명을 제외한 경로만 가지고 있는 File객체 생성
		File path = new File("kkk"); //폴더명만 작성
		if( !path.isDirectory()) { //그 폴더가 없냐??
			//없으면 디렉토리를 만들어~~->make
			path.mkdirs(); //mk : make의 줄임말 //mkdirs 하위폴더가 존재한다면 그 하위폴더까지 다 만들어줌
		}
		
		//위에서 만든 경로와 내가 만들 파일명을 결합하여 다시 File객체 생성
		file=new File(path, "bbb.txt"); //경로와 파일명 결합!! 
		
		//내 프로젝트가 아닌 특정 폴더를 직접 바로 지정하는 것도 가능함. 
		file=new File("d:/aaa.txt");
		
		//경로를 한꺼번에 만들 수 있음.
		path=new File("d:/files/kkk");
		if(path.isDirectory())path.mkdirs();
		
		file=new File(path, "hello.java");
		
		
		//내 데이터를 파일에 저장하기(파일쪽으로 내보내기:output)
		//멀리 떨어진 파일에 데이터를 보내려면 반드시 Stream(연결다리)필요!!
		
		//Stream중에서 내보내는 방향의 Stream을 OutputStream이라고 함.
		//그 중에 파일에 내보내는 능력을 가진 스트림클래스를 객체로 생성
		try {
			//만약 aaa.txt파일이 없다면 자동 생성시킴! 단, 폴더는 자동생성되지 않음. 
			FileOutputStream fos=new FileOutputStream(file);
			 //두 번째 파라미터, append여부(true, false)->어펜드모드, 덮어쓰기 아니고 저장하기모드
			//FileOutputStream fos=new FileOutputStream(file,true);
			
			//스트림을 통해 데이터를 파일에 작성(내보내기)
			//fos.write(65); //이런 식으로 보내면 1바이트씩 보내기 때문에 반복문이 필요함. 불편해 
			//바이트 배열(byte[])로 데이터 덩어리를 보내는 방식이 선호 
			//바이트 스트림은 String을 파라미터로 전달할 수 없도록 되어있음.
			//그래서 String-->byte[]변환
			//byte[] aaa= data.getBytes(); 아래처럼 한방에 써
			fos.write(data.getBytes());
			fos.flush(); //Stream 버퍼에 찌꺼기가 남아있을 수 있어서 비우도록 like 변기 물 내리기 
						 //write-flush는 쌍 화장실갔다 물내리기 한 쌍
			fos.close(); //언제나 Stream작업이 끝나면 스트림을 닫는 작업을 해야해
			
			
			
			//여기까지 커서가 왔다는건 에러가 없었다는 것!!!!!! 
			System.out.println("파일 저장 성공!!");
			
			
		} catch (FileNotFoundException e) {System.out.println("파일이 존재하지 않습니다.");} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("쓰기 작업 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
		
		//File 클래스 객체의 주요 메소드
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());

	}

}
