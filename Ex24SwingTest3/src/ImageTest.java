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
		
		//이미지를 표시하려면 우선 이미지를 보여줄 수 있는 컴포넌트 필요
		//swing에는 없어서  JLable을 대신 이용
		JLabel label=new JLabel();
		ImageIcon icon=new ImageIcon("images/mos.png"); //이미지파일의 주소 
		icon=new ImageIcon(icon.getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH));
		label.setIcon(icon);
		panel.add(label);
		
		
		JButton btn=new JButton("이미지 버튼");
		//버튼에 이미지아이콘 추가
		ImageIcon btnIcon=new ImageIcon("images/emoticon-7.png");
		btn.setIcon(btnIcon);
		panel.add(btn);
		
		btn.addActionListener(new ActionListener() {
			//btn버튼이 클릭되면 자동으로 실행되는 메소드 : 콜백(CallBack) 메소드
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//이미지 변경하기
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
