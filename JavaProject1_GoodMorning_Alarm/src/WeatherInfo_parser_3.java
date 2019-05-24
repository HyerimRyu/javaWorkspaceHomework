import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class WeatherInfo_parser_3 extends JFrame{
	
	JButton btn;	
	JTextArea ta;
	
	public WeatherInfo_parser_3() {
		// TODO Auto-generated constructor stub
		
		JPanel rootPanel= new JPanel();
		rootPanel.setLayout(new BorderLayout());
		
		ta= new JTextArea();// 버튼 있는 데 바깥영역
		ta.setEditable(false);
		JScrollPane scrollPane= new JScrollPane(ta);		
		rootPanel.add(scrollPane, BorderLayout.CENTER);
		
		btn= new JButton("오늘의 날씨 확인");
		rootPanel.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new Thread() {
					public void run() {
						getWeather();
					}
				}.start();				
				
			}
		});
		
		
		add(rootPanel);
		
		setSize(500, 300);
		setLocation(1000, 100);
		
		setAlwaysOnTop(true);
		setVisible(true);
	}
	
	
	void getWeather() {
		
		try {
			Calendar calendar= Calendar.getInstance();
			int year= calendar.get(Calendar.YEAR);
			int month=calendar.get(Calendar.MONTH)+1; //달만 0부터 시작해서 1플러스 해줘야 해 
			int date=calendar.get(Calendar.DATE);
			
			String today=""+year+month+date; //작-큰걸로 +가 더하기가 될 수 있어서 String화 시켜야해 ""
			//System.out.println(today);
			ta.append(today+"\n");
			ta.append("\n");
			
			//왕십리 날씨
			String url= "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData?ServiceKey=a%2FX%2FSeoKtP9W7wxCUWRe8WBgmNgxLZ284%2BrFXLKEJLvDIIYqdHVsXjDczAMxj6RPZmtdEb4YLeGmj8P%2BlndBoQ%3D%3D&base_date="+today+"&base_time=0230&nx=55&ny=127&";
			 
			// 팩토리 생성
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			// 빌더 생성:DOM(parser 하는데 필요한) 관련 클래스
			DocumentBuilder builder= factory.newDocumentBuilder();
			
			// Document오브젝트 취득
			Document xmlDoc= null; //파싱된 xml문서 저장  xml문서==Document
			xmlDoc= builder.parse(url);//파서 생성
			
			// 루트의 자식 노드 취득
			Element root= xmlDoc.getDocumentElement(); //내가 필요한건 <>노드 아니고 그 안에 있는 element(값)이니까
			
			 // 노드의 리스트 취득
			NodeList dataNodes= root.getElementsByTagName("item");
			
			
			
			for(int i=0; i<dataNodes.getLength(); i++) {
				Node dataNode= dataNodes.item(i);
				Element e= (Element)dataNode;
				Node categoryNode= e.getElementsByTagName("category").item(0);
				Node valueNode= e.getElementsByTagName("fcstValue").item(0);
				
				String ca= categoryNode.getTextContent();  
				String value=valueNode.getTextContent();
				
				//여기 수정 사항 넣기 
				if(ca.equals("TMX")){
					ta.append("낮 최고기온: " + value + "℃" + "\n");}  //낮최고 왜 안떠? 
				
				if(ca.equals("TMN")) {
					ta.append("아침 최저기온 : " + value + "℃" + "\n");}    //℃ 한글'도'로 바꿔도 에러 
				
				if(ca.equals("POP")) {
					ta.append("강수확률: " + value + "％ " + "\n");}
				
				//ta.append("CATEGORY : " + categoryNode.getTextContent() +"\n");
				//ta.append("WFKOR : " + valueNode.getTextContent() +"\n");				
				//ta.append("--------------------------------------\n");
				//ta.append("\n");
				}
			ta.append("\n");
			}
			
		
				catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	

	
