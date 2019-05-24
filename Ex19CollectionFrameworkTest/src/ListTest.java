import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List�� interface(�������̽�)��. ���� ��ü���� �Ұ�!
		//List arr=new List; //error : �������̽��� �ٷ� ��ü���� �Ұ�!!
		
		//List�������̽��� �����ϴ� ����Ŭ������ ��ü�� ����� ����ؾ� ��.
		//List�迭 : ArrayList, LinkedList, Vector(��Ƽ������ ����ȭ�� �Ǿ�����)
		
		//����, ���� �� �˷����� ���Ǿ��� ArrayList����!!(����ü�� �ַ��ַ�)
		//ArrayList Ư¡: ����� �߰�,�����ÿ��� �ӵ��� ����! ���, Ư�� ��Ҹ� �����ϴ� �ӵ��� ����.
		ArrayList<String> arrList=new ArrayList<String>();
		
		//List�� ������ �ִ� �ֿ� ���(�޼ҵ�)�� �˾ƺ���
		//List�� Collection �������̽��� ��ӹ��� ��ŭ Collection interface�� �߻� �޼ҵ带 ������ �ִٰ� Ȯ���� �� ����.
		//ex) add(), remove(), clear(), size(), contains()...etc
		
		//1. ����� ����
		System.out.println("����� ���� : "+ arrList.size());
		System.out.println();
		
		//2. ����� �߰�
		String s=new String("aa");
		arrList.add(s);
		arrList.add(new String("bb"));
		arrList.add(new String("cc"));
		
		System.out.println("����� ���� : "+ arrList.size());
		System.out.println();
		
		//3. ��� ������
		String str= arrList.get(0);
		System.out.println(str);
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		//4. ��� �����ϱ�
		arrList.remove(1); //index 1���� ������
		System.out.println("����� ���� : "+ arrList.size());
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		// System.out.println(arrList.get(2)); ERROR : IndexOutOfBoundsException
		System.out.println();
		
		//5. Ư�� ��ġ�� ��� �߰��ϱ�  //ex)�Խ��� �� �ֽű� �׻� [0��]�濡 �־���
		arrList.add(1, "dd");  //�迭 ����Ʈ 1���濡 dd�־��� 
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		System.out.println();
		
		
		//6. ������ �� �ε��� ��ȣ�� �ƴ� ��ü ���� �ּҷ� ���� ����
		String s2=new String("Test");
		arrList.add(s2);
		System.out.println("����� ���� : "+ arrList.size());
		arrList.remove(s2);
		System.out.println("����� ���� : "+ arrList.size());
		System.out.println();
		
		
		//7. ��� ��� �����
		arrList.clear();
		System.out.println("����� ���� : "+ arrList.size());
		
		
		//8. �ߺ��� �������� �߰� ������.
		arrList.add("aa");
		arrList.add("aa");
		arrList.add("aa");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		//9. ����� �񱳰��ñ�ɵ�
		//arrList.clear();
		System.out.println(arrList.isEmpty()); //����ִ��� ����[true, false]
		System.out.println(arrList.contains("aa")); //�� �����Ͱ� �ִ��� ����[true, false]
		System.out.println(arrList.contains("bb"));
		
		
		//10. �ѹ��� ���� ��ҵ� �߰��ϱ�
		arrList.clear();
		arrList.add("aa");
		arrList.add("bb");
		arrList.add("cc");
		
		ArrayList<String> arrList2=new ArrayList<String>();
		arrList2.add("kk");
		arrList2.add("ss");
		
		arrList.addAll(arrList2); //�Ѳ����� ���̱� 
		System.out.println(arrList.toString()); //�ڵ����� ��ҵ� [,,,]�ؼ� �������(���Ǳ��) //����Ʈ 0,1,2������ �ϱ� ����
		
		//Ư�� ��ġ�� ������ �� �濡 �߰��ϱ�
		arrList.addAll(1,arrList2);
		System.out.println(arrList.toString());
		
		
		//11.Ư�� ��ҵ� �ѹ濡 ����(�����: ���� �ִ� �͵� �� �׾�)
		ArrayList<String> arrList3=new ArrayList<String>();
		arrList3.add("aa");
		arrList3.add("ss");
		arrList.removeAll(arrList3);
		System.out.println(arrList.toString());
		
		
		//12.Ư�� ��Ҹ� ����� ���� (WhiteList: ��׻��� �� �׿�)
		arrList3.clear();
		arrList3.add("kk");
		arrList.retainAll(arrList3); //"kk"���� �� ����
		System.out.println(arrList.toString());
		
		//13. Ư�� ��ҵ��� ��� ���ԵǾ� �ִ��� �� �濡 ��
		arrList.clear();
		arrList2.clear();
		
		arrList.add("aa");
		arrList.add("bb");
		arrList.add("cc");
		arrList.add("dd");
		arrList.add("ee");
		arrList.add("ff");
		arrList.add("cc");
		arrList.add("aa");
		arrList.add("gg");
		
		arrList2.add("aa");
		arrList2.add("dd");
		arrList2.add("kk"); //�̰� ���� �����ϱ� false
		
		System.out.println(arrList.containsAll(arrList2));
		
		
		//14. List�迭���� �ִ� ���!!
		//Ư�� ��Ұ� �� ���濡 �ִ��� -- ���ϰ��� int��(���ȣ-index��ȣ)
		System.out.println(arrList.indexOf("cc") );
		System.out.println(arrList.lastIndexOf("cc") );
		
		
		//��ҵ� ���������� ������ (get)
		//���1. for�� ����ϱ�
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println();
		
		//���2 foreach�� ����ϱ�
		for(String t: arrList) {
			System.out.println(t);
		}
		System.out.println();
		
		//���3. �迭�� �����ؼ� ���!!
		//��, List��ü�� --> �迭 ��ü�� ��ȯ!! 
		String[] arr = new String[arrList.size()];
		arrList.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		//���4. iterator()..�� �̿��ϴ� ���!!  --> Set���� �� ����ϱ�
		
		
		
		
	/*	//*. ������ ���� ����!! 
		arrList.add("aa");
		arrList.remove(new String("aa")); // ��� ������ ��Ȯ�� ������: toString()�� ������ remove����/�����ּҰ� ������ �ƴ϶� toString�� ���İ� ����
		System.out.println("����� ���� : "+ arrList.size());
		System.out.println();
		
		System.out.println("bb".toString());
		System.out.println(new String("bb").toString());
		
		
		//����� ���� Ŭ������ ��ü ������ ���� ����!
		Person p1=new Person(10);
		Person p2=new Person(10);
		//p1, p2�� �ٸ� ��ü��.
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println();
		
		//Person�� ���� �ٴϴ� ���� ��ü(ArrayList)
		ArrayList<Person> persons=new ArrayList<Person>();
		System.out.println(persons.size());
		
		persons.add(p1);
		persons.remove(p2); //�翬�� �� ������. ��? hashCode()�� ���� equals()�� ���ϰ��� true���߸� ���� ��ü�� ��
		System.out.println(persons.size());*/
		
		
		
		//List�������̽� ���� Ŭ������ LinkedList�� ����.
		//LinkedList Ư¡ : ����� �߰�, ������ �ӵ� ����. Ư�� ��ġ�� ã�ư��µ� �ð��� �ɸ�(��ũ �Ѿƴٳ����)
		//������� ArrayList�� ���� ����. ��, �������̸� ����.
		
		LinkedList<String> linkList = new LinkedList<String>();
		
		linkList.add("aaa");
		linkList.add("bbb");
		linkList.add("ccc");
		
		//Ư���Ѱ�!
		linkList.addFirst("kkk");
		linkList.addLast("ssss");
		
		System.out.println(linkList.toString());
		
		
		//�迭�� ����Ʈ�� �����ϱ�!!!
		String[] arr2=new String[] {"aaa", "bbb", "ccc"};
		List<String> list=Arrays.asList(arr2);
		System.out.println(list.toString());
		
		//List<> �θ����������� ��� �ڽ� ��ü��(ArrayList, LinkedList, vector)�� �����Ͽ� ������ �� ����.
		List<String> li=null;
		li=new ArrayList<>();
		li=new LinkedList<>();
		li=new Vector<>();
		
		
		//���׸��� ����ؾ���. ��, ���׸��� �ݵ�� �������� ����!
		//ArrayList<int> arrList5; //error : �⺻���� ���� �ٴ� �� ����.
		//��ſ� Integer WrapperŬ���� �̿밡��
		ArrayList<Integer> arrList5=new ArrayList<Integer>();
		arrList5.add(new Integer(10));
		arrList5.add(20); //����ڽ�
		arrList5.add(30);
		arrList5.add(40);
		
		int n=arrList5.get(0); //�� ����ڽ�
		System.out.println(n);
		
		
	}

}


class Person{
	
	int age;
	public Person(int age) {
		this.age=age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p=(Person)obj;
		return age==p.age;
	}
	
	
}
