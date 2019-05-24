package BookEx;

public class Box {
	private int height;
	private int width;
	private int length;
	private int volume;

	Box(int h, int w, int l) {
		height=h;
		width=w;
		length=l;
		volume=height*width*length;
	}
	
	public int getVolume() {
		return volume;
	}
		
	
}
