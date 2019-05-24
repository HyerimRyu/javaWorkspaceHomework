package BookEx;

public class Data {
	private int year;
	private String month;
	private int day;
	
	//�ʱ�ȭ constructor
	public Data(int year, String month, int day) {
		this.month=month;
		this.year=year;
		this.day=day;
	}
	//�����ε� �Ķ���Ͱ� �ٸ���
	public Data(int year) {
		this(year, "1��",1);
	}
	public Data() {
		this(1900, "1��",1);
	}
	
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
