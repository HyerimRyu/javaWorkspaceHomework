import javax.swing.*;
import java.awt.event.*;

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button =(JButton)e.getSource();
		button.setText("마침내 버튼이 눌러졌습니다.");
		
	}
}

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("이벤트 예제");
		
		JPanel panel=new JPanel();
		button=new JButton("버튼을 누르시오");
		label=new JLabel(("아직 버튼이 눌러지지 않았습니다."));
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
