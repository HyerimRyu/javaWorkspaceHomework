import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//최상위 컨테이너 객체생성
		Frame f=new Frame("GUI TEST");
		f.setSize(500, 400);
		
		//x버튼 클릭해도 안꺼져! x버튼 눌렀을때 꺼지는 code(이벤트처리)
		WindowAdapter adapter = new WindowAdapter() {
			
			//Frame의 x버튼을 클릭하면 자동으로 실행되는 메소드: 콜백 메소드
			@Override
			public void windowClosing(WindowEvent e) {
				//이 프레임 창(window)를 없애기! 
				f.dispose();
				
			}
		};
		
		f.addWindowListener(adapter);
		
		//컨테이너 안에 놓여질 컴포넌트(구성요소)들을 추가!! 
		
		//컴포넌트 생성
		Button btn=new Button("확인");
		Button btn2=new Button("취소");
		Button btn3=new Button("Hello World");
		//btn3번을 클릭했을 때 글씨 변경
		//btn3 객체가 클릭되었는지를 바라보고 있는 스토커객체 생성 및 붙여주기
		btn3.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn3.setLabel("Nice Java");
			}
		});
		
		
		//컴포넌트 배치를 어떻게 할지 결정하는 LayoutManaget객체 생성
		FlowLayout layout=new FlowLayout();//차례로 옆으로 배치
		f.setLayout(layout);
		
		//만들어진 버튼을 컨테이너(Frame)에 추가!
		f.add(btn);
		f.add(btn2);
		f.add(btn3);
		
		
		
		//화면에 보여줘~
		f.setVisible(true);

	}

}
