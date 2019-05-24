import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlarmButtonEvent extends JFrame{
	private JLabel label;
	private JButton btn;
	
	
	public AlarmButtonEvent() {
		// TODO Auto-generated constructor stub
		setTitle("알람설정1");
		setSize(40, 40);
		
		JPanel panel=new JPanel();
		add(panel);
		setVisible(true);
		
	}//생성자 버튼

	//메소드
	void StopShowWeather() {
		//평상시 버튼 이미지
		JButton btn=new JButton(new ImageIcon("images/ms18.png"));
		
		//마우스가 버튼에 올라갔을 때의 이미지 설정
		btn.setRolloverIcon(new ImageIcon("images/ms19.png"));
		
		//마우스가 버튼을 클릭했을 때의 이미지 설정
		btn.setPressedIcon(new ImageIcon("images/weather.png"));
		
		//버튼에 대한 설정들
		//배경색 채우기 없음
		btn.setContentAreaFilled(false); //배경색 채우기 없음
		btn.setFocusPainted(false); //포커스를 표시하는 네모난 사각형 안보이도록
		btn.setBorderPainted(false); //버튼의 경계선 안보이게 
		
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.GREEN);
		panel.add(btn);
		
		add(panel,BorderLayout.CENTER);
		
		
		
		setTitle("Button Mouse Event Test");
		setLocation(300, 100);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}//끝


