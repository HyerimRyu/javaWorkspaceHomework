import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

public class SpinnerSliderTest extends JFrame{
	
	public SpinnerSliderTest() {
		// TODO Auto-generated constructor stub
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(0, 1));
		
		//Spinner/////////////////////////////
		JPanel spinnerPanel=new JPanel();
		//경계선 만들기 
		Border border= BorderFactory.createTitledBorder("Spinner Region");
		spinnerPanel.setBorder(border);
		
		String[] items=new String[] {"소설", "잡지", "전공서적", "취미"};
		SpinnerListModel listModel=new SpinnerListModel(items);
		JSpinner spinner=new JSpinner(listModel);
		
		
		SpinnerDateModel dateModel=new SpinnerDateModel();
		JSpinner spinner2=new JSpinner(dateModel);
		
		
		
		SpinnerNumberModel numberModel1=new SpinnerNumberModel(5, 0, 10, 0.5);
		JSpinner spinner3=new JSpinner(numberModel1);
		
		spinnerPanel.add(spinner);
		spinnerPanel.add(spinner2);
		spinnerPanel.add(spinner3);
	
		
		
		
		panel.add(spinnerPanel);
		
		
		
		//Slider/////////////////////////////
		JPanel sliderPanel=new JPanel();
		sliderPanel.setBorder(BorderFactory.createTitledBorder("Slider Region"));
		
		JSlider slider=new JSlider(JSlider.HORIZONTAL, 0,100,10);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		sliderPanel.add(slider);
		
		JButton btn=new JButton("OK");
		sliderPanel.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int value=slider.getValue();
				JOptionPane.showMessageDialog(sliderPanel, "현재 슬라이더의 값 : "+ value);
				
			}
		});
		
		
		
		panel.add(sliderPanel);
		/////////////////////////////
		
		add(panel, BorderLayout.CENTER);
		
		
		
		setTitle("Components Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500,100,500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SpinnerSliderTest();

	}

}
