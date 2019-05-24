import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTest {

	//해킹 기본, 내 컴퓨터에 있는 파일 가져와서 복사하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//원본파일의 경로 
		String srcPath = "D:/java/workspace/Ex21FileIOTest/aaa.txt";
	
		
		//String 파일경로로 곧바로 스트림 생성 가능
		try {
			FileInputStream fis=new FileInputStream(srcPath);
			
			//읽어들인 데이터를 저장할 파일의 경로와 파일명지정
			File dstPath=new File("D:/copy"); //경로만 먼저 지정
			if(!dstPath.isDirectory()) dstPath.mkdirs();
			
			//여기까지 오면 무조건 copy폴더가 있다고 확신할 수 있어 
			//파일명을 포함한 full경로 File객체 생성
			File dstFile=new File(dstPath, "bbb.txt"); // 경로+파일명 
			//만들어진 목적지 파일까지 연결하는 Stream객체 생성
			FileOutputStream fos=new FileOutputStream(dstFile);
			
			
			//읽어온 파일의 데이터(1byte씩)를 곧바로 dstFile에 저장
			while(true) {
				byte b=(byte)fis.read(); //1byte씩 읽기
				if(b==-1) break; //무한 반복 중 끝나면 끝내, -1--> 마지막
				
				//읽어들인 1byte를 바로 목적지파일에 저장
				fos.write(b); //1byte씩 쓰기
			}
			
			fos.flush(); //끝날때 한번 물 쏵 내려줘
			
			//복사 끝났어... 
			fis.close();
			fos.close();
			
			System.out.println("복사가 완료되었습니다.");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("읽고 쓰는(복사중) 작업 중 오류가 발생하였습니다.");
		}
		

	}

}
