import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageTest extends JFrame{

	public ImageTest() {
		setTitle("Image Test");
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		
		//�̹����� ǥ���Ϸ��� �켱 �̹����� ������ �� �ִ� ������Ʈ �ʿ�
		//swing���� ���  JLable�� ��� �̿�
		JLabel label=new JLabel();
		ImageIcon icon=new ImageIcon("images/mos.png"); //�̹��������� �ּ� 
		icon=new ImageIcon(icon.getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH));
		label.setIcon(icon);
		panel.add(label);
		
		
		JButton btn=new JButton("�̹��� ��ư");
		//��ư�� �̹��������� �߰�
		ImageIcon btnIcon=new ImageIcon("images/emoticon-7.png");
		btn.setIcon(btnIcon);
		panel.add(btn);
		
		btn.addActionListener(new ActionListener() {
			//btn��ư�� Ŭ���Ǹ� �ڵ����� ����Ǵ� �޼ҵ� : �ݹ�(CallBack) �޼ҵ�
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//�̹��� �����ϱ�
				ImageIcon icon=new ImageIcon("images/kpj003.png");
				icon=new ImageIcon(icon.getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH));
				label.setIcon(icon);
				
				
			}
		});
		
		
		
		add(panel);
		setLocation(600, 100);
		//pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageTest();

	}

}
