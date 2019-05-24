import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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

public class Main extends JFrame{
	
	JButton btn;	
	JTextArea ta;
	
	public Main() {
		// TODO Auto-generated constructor stub
		
		JPanel rootPanel= new JPanel();
		rootPanel.setLayout(new BorderLayout());
				
		ta= new JTextArea();
		ta.setEditable(false);
		JScrollPane scrollPane= new JScrollPane(ta);		
		rootPanel.add(scrollPane, BorderLayout.CENTER);
		
		btn= new JButton("EAST");
		rootPanel.add(btn, BorderLayout.NORTH);
		
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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setVisible(true);
	}
	
	
	void getWeather() {
		
		try {
			//±¤Áø±¸ È­¾çµ¿ ³¯¾¾
			String url= "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1121571000";
			
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			DocumentBuilder builder= factory.newDocumentBuilder();
			
			Document xmlDoc= null;
			xmlDoc= builder.parse(url);
			
			Element root= xmlDoc.getDocumentElement();
			System.out.println( root.getTagName()+"  asdfasd");
			
			NodeList dataNodes= root.getElementsByTagName("data");
			
			
			for(int i=0; i<dataNodes.getLength(); i++) {
				Node dataNode= dataNodes.item(i);
				Element e= (Element)dataNode;
				Node tempNode= e.getElementsByTagName("temp").item(0);
				Node wfNode= e.getElementsByTagName("wfKor").item(0);
				Node hourNode= e.getElementsByTagName("hour").item(0);
				
				ta.append("No : "+ (i+1) + "\n");
				ta.append("TEMP : " + tempNode.getTextContent() +"\n");
				ta.append("WFKOR : " + wfNode.getTextContent() +"\n");
				ta.append("HOUR : " + hourNode.getTextContent() +"\n");
				ta.append("--------------------------------------\n");
				ta.append("\n");
				
			}
		
			
		} catch (ParserConfigurationException e) {
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
