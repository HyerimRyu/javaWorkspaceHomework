
public class getDistance {
	
	//두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	int x;
	int y;
	int x1;
	int y1;
	
	
	 public getDistance(int x,int y,int x1,int y1) {
		 this.x=x;
		 this.y=y;
		 this.x1=x1;
		 this.y1=y1;
	 }
	 
		static double math(int x,int y,int x1,int y1) {
			//Math.sqrt(a)
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		}
}
