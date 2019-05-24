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
		
		setTitle("스윙 그래픽 게임테스트 나중에 Yes or No");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500,50,360,600);
		setResizable(false);//창 크기 고정: 창의 크기가 늘어나지 않도록: 게임은 보통 고정시켜
		
		panel=new GamePanel();
		add(panel, BorderLayout.CENTER);
		
		setVisible(true);
		
		//게임을 진행시키는 스레드 객체 생성 및 스타트
		gThread=new GameThread();
		gThread.start(); //run()메소드 자동실행!! 
		
		//프레임에 키보드 입력 반응하는 keyListener 객체 추가
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				//눌러진 키가 무엇인지 알아내기 
				int keyCode=e.getKeyCode();
				
				//방향키 4개 구분
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
				//눌러진 키가 무엇인지 알아내기 
				int keyCode=e.getKeyCode();
				
				//방향키 4개 구분
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
	
	
	//게임화면을 그려낼 Panel 이너클래스//////////////////////////////////////////////////
	class GamePanel extends JPanel{
		
		//화면에 보여질 이미지 객체 참조변수들 - 멤버변수
		Image imgBack;
		Image imgPlayer;
		Image imgEnemy;
		
		//
		
		//패널의 가로세로 사이즈 
		int width;
		int height;
		
		int x,y;  //플레이어 위치_중심 좌표
		int w,h; //플레이어 이미지의 절반폭, 절반높이
		
		
		int dx=0, dy=-1; //플레이어 이미지의 이동속도, 이동방향 : 값이 크면 속도 빠르고 
		
		//적군객체 참조변수..여러마리 일 수 있으니 개수가 유동적이므로 
		//유동적배열 ArrayList 
		ArrayList<Enemy> enemies=new ArrayList<>();
		
		//점수
		int score;
		
		
		
	public GamePanel() {
		// TODO Auto-generated constructor stub
		//GUI관련 프로그램의 편의를 위해 만들어진 도구상자객체-(Toolkit)객체
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		
		//생성자에서 폭, 높이값 구하면 무조건 0임. 왜? 아직 사이즈가 결정되지 않았기 때문에 
		//width=getWidth();
		//height=getHeight();
		
		
		//배경이미지
		imgBack=toolkit.getImage("images/bg.png");
		
		//플레이어 이미지 객체 생성
		imgPlayer=toolkit.getImage("images/parrot.png");
		//적군 이미지 객체 생성
		imgEnemy=toolkit.getImage("images/penguin.png");
		
		
		
		}//constructor	

	
	
	//화면에 보여질 때 보여질 내용물 작업 수행하는 메소드: 자동실행->콜백메소드
	
	
	@Override
		protected void paintComponent(Graphics g) {
		//여기에 화면에 보여질 작업을 코딩...
		if(
			width==0 || height==0) {//처음 호출되었을 때!!
			width=getWidth();
			height=getHeight();
			//화면에 보여진다는건 이미 사이즈가 구현되었다는 것
			
			//리사이징.. 배경을 Panel만하게..
			imgBack=imgBack.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			
			//플레이어 이미지 리사이징
			imgPlayer=imgPlayer.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			
			
			//플레이어의 처음 시작 좌표계산
			x=width/2;   //가로축은 화면의 가운데
			y=height-130;//세로축은 밑에서 200 위의 지점
			
			
			
			//플레이어 이미지의 절반폭, 절반 높이값 계산
			w=50;//imgPlayer.getWidth()/2;
			h=50;//imgPlayer.getHeight()/2;
			
		}
		
		
		//그림 그리는 작업은 무조건 여기서!! 왜? 여기에 화가 객체가 있기 때문에 Graphics g
		
		//배경그리기!!
		g.drawImage(imgBack, 0, 0, this);
		
		
		//적군들 그리기!
//		for(int i=0; i<enemies.size(); i++) {
//			Enemy t=enemies.get(i);
//			
//		}
		
		for(Enemy t: enemies) {
			g.drawImage(t.img, t.x-t.w, t.y-t.h, this);
		}
		
		
		//플레이어 그리기
		g.drawImage(imgPlayer, x-w, y-h, this);
		
		
		//점수표시하기
		g.setColor(Color.WHITE);
		g.setFont(new Font(null, Font.BOLD, 20));
		g.drawString("SCORE : " + score, 10, 30);
		
		
		
		
		//여러 장면을 만들기 위해 새로 일정 시간마다 다시 그려라(re Painting)
		}//paintComponent method..
	
	void move() {
		//적군들 움직이기
		//만약 중간에 배열의 개수가 변경될 여지가 있다면
		//맨 마지막 요소부터 거꾸로 0번 요소까지 역으로 처리 해야 함
		for(int i=enemies.size()-1; i>=0; i--) {
			Enemy t=enemies.get(i);
			
			t.move();
			if(t.isDead) enemies.remove(i); //ArrayList에서 제거 
		}
		
		
		//플레이어 움직이기(플레이어 좌표 변경)
		x += dx;
		//y += dy;
		
		//플레이어의 좌표가 화면 밖으로 나가지 않도록 
		if(x<w) x=w; 
		if(x>width-w) x=width-w;
		if(y<h)y=h;
		if(y>height-h) y=height-h;
		
		///////////////////////

	}
	
	//적군객체를 만들어 내는  기능 메소드!!
	void makeEnemy() {
		if(width==0 || height==0) return;
		
		//50번에 한번 꼴로 만들기 !! 
		Random rnd=new Random();
		int n=rnd.nextInt(30);// 0~49 //숫자가 클수록 난이도 쉬워 
		if(n==0) {//1/50의 확률
			enemies.add(new Enemy(imgEnemy, width, height));
		}
		
		
	}//makeEnemy()
	
	//충돌체크 작업계산 메소드
	void checkCollision() {
		//플레이어와 적군의 충돌...
		
		for(Enemy t : enemies) {
			int left=t.x-t.w;
			int right=t.x+t.w;
			int top=t.y-t.h;
			int bottom=t.y+t.h;
			
			if(x>left && x<right && y>top && y<bottom) {
				//충돌했음!! 
				t.isDead=true;
				
				//점수증가
				score+=5;
			}
		}
		
	}
	
	
		
	}//GamePanel class
	/////////////////////////////////////////////////////////
	
	
	//일정시간마다 게임화면을 갱신시키는 작업 수행하는 별도 Thread 클래스
	class GameThread extends Thread{
		@Override
		public void run() {
			while(true) { //만들고,  움직이고, 체크하고, 다시 그리고!! 이게 게임!!! 
				
				//적군개체 만들어내는 기능을 호출
				panel.makeEnemy();
				
				
				//GamePanel의 플레이어 좌표 변경-객체의 멤버값 변경은 그 객체가 스스로 하도록 하는 것이 OOP의 기본 모티브
				//panel안에 본인의 좌표를 변경하는 메소드를 만들고 이를 호출해서 처리
				panel.move();
				
				//충돌체크 기능 호출
				panel.checkCollision();
				
				//GamePanel의 화면 갱신
				panel.repaint();
				
				//너무 빨리 반복문이 돌아서 화면갱신할 시간도 없음
				//잠시 대기 
				try {
					Thread.sleep(20);//20ms(1초에 50번)
				} catch (InterruptedException e) {} 
				
			}//while
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainFrame();
		
	}

}
