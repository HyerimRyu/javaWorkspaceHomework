import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tab2Schedule extends JPanel {
public tab2Schedule() {
	// TODO Auto-generated constructor stub
	
	System.out.println("ex24라벨추가");
	
	ImageIcon icon=new ImageIcon("images/ms19.png");
	icon=new ImageIcon(icon.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH));
	JLabel imageLabel=new JLabel(icon);
	
	add(imageLabel);
	
}//end of constructor



}//end of class
