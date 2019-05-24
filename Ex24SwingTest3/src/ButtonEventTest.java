import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonEventTest extends JFrame{

	//�̰� �˶� ������ ���̸� �˶� �����ϰ� ���� ��� 
	
	//������� : Field
	JLabel label;
	JButton btn;

	public ButtonEventTest() {
		// TODO Auto-generated constructor stub
		setTitle("Button Click Event");
		setSize(500, 150);
		
		setVisible(true);
		
		JPanel panel=new JPanel();
		add(panel);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//������ġ
		
		//JLabel label=new JLabel("Hello"); //���������� �ٸ� �������� ���Ұ� 
		label=new JLabel("Hello");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		btn= new JButton("Button");
		btn.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panel.add(label);
		panel.add(btn);
		
		
		//��ư�� �̺�Ʈ(click)�� ��� ������(����Ŀ) ��ü ���� �� ��ư�� �ޱ�!!
		
		//�����ʰ�ü ����
		//ActionListener�� �������̽���. ����Ϸ��� ���ο� Ŭ������ ���� ����(implements)�ؾ���
		
		//ClickListener listener=new ClickListener();
		//���ο� Ŭ���� �̸� ������ ����°� ������ �׷���
		//�̸��� ���� Ŭ���� �����ؼ� ���: �͸� Ŭ����(Anonymous class)
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("�͸����ͷ� �ٲ���!!!");
			}
		};
		
		btn.addActionListener(listener);
		
	}//������
	
	//�̳�Ŭ����-�ƿ���Ŭ������ �� Ŭ������ ����� �� ����
	class ClickListener implements ActionListener{

		//��ư�� Ŭ���� �߻��ϸ� �ڵ����� ����Ǵ� �޼ҵ� : �ݹ�޼ҵ�
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//JLable�� ���ִ� �۾� �����ϱ�! 
			//���������� �ٸ� �������� ���Ұ�!! 
			label.setText("Nice to meet you");
			//System.out.println("aaaaa");
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ButtonEventTest();
		
	}//Main method

}//ButtonEventTest class 
