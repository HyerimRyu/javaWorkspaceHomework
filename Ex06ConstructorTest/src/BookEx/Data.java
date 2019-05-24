package BookEx;

public class Data {
	private int year;
	private String month;
	private int day;
	
	//초기화 constructor
	public Data(int year, String month, int day) {
		this.month=month;
		this.year=year;
		this.day=day;
	}
	//오버로딩 파라미터값 다르게
	public Data(int year) {
		this(year, "1월",1);
	}
	public Data() {
		this(1900, "1월",1);
	}
	
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
