import java.net.InetAddress;
import java.net.UnknownHostException;

public class BookHost2ip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hostname="www.naver.com";
		
		InetAddress address;
		try {
			address = InetAddress.getByName(hostname);
			System.out.println("IP�ּ� : "+ address.getHostAddress());
			
			
			
		} catch (UnknownHostException e) {
			System.out.println(hostname + "�� IP�ּҸ� ã�� �� �����ϴ�.");
		}
		
		
		
	}

}
