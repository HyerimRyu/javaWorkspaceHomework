import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1 extends JFrame{
	public Ex1() {
		// TODO Auto-generated constructor stub
		setTitle("Graphic Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500,100,500,400);
		
		
		MyPanel panel=new MyPanel();
		add(panel,BorderLayout.CENTER); //이때 패널이 화면에 보여짐. 이때 자동으로 paintComponent()메소드가 실행됨
		//add(new MyPanel(), BorderLayout.CENTER);
		
		
		setVisible(true);
	}

	
	class MyPanel extends JPanel{
		
		//패널이 넓이와 높이값
		int width;
		int height;
		private Image img;
		
		public MyPanel() {
			// TODO Auto-generated constructor stub
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			img=toolkit.getImage("koo.jpg");
			img=img.getScaledInstance(128, 128, Image.SCALE_SMOOTH);
		}
		
		//모든 컴포넌트들은 본인이 화면에 보여지도록 하기 위해
		//그림을 그려라! 라는 기능(메소드) 존재
		//생성자 메소드가 호출된 후 
		//화면에 보여질 때 자동으로 실행되는 메소드가 존재함
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			//System.out.println("MyPanel paintComponent 호출");
			width=this.getWidth();
			height=this.getHeight();
			
			//파라미터로 전달된 화가 객체(Graphics)에게 그림그리기 요청
			
			//폰트지정(글꼴, 스타일, 크기)
			g.setFont(new Font("BrushScript", Font.BOLD, 25 ));
			
			
			//글씨 그려라!!
			g.drawString("aaa", 50, 20);
			g.drawString("bbb", 0, 20);
			g.drawString("Nice day", 0, height);
			
			//패널의 넓이 및 높이
			g.drawString(width+"*"+height, 100, 100);
			
			//선그리기
			g.drawLine(50, 50, 150, 50);
			g.drawLine(50, 60, 150, 60);
			g.drawLine(50, 70, 50, 170);
			g.drawLine(50, 70, 150, 170);
			g.drawLine(50, 170, 150, 170);
			
			//사각형그리기
			g.drawRect(50, 200, 100, 50);
			g.drawRoundRect(170, 200, 100, 50, 30, 30);
			
			g.setColor(Color.BLUE);
			g.fillRect(50, 270, 100, 50);
			g.fillRoundRect(170, 200, 100, 50, 30, 30);
			
			
			//원그리기
			g.setColor(Color.RED);
			g.drawOval(300, 200, 50, 50);
			g.drawOval(370, 200, 80, 50);
			g.fillOval(300, 270, 50, 50);
			
			
			//호그리기
			g.drawArc(300, 100, 50, 50, 10, 145);
			g.fillArc(370, 100, 50, 50, 330, 180);
			
			//다각형 그리기
			g.setColor(new Color(0,0,255,150));
			int[] xPoints=new int[] {300, 310, 320, 330, 340, 350};
			int[] yPoints=new int[] {30,40,30,40,30,40};
			
			g.drawPolygon(xPoints, yPoints, xPoints.length);
			
			//굵은선그리기 효과내기
			g.fillRect(250, 80, 3, 80);
			
			
			//이미지 그리기
			
			//이미지 객체 만들기
			
			g.drawImage(img, 100, 100, this);
			g.drawImage(img, 200, 100, this);
			
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ex1();

	}

}
