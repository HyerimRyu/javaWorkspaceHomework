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
	JLabel label=new JLabel("�ٽ� �˸�");
	
	JRadioButton rb1=new JRadioButton("10��");
	JRadioButton rb2=new JRadioButton("15��");
	JRadioButton rb3=new JRadioButton("30��");
	ButtonGroup bg=new ButtonGroup();
	
	bg.add(rb1);
	bg.add(rb2);
	bg.add(rb3);
	
	//�гο� ������Ʈ�� �߰�
	add(label);
	add(rb1);
	add(rb2);
	add(rb3);
	
	//���� ��ư�� �����ϴ� ���� ��� ������ ��ü �߰�
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
		JOptionPane.showMessageDialog(MyNewFrame,str+" �� �˶��� �ٽ� �����մϴ�.");
	}
};

}//end of class
