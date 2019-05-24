import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
	
public class PanelsTest extends JFrame{

	public PanelsTest() {

			//�гξȿ� �гγֱ�
			this.setTitle("Panels Test");
			setSize(500,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			//���� ū ù��° �г�
			JPanel rootPanel=new JPanel();
			GridLayout gridLayout = new GridLayout(0, 2);
			gridLayout.setHgap(10);
			rootPanel.setLayout(gridLayout);
			
			//���� �г�
			JPanel panelA=new JPanel();
			panelA.setBackground(Color.MAGENTA);
			panelA.setLayout(new FlowLayout());
			panelA.add(new JButton("aaa"));
			panelA.add(new JButton("bbb"));
			panelA.add(new JButton("ccc"));
			panelA.add(new JButton("ddd"));
			panelA.add(new JButton("eee"));
			panelA.add(new JButton("fff"));
			panelA.add(new JButton("ggg"));
			
			
			//������ �г�
			JPanel panelB=new JPanel();
			panelB.setBackground(Color.BLUE);
			panelB.setLayout(new BorderLayout());
			panelB.add(new JButton("button1"), BorderLayout.NORTH);
			panelB.add(new JButton("button2"), BorderLayout.CENTER);
			panelB.add(new JButton("button3"), BorderLayout.SOUTH);
			
			
			//���� �гε��� ū �гο� ���̱�
			rootPanel.add(panelA);
			rootPanel.add(panelB);
			
			rootPanel.setBackground(Color.YELLOW);
			
			//Frame�� rootPanel�� ���̱�
			add(rootPanel);
			setVisible(true);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
