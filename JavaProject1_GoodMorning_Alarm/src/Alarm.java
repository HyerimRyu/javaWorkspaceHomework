
public class Alarm {
	private int hh;
	private int mm;
	private int ss;
	private int hhAlarm;
	private int mmAlarm;
	private int ssAlarm;
	private boolean onSwitch;
	
	public Alarm(int hh, int mm, int ss, boolean onSwitch) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
		this.onSwitch = onSwitch;
	}
	public Alarm(int hh, int mm, int ss) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
		this.onSwitch = false;
	}
	public int getHh() {
		return hh;
	}
	public void setHh(int hh) {
		
		this.hh = hh;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getSs() {
		return ss;
	}
	public void setSs(int ss) {
		this.ss = ss;
	}
	public int getHhAlarm() {
		return hhAlarm;
	}
	public void setHhAlarm(int hhAlarm) {
		this.hhAlarm = hhAlarm;
	}
	public int getMmAlarm() {
		return mmAlarm;
	}
	public void setMmAlarm(int mmAlarm) {
		this.mmAlarm = mmAlarm;
	}
	public int getSsAlarm() {
		return ssAlarm;
	}
	public void setSsAlarm(int ssAlarm) {
		this.ssAlarm = ssAlarm;
	}
	public boolean isOnSwitch() {
		return onSwitch;
	}
	public void setOnSwitch(boolean onSwitch) {
		this.onSwitch = onSwitch;
	}
//	@Override
//	public String toString() {
//		return "Alarm [hh=" + hh + ", mm=" + mm + ", ss=" + ss + ", hhAlarm=" + hhAlarm + ", mmAlarm=" + mmAlarm
//				+ ", ssAlarm=" + ssAlarm + ", onSwitch=" + onSwitch + "]";
//	}
	
	public String toString() {
		String result;
		result="Time of Day: \n"+
		hh+":"+mm+":"+ss+"\n\nAlarm Time: \n"+hhAlarm+":"+mmAlarm+":"+ssAlarm;
		if(onSwitch)
			result=result+"\n The alarm is turned on. \n";
		else
			result=result+"n The alarm is turnde on. \n";
		return result;
	}
	
	
	
	

}//end of Alarm class

