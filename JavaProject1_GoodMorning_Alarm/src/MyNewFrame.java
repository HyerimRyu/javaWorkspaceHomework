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
	
	String ampm[]= {"����","����"};
	Integer hh[]= {1,2,3,4,5,6,7,8,9,10,11,12};
	Integer mm[]= {1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,
				51,52,53,54,55,56,57,58,59,60};
	
	public MyNewFrame() {
		// TODO Auto-generated constructor stub
		
		setTitle("��ü���� ���α׷��� ��Ʈ������ ����1 [Alarm + Weather]");
		setPreferredSize(new Dimension(400, 600)); //������
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 200);
		
		//Tab1
		JTabbedPane tabbedPane=new JTabbedPane();
		JPanel tab=new JPanel();
		//tab.setLayout(new BorderLayout());
		
		alarmRepeat tab1=new alarmRepeat();
		tabbedPane.addTab("�����̹����߰�", tab1);
		add(tab.add(tab1));
		
		
		//Tab2
//		tab2Schedule tab2=new tab2Schedule();
//		tabbedPane.addTab("������", tab2);
//		add(tab.add(tab2));
//		
//		add(tabbedPane, BorderLayout.CENTER);
//		setBounds(600,100,350,150);
//		setVisible(true);
		
		
		//�˶� 
		JPanel panel=new JPanel();
		panel.setLayout(new BorderLayout()); 
		panel.setBorder(BorderFactory.createEmptyBorder(9 , 19 , 9 , 19)); //�е��ֱ�->������ �� �Ͽ� �߰�
		panel.setBackground(Color.YELLOW); //���� �� ��
		
		Container c=getContentPane();
		GridLayout grid=new GridLayout(5, 3);
		grid.setVgap(10);
		
		c.setLayout(grid);
		c.add(new JLabel("���� ����"));
		JComboBox<String> ampmCombo=new JComboBox<String>(ampm);
		c.add(ampmCombo);
		
		c.add(new JLabel("Hour"));
		JComboBox<Integer> hhCombo=new JComboBox<Integer>(hh);
		c.add(hhCombo);
		
		c.add(new JLabel("Min"));
		
		JComboBox<Integer> mmCombo=new JComboBox<Integer>(mm);
		c.add(mmCombo);
		
		//setSize(400,500);
		
		JButton addBt=new JButton("����"); //�߰� 
		addBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//����â �Ǵ°�-> set���� �Ѿ 
				
			}
		});
		JButton checkBt=new JButton("����"); //����->����api ����//�׼Ǹ�����
		checkBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				WeatherInfo_parser_3 weather=new WeatherInfo_parser_3();
			}
		});
		
		panel.add(checkBt,BorderLayout.NORTH);
		panel.add(addBt,BorderLayout.SOUTH);
		
		setLayout(new FlowLayout()); //���� ���ڷ� 
		
		JLabel label=new JLabel("�˶� ���� �� ������ ���� ����");
		add(label);
		
		//������ ���� �߰� ex24-label���� 
		/*JLabel schedule=new JLabel("������ ����");
		add(schedule);
		
		//TextField - ������ ���� 
		JTextField tf=new JTextField(20);//�ּ� 20����. �̻� ����
		add(tf);*/
		
		
		
		//���� ȭ�鿡 �̹��� ������ ���� //����â���� �̹��� �߰� 
		ImageIcon icon=new ImageIcon("images/icon_png/alarm/mainIcon_alarm_clock.png"); //�̹��� ���� �Ϸ��� 
		Image im=icon.getImage();
		Image im2=im.getScaledInstance(150, 150, Image.SCALE_DEFAULT);  //ũ�� ���� �� 
		ImageIcon icon2=new ImageIcon(im2);
		JLabel imgClock=new JLabel(icon2);
		add(imgClock);
		
		
		//������
		Toolkit toolkit=Toolkit.getDefaultToolkit(); 
		Image img=toolkit.getImage("images/icon_png/alarm/mainIcon_alarm_clock.png");
		setIconImage(img);
		
		
		//*�߿�*�����ӿ� �г� ���̱�
		add(tab,BorderLayout.SOUTH);
		add(panel,BorderLayout.CENTER);
		
		pack();//������ �ȿ� �ִ� ������Ʈ���� ���� ������ ����� ������¡ ����
		setVisible(true);
		
	}//end of constructor

}//end of class
