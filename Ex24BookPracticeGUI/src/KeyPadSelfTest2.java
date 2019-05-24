import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPadSelfTest2 extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;
	
	public KeyPadSelfTest2() {
		// TODO Auto-generated constructor stub
		txt=new JTextField(20);
		add(txt,BorderLayout.NORTH);
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		add(panel,BorderLayout.CENTER);
		for(int i=1; i<10; i++) {
			JButton btn=new JButton(""+i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 100));
			panel.add(btn);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
