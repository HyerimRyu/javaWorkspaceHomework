import java.awt.Image;
import java.util.Random;

public class Enemy {
	
	Image img; //�̹��� �������� 
	int x,y; //�̹����� �߽���ǥ
	int w,h; //�̹����� ������, ���� ����
	
	int dy; //������ ��ȭ��
	
	int width, height; //ȭ��(panel)�� ������ 
	
	//���ΰ�ü�� �׾����� ���� ! 
	boolean isDead=false;
	
	public Enemy(Image imgEnemy, int width, int height) {
		this.width=width;
		this.height=height;
		
		// TODO Auto-generated constructor stub
		//��������� �� �ʱ�ȭ
		img=imgEnemy.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		w=16; //�̹����� ���� ����
		h=16; //�̹����� ���� ����
		
		Random rnd=new Random();
		x=rnd.nextInt(width-w*2)+w; //w ~ (width-w)
		y=-h; //ȭ���� ����
		
		
		//�������� �ӵ� �����ϰ�..
		dy=rnd.nextInt(15)+1; //1~15; 	
	}
	
	//Enemy�� �����̴� ��� �޼ҵ� 
	void move() {
		y += dy;
		
		//���� ȭ�� ������ ���������� ... 
		if(y>height+h) {
			//�� ��ü ���ֱ�!! --> ArrayList���� ����!!?!?!?
			isDead=true; //�� �׾��� ��� ǥ��
		}
	}

}
