import java.util.Random;

public class Computer {
	
	//��ǻ�Ͱ� ���� ���䰪�� �� �ڸ����� ���� �����ϴ� �������
	int com100, com10, com1;
	
	//����޼ҵ�
	
	//����(������) ����� ���� ���(��, �ߺ����� ���� 3�ڸ� ����)
	void makeNumbers() {
		Random rnd=new Random();
		
		while(true) {
		com100=rnd.nextInt(10); //0~9
		com10=rnd.nextInt(10); //0~9
		com1=rnd.nextInt(10);//0~9
		
		//�ߺ�üũ
		if(com100!=com10 && com100!=com1 && com10!=com1) break;
		}
	}
	//���޹��� ���� �������� üũ�ϴ� ���
	boolean checkAnswer(String answer) {
		
		if(answer.length()!=3) {
			System.out.println("�߸��Է��߽��ϴ�.");
		return false;}
	
		
	//���ں��� String�� char������ �ɰ��µ� charAt(�ɰ��� ���� �κ�)
	int user100=answer.charAt(0)-48; //�ƽ�Ű 48=0
	int user10=answer.charAt(1)-48;
	int user1=answer.charAt(2)-48;
	
	int strike=0, ball=0;
	
	if(user100==com100) strike++;
	else if(user100==com10 || user100==com1)ball++;
	
	if(user10==com10) strike++;
	else if(user10==com100 || user10==com1)ball++;
	
	if(user1==com1) strike++;
	else if(user1==com100 || user1==com10)ball++;
	
	if(strike==3) {
		System.out.println("�����Դϴ�.!!");
		return true;
	}		
	System.out.println(strike+"��Ʈ����ũ,"+ball+"��");
	
	return false;
	
	}
}