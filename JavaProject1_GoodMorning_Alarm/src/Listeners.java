import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Listeners implements ActionListener {

	public Listeners() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button=(JButton)e.getSource();
		button.setText("알람을 정지합니다.");
		
		
	 	
	}//override
	
	

}//listener
