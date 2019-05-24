

public class Ex10 {
	
	public static void main(String[] args) {
		
		int[][] buf= new int[5][5];
		
		int y=0, x=0; //인덱스 번호
		int dy=1, dx=0; //y,x 인덱스의 변화값(처음은 아래쪽으로)
		int limit_y=0, limit_x=0; 
		
		for(int n=1; n<=25; n++){
			buf[y][x]= n;			
			
			y+=dy; //y값 변경
			x+=dx; //x값 변경			
			
			if(dy>0 && y==4-limit_y){ //y값이 증가될때				
				dy=0;
				dx=1;
			}
			if(dx>0 && x==4-limit_x){ //x값이 증가될때				
				dy=-1;
				dx=0;
			}
			if(dy<0 && y==limit_y){ //y값이 감소될때				
				dy=0;
				dx=-1;
				limit_x++;
			}
			if(dx<0 && x==limit_x){ //x값이 감소될때				
				dy=1;
				dx=0;
				limit_y++;
			}
		}
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.printf("%3d \t", buf[i][j]);
			}
			System.out.println();
		}		
	}

}
