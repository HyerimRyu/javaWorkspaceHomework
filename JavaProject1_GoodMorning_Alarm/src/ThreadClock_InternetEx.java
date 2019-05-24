import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
		
		
public class ThreadClock_InternetEx {
	
	
	public static class ThreadClock extends Frame implements ActionListener, Runnable{
		 private Label lbl;
		 private Boolean b = false; //프로세스가 종료되면 스레드도 종료
		 private Thread thread;

		 //생성자에서 프레임생성
		 public ThreadClock() {
		  
		  //프레임 안에 글을 쓰기 위한 label
		  lbl = new Label("display time", Label.CENTER); // Label.CENTER 레이블의 중앙
		  //add : frame을 상속받았기 때문에 사용가능
		  //프레임의 중앙에 lbl을 삽입
		  add("Center", lbl); // add("위치", 넣을데이터)

		  Button button = new Button("click");
		  add("South", button); //프레임의 남쪽에 버튼을 삽입
		  button.addActionListener(this); // ActionListener 는 ThreadClock에 있음으로
		          // this

		  setTitle("스레드 이용한 시계"); //프레임 제목표시줄 설정
		  setBounds(200, 150, 300, 300); //프레임 크기 설정
		  setVisible(true); //프레임을 보여줌

		  //제목표시줄 닫기창 버튼을 누를시에 종료버튼 설정
		  addWindowListener(new WindowAdapter() { // 무명클래스
		   @Override
		   public void windowClosing(WindowEvent e) {
		    b = true; //닫기버튼을 누르면 스레드종료
		    System.exit(0);
		   }
		  });

		  //run 메소드 객체 생성
		  thread = new Thread(this);
		 }

		 //버튼을 눌렀을때 스레드 실행
		 @Override
		 public void actionPerformed(ActionEvent e) { // callback 마우스 눌렀을 때 실행
		  // System.out.println("안녕?");
		  // calShow();
		  if (thread.isAlive())
		   return; // thread 가 살아있으면 return
		  thread.start();
		 }

		 @Override
		 public void run() {
		  while (true) {
		   // if(b == true) break;
		   if (b)
		    break; // b가 true이면(프로세스가 종료되면)
		   calShow();
		   try {
		    Thread.sleep(1000); // 1초마다 시작해야해서
		   } catch (Exception e) {
		    // TODO: handle exception
		   }
		  }
		 }

		 //시계 출력
		 private void calShow() {
		  Calendar calendar = Calendar.getInstance(); // 싱글톤
		  int y = calendar.get(Calendar.YEAR);
		  int m = calendar.get(Calendar.MONTH) + 1; // Month는 0부터 시작
		  int d = calendar.get(Calendar.DATE);
		  int h = calendar.get(Calendar.HOUR);
		  int mi = calendar.get(Calendar.MINUTE);
		  int s = calendar.get(Calendar.SECOND);
		  lbl.setText(y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s);
		  lbl.setFont(new Font("굴림", Font.BOLD, 16));
		 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  // 디지탈 시계
		  new ThreadClock(); // 윈도우프로그램에서 객체변수를 만들필요가 없다.
		 }
		}

	}


