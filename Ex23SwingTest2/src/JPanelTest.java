import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest {
///////////�޼ҵ� ���� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame("Panel Test");
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�����ӿ� ���Ե� �Ϲ������̳� (������Ʈ�� ���� �� �ִ�)��ü ����
		JPanel panel=new JPanel();
		
		//�гο� ���� ������Ʈ ���� �� �߰�
		JButton btn=new JButton();
		btn.setText("btn1");
		
		JButton btn2=new JButton("btn2");
		
		//JPanel�� �⺻ ��ġ������(LayoutManager)�� FlowLayout��. 
		panel.add(btn);
		panel.add(btn2);
		panel.add(new JButton("Button3"));
		panel.add(new JButton("Button4"));
		panel.add(new JButton("�ѱ۵� ��"));
		panel.add(new JButton("��ư"));
		
		//���α��̺��� �������� �ڵ� �ٹٲ�
		panel.add(new JButton("Button5"));
		
		
		
		//�����ӿ� �г� ���̱�
		frame.add(panel);
	
		//���� �����ӿ� �� �ٸ� �г��� ���̸�??
		JPanel panel2=new JPanel();
		panel2.add(new JButton("aaa"));
		panel2.add(new JButton("bbb"));
		
		//�����ӿ� 2��° �г� �߰��ϱ�
		frame.add(panel2); //�г� ����� ��  ��??
		//�⺻������ JFrame�� BorderLayout�̶�� ���� �⺻ ��ġ�����ڷ� ����ϸ�
		//BorderLayout�� ������ �߰����� ��ġ������ ���ٸ� �ڵ�Center�� �Ǿ� 
		//2���� �г��� �ߺ���
		//�⺻ ��ġ�����ڸ� ������ ���� ����
		frame.setLayout(new FlowLayout());
		frame.setLayout(new GridLayout(0, 2));//row(��), column(ĭ)
		
		//�г��� ���� ����
		panel.setBackground(Color.ORANGE);
		panel2.setBackground(Color.PINK);
		
		//ȭ���� �ٹ̴µ� ���� �߿��� ��ġ������ 
		//LayoutManagerTest.java��� ���� ����!
		
		frame.pack();//������ �ȿ� �ִ� ������Ʈ���� ���� ������ ����� ������¡ ����
		
		frame.setVisible(true);
		
		
	

	}

}
