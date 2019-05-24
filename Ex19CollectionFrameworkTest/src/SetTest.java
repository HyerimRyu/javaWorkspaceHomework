import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set �������̽� : �������X, index X, �ߺ� Data���X 
		
		//Set<String> set=new Set<String>(); //error:�������̽��� ��ü ���� �Ұ�!
		
		//Set�������̽��� ����(implements)�� ����Ŭ������ ��ü�� ���� ���! 
		//1. HashSet : ����� ���� �ľ� �����(������� ���� �ȵ�). �ؽ����̺��̶�� ���� ���� ��������� ������. 
						//Set�迭�߿��� ���� ���� ����(������ �������� �� �ӵ� ����. ���� ���� ���)
		//2. TreeSet : ����� �������� ���� ���� ���ĵǴ� Set. red-blackƮ�� ��� ���. HashSet���� ������ �ణ ����. �ٵ� �ֽ�? �������� ������� ����ż�
		//3. LinkedHashSet : ����� ������� �� ����. ���� ���� ������ 
		
		//set�������̽��� Collection �������̽��� ����Ͽ� ������� ��ŭ, Collection�������̽��� (�߻�)�޼ҵ带 ��� ������ �ִٰ� Ȯ���� �� ����. 
		//ex) add(), remove(), clear(), size(), contains()... etc..
		
		//HashSet<String> hs=new HashSet<String>(); //�ߺ� ����
		//TreeSet<String> hs=new TreeSet<String>(); //���ĺ� ������� 
		LinkedHashSet<String> hs=new LinkedHashSet<String>(); //���� ���� ������� 
		
		hs.add(new String("aaa"));
		hs.add("bbb");
		hs.add("fff");
		hs.add("ggc");
		hs.add("eee");
		hs.add("fff");
		hs.add("fef");
		hs.add("fef");
		hs.add("ddc");
		
		System.out.println(hs.size() + ":"+ hs.toString());
		
		//��� ������// get()�޼ҵ� ����: index��ȣ�� �����Ƿ�!!
		
		//������ ��� : ���ʷ� �����ϴ� ��� 
		//���1. foreach��
		for(String t: hs) {
			System.out.println(t);
		}
		System.out.println();
		
		//���2. �ݺ���(iterator)
		Iterator<String> datas = hs.iterator();
		/*String s1 = datas.next();
		String s2 = datas.next();
		String s3 = datas.next();*/
		
		while(datas.hasNext()) { //������ �ִ��� Ȯ���ϴ°� hasNext()
			//String s=datas.next(); 
			System.out.println(datas.next());
			}
			System.out.println();
			
			
		//���3. Array�� �����ؼ� ���� 
		String[] arr=new String[hs.size()]; //Set�� ���� ������ �迭 �����
		hs.toArray(arr); //�迭 ��ҿ� �� ���� ����
		
		System.out.println(Arrays.toString(arr));
		
		
		//����� ���� Ŭ������ Set���� ... ���� �Ǹ� ���� �ȵǸ� �Ѿ
		HashSet<AAA> hs1=new HashSet<AAA>();
		hs1.add(new AAA(10));
		hs1.add(new AAA(20));
		hs1.add(new AAA(10));
		System.out.println(hs1.toString());
		
		//����� ���� Ŭ������ ��� ���� ���������� ���Ϸ��� 
		//Ŭ������ ������ ��, hashCode()�� equals()�� �������̵� �ؾ߸� �Ѵ�.
		HashSet<BBB> hs2=new HashSet<BBB>();
		hs2.add(new BBB(10));
		hs2.add(new BBB(20));
		hs2.add(new BBB(10));
		System.out.println(hs2.toString());
		
		
		//TreeSet�� �������� ���� ���� ������������ ����!! (==�Ӹ� �ƴ϶� �۴�ũ�ϵ� ���ؾ���)
		// : Comparable �������̽��� ������ Ŭ������ TreeSet���� ���İ���! 
		TreeSet<CCC> ts = new TreeSet<CCC>();
		ts.add(new CCC(10));
		ts.add(new CCC(20));
		ts.add(new CCC(40));
		ts.add(new CCC(50));
		ts.add(new CCC(30));
		System.out.println(ts.toString());
		
		String s="aaa";
		System.out.println(s instanceof Comparable);
		
		
	}

}
//�����ڸ� �ڷ������� �� ��: ������ ���� Ŭ������  treeSet���� �̿��� ��, implements Comparable<CCC>//CCC�� ������ class==�ڷ���
class CCC implements Comparable<CCC>{
	int a;
	public CCC(int a) {
		this.a=a;
	}

	@Override
	public int compareTo(CCC arg0) {
		// TODO Auto-generated method stub
		return a-arg0.a; //����� ������ ���� ��, ����� ���� ��!! 
						 //������(���Ϸ��� ��)-���� ��(�ڷᰪ)
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a+"";
	}
	
}

class BBB{
	int a;
	public BBB(int a) {
		this.a=a;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return a; //����������� ���Ͻ�Ű����! 
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if(arg0 instanceof BBB) {
			BBB obj = (BBB)arg0;
			return this.a == obj.a;
		}
			return false;
		
	}
}


class AAA{
	int a;
	public AAA(int a) {
		this.a=a;
	}
}
