package BookEx;

public class Television {
	private int channel;
	private int volume;
	private boolean onOFF;
	
	public Television(int c, int v, boolean o) {
		// TODO Auto-generated constructor stub
		channel=c;
		volume=v;
		onOFF=o;
	}
	
	void print() {
		System.out.println("ä����" + channel + "�̰� ������" + volume + "�Դϴ�.");
	}

}
