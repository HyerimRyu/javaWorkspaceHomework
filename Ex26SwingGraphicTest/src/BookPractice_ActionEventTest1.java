import javax.swing.*;
import java.awt.event.*;

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button =(JButton)e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
		
	}
}

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("�̺�Ʈ ����");
		
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�");
		label=new JLabel(("���� ��ư�� �������� �ʾҽ��ϴ�."));
		button.addActionListener(new MyListener());
		
		panel.add(button);
		panel.add(label);
		add(panel);
		
		setVisible(true);
	}
}

public class BookPractice_ActionEventTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t=new MyFrame(); 

	}

}
