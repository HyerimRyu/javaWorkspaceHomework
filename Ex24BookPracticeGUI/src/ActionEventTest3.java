import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�̺�Ʈ ����");
		
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�");
		label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
		}
	}
}

public class ActionEventTest3 {
	public  static void main(String[] args) {
		MyFrame t=new MyFrame();
	}

}
