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
		setTitle("�˶�����1");
		setSize(40, 40);
		
		JPanel panel=new JPanel();
		add(panel);
		setVisible(true);
		
	}//������ ��ư

	//�޼ҵ�
	void StopShowWeather() {
		//���� ��ư �̹���
		JButton btn=new JButton(new ImageIcon("images/ms18.png"));
		
		//���콺�� ��ư�� �ö��� ���� �̹��� ����
		btn.setRolloverIcon(new ImageIcon("images/ms19.png"));
		
		//���콺�� ��ư�� Ŭ������ ���� �̹��� ����
		btn.setPressedIcon(new ImageIcon("images/weather.png"));
		
		//��ư�� ���� ������
		//���� ä��� ����
		btn.setContentAreaFilled(false); //���� ä��� ����
		btn.setFocusPainted(false); //��Ŀ���� ǥ���ϴ� �׸� �簢�� �Ⱥ��̵���
		btn.setBorderPainted(false); //��ư�� ��輱 �Ⱥ��̰� 
		
		
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
	
}//��


