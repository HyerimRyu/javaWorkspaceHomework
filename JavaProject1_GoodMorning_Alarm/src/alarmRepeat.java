import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class alarmRepeat extends JPanel{
	
public alarmRepeat() {
	// TODO Auto-generated constructor stub
	JLabel label=new JLabel("다시 알림");
	
	JRadioButton rb1=new JRadioButton("10분");
	JRadioButton rb2=new JRadioButton("15분");
	JRadioButton rb3=new JRadioButton("30분");
	ButtonGroup bg=new ButtonGroup();
	
	bg.add(rb1);
	bg.add(rb2);
	bg.add(rb3);
	
	//패널에 컴포넌트들 추가
	add(label);
	add(rb1);
	add(rb2);
	add(rb3);
	
	//라디오 버튼을 선택하는 것을 듣는 리스너 객체 추가
	rb1.addActionListener(listener);
	rb2.addActionListener(listener);
	rb3.addActionListener(listener);
	
	
}//end of constructor

ActionListener listener=new ActionListener() {
	
	private Component MyNewFrame;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str =e.getActionCommand();
		JOptionPane.showMessageDialog(MyNewFrame,str+" 후 알람을 다시 설정합니다.");
	}
};

}//end of class
