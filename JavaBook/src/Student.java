
public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;
	
	public Student() {
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	
	}
	
	String info() {
		sum=getTotal();
		aver= getAverage();
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+ aver;
	}
	
	public int getTotal(){
		
		return kor+eng+math;
		
	}//getTotal()
	
	public float getAverage() {
		return (int)(getTotal()/3f*10+0.5f)/10f;
		
//		소수점 둘째자리에서 반올림하려면 
//		* 10 
//		+ 0.5
//		/ 10f
		
/*		236 / 3 -> 78
  		236 / 3f -> 78.666664
		236 / 3f * 10 -> 786.66664
		236 / 3f * 10 + 0.5 -> 787.16664
		(int)(236 / 3f * 10 + 0.5)  -> (int) 787.16664 -> 787
		(int)(236 / 3f * 10 + 0.5) / 10 -> 78
		(int)(236 / 3f * 10 + 0.5) / 10f -> 78.7*/
		
		
	
	}//getAverage()

}
