import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest {
///////////메소드 참고 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame("Panel Test");
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임에 포함될 일반컨테이너 (컴포넌트를 담을 수 있는)객체 생성
		JPanel panel=new JPanel();
		
		//패널에 붙일 컴포넌트 생성 및 추가
		JButton btn=new JButton();
		btn.setText("btn1");
		
		JButton btn2=new JButton("btn2");
		
		//JPanel은 기본 배치관리자(LayoutManager)가 FlowLayout임. 
		panel.add(btn);
		panel.add(btn2);
		panel.add(new JButton("Button3"));
		panel.add(new JButton("Button4"));
		panel.add(new JButton("한글도 됨"));
		panel.add(new JButton("버튼"));
		
		//가로길이보다 많아지면 자동 줄바꿈
		panel.add(new JButton("Button5"));
		
		
		
		//프레임에 패널 붙이기
		frame.add(panel);
	
		//만약 프레임에 또 다른 패널을 붙이면??
		JPanel panel2=new JPanel();
		panel2.add(new JButton("aaa"));
		panel2.add(new JButton("bbb"));
		
		//프레임에 2번째 패널 추가하기
		frame.add(panel2); //패널 덮어쓰기 됨  왜??
		//기본적으로 JFrame은 BorderLayout이라는 것을 기본 배치관리자로 사용하며
		//BorderLayout은 별도의 추가적인 위치지정이 없다면 자동Center가 되어 
		//2개의 패널이 중복됨
		//기본 배치관리자를 변경할 수도 있음
		frame.setLayout(new FlowLayout());
		frame.setLayout(new GridLayout(0, 2));//row(줄), column(칸)
		
		//패널의 배경색 설정
		panel.setBackground(Color.ORANGE);
		panel2.setBackground(Color.PINK);
		
		//화면을 꾸미는데 가장 중요한 배치관리자 
		//LayoutManagerTest.java라는 문서 제작!
		
		frame.pack();//프레임 안에 있는 컴포넌트들을 감쌀 정도의 사이즈를 리사이징 해줌
		
		frame.setVisible(true);
		
		
	

	}

}
