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
		 private Boolean b = false; //���μ����� ����Ǹ� �����嵵 ����
		 private Thread thread;

		 //�����ڿ��� �����ӻ���
		 public ThreadClock() {
		  
		  //������ �ȿ� ���� ���� ���� label
		  lbl = new Label("display time", Label.CENTER); // Label.CENTER ���̺��� �߾�
		  //add : frame�� ��ӹ޾ұ� ������ ��밡��
		  //�������� �߾ӿ� lbl�� ����
		  add("Center", lbl); // add("��ġ", ����������)

		  Button button = new Button("click");
		  add("South", button); //�������� ���ʿ� ��ư�� ����
		  button.addActionListener(this); // ActionListener �� ThreadClock�� ��������
		          // this

		  setTitle("������ �̿��� �ð�"); //������ ����ǥ���� ����
		  setBounds(200, 150, 300, 300); //������ ũ�� ����
		  setVisible(true); //�������� ������

		  //����ǥ���� �ݱ�â ��ư�� �����ÿ� �����ư ����
		  addWindowListener(new WindowAdapter() { // ����Ŭ����
		   @Override
		   public void windowClosing(WindowEvent e) {
		    b = true; //�ݱ��ư�� ������ ����������
		    System.exit(0);
		   }
		  });

		  //run �޼ҵ� ��ü ����
		  thread = new Thread(this);
		 }

		 //��ư�� �������� ������ ����
		 @Override
		 public void actionPerformed(ActionEvent e) { // callback ���콺 ������ �� ����
		  // System.out.println("�ȳ�?");
		  // calShow();
		  if (thread.isAlive())
		   return; // thread �� ��������� return
		  thread.start();
		 }

		 @Override
		 public void run() {
		  while (true) {
		   // if(b == true) break;
		   if (b)
		    break; // b�� true�̸�(���μ����� ����Ǹ�)
		   calShow();
		   try {
		    Thread.sleep(1000); // 1�ʸ��� �����ؾ��ؼ�
		   } catch (Exception e) {
		    // TODO: handle exception
		   }
		  }
		 }

		 //�ð� ���
		 private void calShow() {
		  Calendar calendar = Calendar.getInstance(); // �̱���
		  int y = calendar.get(Calendar.YEAR);
		  int m = calendar.get(Calendar.MONTH) + 1; // Month�� 0���� ����
		  int d = calendar.get(Calendar.DATE);
		  int h = calendar.get(Calendar.HOUR);
		  int mi = calendar.get(Calendar.MINUTE);
		  int s = calendar.get(Calendar.SECOND);
		  lbl.setText(y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s);
		  lbl.setFont(new Font("����", Font.BOLD, 16));
		 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  // ����Ż �ð�
		  new ThreadClock(); // ���������α׷����� ��ü������ �����ʿ䰡 ����.
		 }
		}

	}


