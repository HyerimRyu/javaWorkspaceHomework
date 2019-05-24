import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame=new JFrame("LayoutManager Test");
		frame.setBounds(500, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		//컴포넌트배치(모양설계)에 가장 중요한 역할 하는 배치 관리자.(LayoutManager)
		
		//1. FlowLayout : 가장 단순하게 차례로 컴포넌트 배치. 한 줄에 더 이상 공간이 없으면 자동 다음줄로 내려감 JPanel의 기본 배치관리자
		//panel.setLayout(new FlowLayout());
		
		/*FlowLayout flowLayout=new FlowLayout();
		//배치관리자의 설정: 정렬과 간격지정
		flowLayout.setAlignment(FlowLayout.LEFT); //기본값 : Center
		//[LEADING == LEFT // TRAILING == RIGHT]
		flowLayout.setHgap(10); //수평간격 :[기본값 : 5]
		flowLayout.setVgap(20); //수직간격 :[기본값 : 5]
		
		//배치순서를 거꾸로
		panel.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		panel.setLayout(flowLayout);
		
		//FlowLayout의 생성자로 설정값 지정가능
		
		
		
		//컴포넌트의 사이즈는 버튼안의 내용물(Content)를 감쌀 정도의 사이즈로 자동지정
		//변경도 불가능!!
		panel.add(new JButton("btn1"));
		panel.add(new JButton("button1"));
		panel.add(new JButton("한글"));
		panel.add(new JButton("긴 글자도 넣으면 어떻게 될까 무조건 감쌀정도로 생성"));
		panel.add(new JButton("btn2"));
		panel.add(new JButton("btn3"));
		panel.add(new JButton("btn4"));*/
		
		//2. BorderLayout : 상, 하, 좌, 우, 가운데(5개의 영역)으로 컴포넌트 배치
//		BorderLayout borderLayout = new BorderLayout();
		//간격주기
		//set메소드 이용하기
//		borderLayout.setHgap(10);
//		borderLayout.setVgap(10);
//		panel.setLayout(borderLayout);
//		
//		//생성자메소드이용
//		panel.setLayout(new BorderLayout(10,10));
//		
//		panel.setLayout(borderLayout);
//		
//		panel.add(new JButton("btn1"), BorderLayout.NORTH);
//		panel.add(new JButton("btn2"), BorderLayout.SOUTH);
//		panel.add(new JButton("btn3"), BorderLayout.WEST);
//		//panel.add(new JButton("btn4"), BorderLayout.EAST);
//		panel.add(new JButton("btn5"), BorderLayout.CENTER);
//		panel.add(new JButton("btn6"), BorderLayout.CENTER);//덮어쓰기
//		panel.add(new JButton("btn7"));//위치 지정 안하면 자동 Center
//		
		
		//3. GridLayout : 균등하게 격자모양으로 배치
//		GridLayout gridLayout = new GridLayout(0, 3); //row(행:세로)이 우선 ; column열 
//													//0을 지정하면 필요한 개수로 자동계산
//		
//		
//		panel.setLayout(gridLayout);
//		
//		panel.add(new JButton("btn1"));
//		panel.add(new JButton("btn2"));
//		panel.add(new JButton("btn3"));
//		panel.add(new JButton("btn4"));
//		panel.add(new JButton("btn5"));
//		panel.add(new JButton("btn6"));
//		panel.add(new JButton("btn7"));//개수보다 많으면?? row값이 우선 
//		
		
		
		
		//4. BoxLayout : 가로 또는 세로 방향으로 컴포넌트 배치
//		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);//세로축 배치
//		panel.setLayout(boxLayout);
//		
//		panel.add(new JButton("aaa"));
//		panel.add(new JButton("bbb"));
//		panel.add(new JButton("ccc"));
//		panel.add(new JButton("ddd"));
//		panel.add(new JButton("eee"));
//		panel.add(new JButton("fff"));
//
//		//정렬을 하려면 컴포넌트에게 말해야해
//		JButton btn1=new JButton("btn1");
//		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
//		
//		JButton btn2=new JButton("rrrrrrrrrrrrrrrrr");
//		btn1.setAlignmentX(Component.RIGHT_ALIGNMENT);
//		
//		
//		panel.add(btn1);
//		panel.add(btn2);
		
		
		//5. CardLayout : 겹쳐서 배치
//		CardLayout cardLayout=new CardLayout();
//		panel.setLayout(cardLayout);
//		
//		panel.add(new JButton("aaa"),"1");
//		panel.add(new JButton("bbb"),"2");
//		panel.add(new JButton("ccc"),"3");
//		panel.add(new JButton("ddd"),"4");
//		
//		cardLayout.next(panel);
//		cardLayout.next(panel);
//		cardLayout.previous(panel);
//		cardLayout.first(panel);
//		cardLayout.last(panel);
//		cardLayout.show(panel, "3"); //특정 위치로 이동 이름필요
//		
		//원래 사용은 버튼으로 제어하기
		
		
		//6. 절대위치(Absolute)Layout : x,y좌표값으로 위치 지정! 생각보다 많이 써
//		panel.setLayout(null); //null 안 주면 기본값 flow그래서 null줘야해 
//		
//		JButton b1=new JButton("btn1");
//		b1.setLocation(10,20);
//		b1.setSize(80, 30);
//		panel.add(b1);
//		
//		
//		JButton b2=new JButton("btn2");
//		b2.setBounds(100,20,150,30);
//		panel.add(b2);
//		frame.add(panel);
//		
//		
//		frame.add(panel);
//		frame.setVisible(true);
//		
//
//		System.out.println(panel.getHeight());
//		JButton b3=new JButton("btn3");
//		b3.setBounds(0,panel.getHeight()-30,80,30);
//		panel.add(b3);
//		//frame.setVisible(true);
//		
//		
//		JButton b4=new JButton("btn4");
//		b4.setBounds(0,0,80,30);
//		panel.add(b4);

	}

}
