import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class MyNewFrame extends JFrame{
	
	private JPanel panel;
	private JButton button;
	private JLabel label;
	
	String ampm[]= {"오전","오후"};
	Integer hh[]= {1,2,3,4,5,6,7,8,9,10,11,12};
	Integer mm[]= {1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,
				51,52,53,54,55,56,57,58,59,60};
	
	public MyNewFrame() {
		// TODO Auto-generated constructor stub
		
		setTitle("객체지향 프로그래밍 포트폴리오 과제1 [Alarm + Weather]");
		setPreferredSize(new Dimension(400, 600)); //사이즈
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 200);
		
		//Tab1
		JTabbedPane tabbedPane=new JTabbedPane();
		JPanel tab=new JPanel();
		//tab.setLayout(new BorderLayout());
		
		alarmRepeat tab1=new alarmRepeat();
		tabbedPane.addTab("날씨이미지추가", tab1);
		add(tab.add(tab1));
		
		
		//Tab2
//		tab2Schedule tab2=new tab2Schedule();
//		tabbedPane.addTab("스케쥴", tab2);
//		add(tab.add(tab2));
//		
//		add(tabbedPane, BorderLayout.CENTER);
//		setBounds(600,100,350,150);
//		setVisible(true);
		
		
		//알람 
		JPanel panel=new JPanel();
		panel.setLayout(new BorderLayout()); 
		panel.setBorder(BorderFactory.createEmptyBorder(9 , 19 , 9 , 19)); //패딩주기->오늘의 할 일에 추가
		panel.setBackground(Color.YELLOW); //색이 안 들어감
		
		Container c=getContentPane();
		GridLayout grid=new GridLayout(5, 3);
		grid.setVgap(10);
		
		c.setLayout(grid);
		c.add(new JLabel("오전 오후"));
		JComboBox<String> ampmCombo=new JComboBox<String>(ampm);
		c.add(ampmCombo);
		
		c.add(new JLabel("Hour"));
		JComboBox<Integer> hhCombo=new JComboBox<Integer>(hh);
		c.add(hhCombo);
		
		c.add(new JLabel("Min"));
		
		JComboBox<Integer> mmCombo=new JComboBox<Integer>(mm);
		c.add(mmCombo);
		
		//setSize(400,500);
		
		JButton addBt=new JButton("설정"); //추가 
		addBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//설정창 되는거-> set으로 넘어가 
				
			}
		});
		JButton checkBt=new JButton("정지"); //정지->날씨api 연결//액션리스너
		checkBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				WeatherInfo_parser_3 weather=new WeatherInfo_parser_3();
			}
		});
		
		panel.add(checkBt,BorderLayout.NORTH);
		panel.add(addBt,BorderLayout.SOUTH);
		
		setLayout(new FlowLayout()); //위에 일자로 
		
		JLabel label=new JLabel("알람 정지 후 오늘의 날씨 보기");
		add(label);
		
		//오늘의 일정 추가 ex24-label참고 
		/*JLabel schedule=new JLabel("오늘의 일정");
		add(schedule);
		
		//TextField - 오늘의 일정 
		JTextField tf=new JTextField(20);//최소 20글자. 이상도 써져
		add(tf);*/
		
		
		
		//메인 화면에 이미지 아이콘 삽입 //날씨창에도 이미지 추가 
		ImageIcon icon=new ImageIcon("images/icon_png/alarm/mainIcon_alarm_clock.png"); //이미지 파일 일러로 
		Image im=icon.getImage();
		Image im2=im.getScaledInstance(150, 150, Image.SCALE_DEFAULT);  //크기 수정 및 
		ImageIcon icon2=new ImageIcon(im2);
		JLabel imgClock=new JLabel(icon2);
		add(imgClock);
		
		
		//아이콘
		Toolkit toolkit=Toolkit.getDefaultToolkit(); 
		Image img=toolkit.getImage("images/icon_png/alarm/mainIcon_alarm_clock.png");
		setIconImage(img);
		
		
		//*중요*프레임에 패널 붙이기
		add(tab,BorderLayout.SOUTH);
		add(panel,BorderLayout.CENTER);
		
		pack();//프레임 안에 있는 컴포넌트들을 감쌀 정도의 사이즈를 리사이징 해줌
		setVisible(true);
		
	}//end of constructor

}//end of class
