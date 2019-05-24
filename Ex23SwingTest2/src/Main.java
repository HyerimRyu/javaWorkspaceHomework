import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Frame만드는 방법
		//방법1. 객체 생성 후 직접 메소드 호출해서 설정
		JFrame frame=new JFrame();
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//방법2. JFrame을 상속받은 클래스 객체를 만들고 그 클래스의 생성자 안에서 설정작업 완료!
		//TestFrame f=new TestFrame();
		
		//방법3. main()메소드를 보유한 Main Class도 클래스니까 이 친구를 활용하기!! 
		//JFrame을 상속받고 main()메소드도 보유한 MyFrame생성 
		
		//JFrame의 유용한 메소드들...
		
		//1. x버튼 눌렀을 때 프로그램 종료설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JFrame.DO_NOTHING_ON_CLOSE : 아무 반응 없는 것(AWT의 Frame)
//		JFrame.DISPOSE_ON_CLOSE : 프레임종료와 프로그램 종료가 별개
//		JFrame.EXIT_ON_CLOSE : 프레임 종료하면 프로그램도 종료
//		JFrame.HIDE_ON_CLOSE : (기본값) : 프레임만 숨겨지고 프로그램은 끝나지 않음
		
		
		
		
		//2. 프레임이 화면에서 나타나는 위치.
		frame.setLocation(100, 200); //프레임 상자의 좌상단지점좌표
		
		//2-1. 프레임을 화면의 정 가운데 배치 (고려 : 모니터의 사이즈, 프레임의 사이즈)
		//스크린사이즈 얻어오기
		Toolkit toolkit=Toolkit.getDefaultToolkit(); //운영체제 대리인 얻어오기
		Dimension screenSize = toolkit.getScreenSize();
		System.out.println(screenSize.getWidth()+"*"+screenSize.getHeight());
		
		int width=(int)screenSize.getWidth();
		int height=(int)screenSize.getHeight();
		
		frame.setLocation(width/2-150, height/2-100);
		
		//3. location + size 한방에 설정!
		frame.setBounds(10, 20, 500, 300);
		
		//4. 프레임의 사이즈 조절 허용여부
		frame.setResizable(false); //기본값:true
		
		//5. 프레임이 가려지지 않도록 제일 앞으로 배치
		frame.setAlwaysOnTop(true);
		
		//6. 프레임에 타이틀
		frame.setTitle("JFrame Test");
		
		//7. 프레임의 아이콘변경 
		Image img=toolkit.getImage("images/ms19.png");
		frame.setIconImage(img);
		
		//8. (가장 중요!!)컴포넌트 추가!!
		JButton btn=new JButton("Button");
		frame.add(btn);//반드시 추가가 setVisible()보다 먼저 작성되어 있어야 해 
		
		frame.setVisible(true);
		
		//9. 컴포넌트 제거!! 
		frame.remove(btn);
		
		//10. 컴포넌트의 변경을 적용하기 위해 화면 갱신! 
		frame.repaint(); //다시그려 
		//SwingUtilities.updateComponentTreeUI(frame);
	
		//최상위 Container(JFrame)에 곧바로 컴포넌트들(JButton...etc)을 추가하는 방식으 선호하지 않아
		//일반 Container인 JPanel(패널)이용하기
		//JPanelTest.

	}//main method

}//main class

class TestFrame extends JFrame{
	//생성할 때 자동으로 실행되는 메소드: 생성자
	public TestFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
