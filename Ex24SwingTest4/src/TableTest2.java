import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableTest2 extends JFrame{
	
	ArrayList<Member> members=new ArrayList<Member>();
	
	public TableTest2() {
		// TODO Auto-generated constructor stub
		setTitle("회원명단 추가삭제 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setBounds(500,100,400,200);
		
		
		
		//표의 제목줄
		String[] colNames=new String[] {"Name", "Age", "Gender"};
		//표에 들어갈 데이터들
		//처음은 비어있는 테이블로 만들기 위해 데이터 관리객체를 생성
		DefaultTableModel model=new DefaultTableModel(colNames,0);
		
		JTable table=new JTable(model);
		JScrollPane scrollPane=new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		
		
		//테이블 아래쪽(South)에 데이터 입력할 수 있는 패널
		JPanel bottomPanel=new JPanel();
		bottomPanel.setLayout(new GridLayout(2, 1));
		
		JPanel panel=new JPanel();
		
		JTextField tfName=new JTextField(6);
		JTextField tfAge=new JTextField(3);
		
		JRadioButton rb1=new JRadioButton("female");
		JRadioButton rb2=new JRadioButton("male");
		ButtonGroup rg=new ButtonGroup()
;
		rg.add(rb1); rg.add(rb2);
		
		panel.add(new JLabel("NAME"));
		panel.add(tfName);
		
		panel.add(new JLabel("AGE"));
		panel.add(tfAge);
		
		panel.add(rb1);
		panel.add(rb2);
		rb1.setSelected(true);
		
		bottomPanel.add(panel);
		
		JPanel pannel2=new JPanel();
		JButton btnAdd=new JButton("ADD");
		JButton btnDel=new JButton("DELETE");
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//입력된 값들을 테이블에 추가하기!!!!
				
				//입력된 값들을 한 줄 데이터 덩어리(배열)로 
				String[] rows=new String[3];
				
				rows[0]=tfName.getText();
				rows[1]=tfAge.getText();
				if(rb1.isSelected()) rows[2]="female";
				else rows[2]="male";
				
				model.addRow(rows); //한 줄 단위로만 대입이 가능하므로 
				
				//기존에 TextField에 입력된 값들을 제거하기.. 다음 입력이 수월하도록 
				tfName.setText("");  //GUI에서 제거하기 ""
				tfAge.setText("");
				rb1.setSelected(true);
				
				//어레이리스트에 멤버객체 추가
				String name=rows[0];
				int age=Integer.parseInt(rows[1]);
				String gender=rows[2];
				members.add(new Member(name, age, gender));
				System.out.println("회원 수 : " + members.size());
			}//add
		});
		
		
		//지우기 버튼
		btnDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//내가 선택한 줄(row)의 번호 알아내기
				int rowIndex=table.getSelectedRow();
				//만약 선택한 줄이 없으면 리턴값이 -1임/인덱스는 0번부터 -1은 언제나 못 찾았다. 
				if(rowIndex==-1) return;
				
				model.removeRow(rowIndex); //해당 인덱스 번호의 줄(row)제거
				
				
				//ArrayList에서 멤버제거
				members.remove(rowIndex);
				System.out.println("회원 수 : " + members.size());
			}
		});
		
		
		pannel2.add(btnAdd);
		pannel2.add(btnDel);
		
		bottomPanel.add(pannel2);
		
		//프레임에 bottomPanel붙이기
		add(bottomPanel, BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
	
	
	//회원1명의 정보를 저장하는 클래스  : 오로지 데이터 저장용 클래스  //VO: Value Object
	class Member{ 
		String name;
		int age;
		String gender;
		
		
		public Member(String name, int age, String gender) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TableTest2();

	}

}
