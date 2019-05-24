import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	GamePanel panel;
	GameThread gThread;
	

	public MainFrame() {
		// TODO Auto-generated constructor stub
		
		setTitle("���� �׷��� �����׽�Ʈ ���߿� Yes or No");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500,50,360,600);
		setResizable(false);//â ũ�� ����: â�� ũ�Ⱑ �þ�� �ʵ���: ������ ���� ��������
		
		panel=new GamePanel();
		add(panel, BorderLayout.CENTER);
		
		setVisible(true);
		
		//������ �����Ű�� ������ ��ü ���� �� ��ŸƮ
		gThread=new GameThread();
		gThread.start(); //run()�޼ҵ� �ڵ�����!! 
		
		//�����ӿ� Ű���� �Է� �����ϴ� keyListener ��ü �߰�
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				//������ Ű�� �������� �˾Ƴ��� 
				int keyCode=e.getKeyCode();
				
				//����Ű 4�� ����
				switch(keyCode) {
				case KeyEvent.VK_LEFT:
					panel.dx=0;
					break;
					
				case KeyEvent.VK_RIGHT:
					panel.dx=0;
					break;
					
				case KeyEvent.VK_UP:
					panel.dy=0;
					break;
					
				case KeyEvent.VK_DOWN:
					panel.dy=0;
					break;
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//������ Ű�� �������� �˾Ƴ��� 
				int keyCode=e.getKeyCode();
				
				//����Ű 4�� ����
				switch(keyCode) {
				case KeyEvent.VK_LEFT:
					panel.dx=-8;
					break;
					
				case KeyEvent.VK_RIGHT:
					panel.dx=5;
					break;
					
				case KeyEvent.VK_UP:
					panel.dy=-5;
					break;
					
				case KeyEvent.VK_DOWN:
					panel.dy=5;
					break;
				}
				
				
			}
		});
		
	}
	
	
	//����ȭ���� �׷��� Panel �̳�Ŭ����//////////////////////////////////////////////////
	class GamePanel extends JPanel{
		
		//ȭ�鿡 ������ �̹��� ��ü ���������� - �������
		Image imgBack;
		Image imgPlayer;
		Image imgEnemy;
		
		//
		
		//�г��� ���μ��� ������ 
		int width;
		int height;
		
		int x,y;  //�÷��̾� ��ġ_�߽� ��ǥ
		int w,h; //�÷��̾� �̹����� ������, ���ݳ���
		
		
		int dx=0, dy=-1; //�÷��̾� �̹����� �̵��ӵ�, �̵����� : ���� ũ�� �ӵ� ������ 
		
		//������ü ��������..�������� �� �� ������ ������ �������̹Ƿ� 
		//�������迭 ArrayList 
		ArrayList<Enemy> enemies=new ArrayList<>();
		
		//����
		int score;
		
		
		
	public GamePanel() {
		// TODO Auto-generated constructor stub
		//GUI���� ���α׷��� ���Ǹ� ���� ������� �������ڰ�ü-(Toolkit)��ü
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		
		//�����ڿ��� ��, ���̰� ���ϸ� ������ 0��. ��? ���� ����� �������� �ʾұ� ������ 
		//width=getWidth();
		//height=getHeight();
		
		
		//����̹���
		imgBack=toolkit.getImage("images/bg.png");
		
		//�÷��̾� �̹��� ��ü ����
		imgPlayer=toolkit.getImage("images/parrot.png");
		//���� �̹��� ��ü ����
		imgEnemy=toolkit.getImage("images/penguin.png");
		
		
		
		}//constructor	

	
	
	//ȭ�鿡 ������ �� ������ ���빰 �۾� �����ϴ� �޼ҵ�: �ڵ�����->�ݹ�޼ҵ�
	
	
	@Override
		protected void paintComponent(Graphics g) {
		//���⿡ ȭ�鿡 ������ �۾��� �ڵ�...
		if(
			width==0 || height==0) {//ó�� ȣ��Ǿ��� ��!!
			width=getWidth();
			height=getHeight();
			//ȭ�鿡 �������ٴ°� �̹� ����� �����Ǿ��ٴ� ��
			
			//������¡.. ����� Panel���ϰ�..
			imgBack=imgBack.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			
			//�÷��̾� �̹��� ������¡
			imgPlayer=imgPlayer.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			
			
			//�÷��̾��� ó�� ���� ��ǥ���
			x=width/2;   //�������� ȭ���� ���
			y=height-130;//�������� �ؿ��� 200 ���� ����
			
			
			
			//�÷��̾� �̹����� ������, ���� ���̰� ���
			w=50;//imgPlayer.getWidth()/2;
			h=50;//imgPlayer.getHeight()/2;
			
		}
		
		
		//�׸� �׸��� �۾��� ������ ���⼭!! ��? ���⿡ ȭ�� ��ü�� �ֱ� ������ Graphics g
		
		//���׸���!!
		g.drawImage(imgBack, 0, 0, this);
		
		
		//������ �׸���!
//		for(int i=0; i<enemies.size(); i++) {
//			Enemy t=enemies.get(i);
//			
//		}
		
		for(Enemy t: enemies) {
			g.drawImage(t.img, t.x-t.w, t.y-t.h, this);
		}
		
		
		//�÷��̾� �׸���
		g.drawImage(imgPlayer, x-w, y-h, this);
		
		
		//����ǥ���ϱ�
		g.setColor(Color.WHITE);
		g.setFont(new Font(null, Font.BOLD, 20));
		g.drawString("SCORE : " + score, 10, 30);
		
		
		
		
		//���� ����� ����� ���� ���� ���� �ð����� �ٽ� �׷���(re Painting)
		}//paintComponent method..
	
	void move() {
		//������ �����̱�
		//���� �߰��� �迭�� ������ ����� ������ �ִٸ�
		//�� ������ ��Һ��� �Ųٷ� 0�� ��ұ��� ������ ó�� �ؾ� ��
		for(int i=enemies.size()-1; i>=0; i--) {
			Enemy t=enemies.get(i);
			
			t.move();
			if(t.isDead) enemies.remove(i); //ArrayList���� ���� 
		}
		
		
		//�÷��̾� �����̱�(�÷��̾� ��ǥ ����)
		x += dx;
		//y += dy;
		
		//�÷��̾��� ��ǥ�� ȭ�� ������ ������ �ʵ��� 
		if(x<w) x=w; 
		if(x>width-w) x=width-w;
		if(y<h)y=h;
		if(y>height-h) y=height-h;
		
		///////////////////////

	}
	
	//������ü�� ����� ����  ��� �޼ҵ�!!
	void makeEnemy() {
		if(width==0 || height==0) return;
		
		//50���� �ѹ� �÷� ����� !! 
		Random rnd=new Random();
		int n=rnd.nextInt(30);// 0~49 //���ڰ� Ŭ���� ���̵� ���� 
		if(n==0) {//1/50�� Ȯ��
			enemies.add(new Enemy(imgEnemy, width, height));
		}
		
		
	}//makeEnemy()
	
	//�浹üũ �۾���� �޼ҵ�
	void checkCollision() {
		//�÷��̾�� ������ �浹...
		
		for(Enemy t : enemies) {
			int left=t.x-t.w;
			int right=t.x+t.w;
			int top=t.y-t.h;
			int bottom=t.y+t.h;
			
			if(x>left && x<right && y>top && y<bottom) {
				//�浹����!! 
				t.isDead=true;
				
				//��������
				score+=5;
			}
		}
		
	}
	
	
		
	}//GamePanel class
	/////////////////////////////////////////////////////////
	
	
	//�����ð����� ����ȭ���� ���Ž�Ű�� �۾� �����ϴ� ���� Thread Ŭ����
	class GameThread extends Thread{
		@Override
		public void run() {
			while(true) { //�����,  �����̰�, üũ�ϰ�, �ٽ� �׸���!! �̰� ����!!! 
				
				//������ü ������ ����� ȣ��
				panel.makeEnemy();
				
				
				//GamePanel�� �÷��̾� ��ǥ ����-��ü�� ����� ������ �� ��ü�� ������ �ϵ��� �ϴ� ���� OOP�� �⺻ ��Ƽ��
				//panel�ȿ� ������ ��ǥ�� �����ϴ� �޼ҵ带 ����� �̸� ȣ���ؼ� ó��
				panel.move();
				
				//�浹üũ ��� ȣ��
				panel.checkCollision();
				
				//GamePanel�� ȭ�� ����
				panel.repaint();
				
				//�ʹ� ���� �ݺ����� ���Ƽ� ȭ�鰻���� �ð��� ����
				//��� ��� 
				try {
					Thread.sleep(20);//20ms(1�ʿ� 50��)
				} catch (InterruptedException e) {} 
				
			}//while
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainFrame();
		
	}

}
