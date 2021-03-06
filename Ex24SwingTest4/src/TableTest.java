import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class TableTest extends JFrame{
	public TableTest() {
		// TODO Auto-generated constructor stub
		
		setTitle("회원명단 출력Table");
		setBounds(600,100,350,220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//표에 들어갈 항목들(칸제목: column의 제목)
		String[] colNames=new String[] {"Name", "Age","Gender","Address"};
		
		//표에 들어갈 데이터들
		Object[][]datas= {
				{"sam",20,"male","seoul"},
				{"robin",23,"female","LA"},
				{"hong",32,"female","Calgary"},
				{"kim",29,"male","Ulsan"},
				{"lee",32,"male","seoul"},
				{"sam",20,"male","seoul"},
				{"robin",23,"female","LA"},
		};
		
		//위에 만든 제목과 데이터들로 표(Table) 만들기
		JTable table=new JTable(datas, colNames);
		//add(table,BorderLayout.CENTER); //표 아래쪽이 안 보일 수 있음
		JScrollPane scrollPane=new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		
		JButton btn=new JButton("BUTTON");
		add(btn, BorderLayout.SOUTH);
		
		
		//버튼 클릭했을 때 테이블의 정보를 읽어와서 콘솔창에 출력
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//JTable안에서 실제 표(table)의 데이터를 관리하는 객체 얻어오기!
				TableModel model=table.getModel();
				
				
				//컬룸(열, 칸)의 개수 얻어오기
				int colCnt=model.getColumnCount();
				
				
				//컬룸의 제목 얻어와서 출력하기
				for(int i=0; i<colCnt; i++) {
					String colName=model.getColumnName(i);
					System.out.print(colName+"\t"); // \t tab의 약자 
				}
				System.out.println();
				
				//각 행(row)에 있는 정보들 얻어오기
				int rowCnt=model.getRowCount();
				for(int i=0; i<rowCnt; i++) {
					
					for(int k=0; k<colCnt; k++) {
						
						Object obj= model.getValueAt(i, k);
						System.out.print(obj+"\t");
					}
					System.out.println();
					
				}
				
			}
		});
		
		
		//테이블의 한 칸(셀:Cell)을 콤보박스 형식으로 설정 //adress라서 string
		JComboBox<String> comboBox=new JComboBox<String>();
		comboBox.addItem("seoul");
		comboBox.addItem("LA");
		comboBox.addItem("Calgary");
		comboBox.addItem("Ulsan");
		comboBox.addItem("Jeju");
		
		
		//테이블에서 하나의 컬룸(열 통째로) 얻어오기 
		TableColumn column=table.getColumnModel().getColumn(3); //인덱스 번호가 3번인 열(column)
		column.setCellEditor(new DefaultCellEditor(comboBox));
		
		setVisible(true);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TableTest();

	}

}
