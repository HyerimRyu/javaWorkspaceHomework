import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextComponentTset extends JFrame {
	
	public TextComponentTset() {
		// TODO Auto-generated constructor stub
		setTitle("Component Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		
		//�۾����� ������Ʈ 3�� ..
		
		//1. JLabel
		JLabel label=new JLabel("Label Component");
		//setSize�� ������Ʈ�� ũ�⸦ �����ϴ� ���̸� �۾�ũ��� ������ ����
		//��Ʈ ����(�۲�, ��Ÿ��, ũ��)
		Font font=new Font("serif", Font.ITALIC, 30);
		font=new Font("sans serif", Font.BOLD, 30);
		font=new Font(null, Font.BOLD | Font.PLAIN, 30);
		label.setForeground(Color.ORANGE);
		label.setFont(font);
		
		panel.add(label);
		
		//2. JTextField : �� �� �Է�
		JTextField tf=new JTextField(25); //�ּ� 25���� �� ũ��
		panel.add(tf);
		
		//2_1. JPasswordField 
		JPasswordField pf=new JPasswordField(25);
		panel.add(pf);
		
		//3. JTextArea : ������ �Է�
		JTextArea ta=new JTextArea(10,25); //��ĭ, ��� 
		ta.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel.add(ta);
		
		
		
		
		add(panel);
		setBounds(600,100,350,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TextComponentTset();

	}

}
