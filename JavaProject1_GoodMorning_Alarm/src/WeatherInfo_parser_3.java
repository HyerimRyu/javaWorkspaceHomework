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
		
		ta= new JTextArea();// ��ư �ִ� �� �ٱ�����
		ta.setEditable(false);
		JScrollPane scrollPane= new JScrollPane(ta);		
		rootPanel.add(scrollPane, BorderLayout.CENTER);
		
		btn= new JButton("������ ���� Ȯ��");
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
			int month=calendar.get(Calendar.MONTH)+1; //�޸� 0���� �����ؼ� 1�÷��� ����� �� 
			int date=calendar.get(Calendar.DATE);
			
			String today=""+year+month+date; //��-ū�ɷ� +�� ���ϱⰡ �� �� �־ Stringȭ ���Ѿ��� ""
			//System.out.println(today);
			ta.append(today+"\n");
			ta.append("\n");
			
			//�սʸ� ����
			String url= "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData?ServiceKey=a%2FX%2FSeoKtP9W7wxCUWRe8WBgmNgxLZ284%2BrFXLKEJLvDIIYqdHVsXjDczAMxj6RPZmtdEb4YLeGmj8P%2BlndBoQ%3D%3D&base_date="+today+"&base_time=0230&nx=55&ny=127&";
			 
			// ���丮 ����
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			// ���� ����:DOM(parser �ϴµ� �ʿ���) ���� Ŭ����
			DocumentBuilder builder= factory.newDocumentBuilder();
			
			// Document������Ʈ ���
			Document xmlDoc= null; //�Ľ̵� xml���� ����  xml����==Document
			xmlDoc= builder.parse(url);//�ļ� ����
			
			// ��Ʈ�� �ڽ� ��� ���
			Element root= xmlDoc.getDocumentElement(); //���� �ʿ��Ѱ� <>��� �ƴϰ� �� �ȿ� �ִ� element(��)�̴ϱ�
			
			 // ����� ����Ʈ ���
			NodeList dataNodes= root.getElementsByTagName("item");
			
			
			
			for(int i=0; i<dataNodes.getLength(); i++) {
				Node dataNode= dataNodes.item(i);
				Element e= (Element)dataNode;
				Node categoryNode= e.getElementsByTagName("category").item(0);
				Node valueNode= e.getElementsByTagName("fcstValue").item(0);
				
				String ca= categoryNode.getTextContent();  
				String value=valueNode.getTextContent();
				
				//���� ���� ���� �ֱ� 
				if(ca.equals("TMX")){
					ta.append("�� �ְ���: " + value + "��" + "\n");}  //���ְ� �� �ȶ�? 
				
				if(ca.equals("TMN")) {
					ta.append("��ħ ������� : " + value + "��" + "\n");}    //�� �ѱ�'��'�� �ٲ㵵 ���� 
				
				if(ca.equals("POP")) {
					ta.append("����Ȯ��: " + value + "�� " + "\n");}
				
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
	

	
