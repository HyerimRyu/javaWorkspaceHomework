
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=4;

		
		//�޼ҵ常 �ִ� Ŭ���� ��ü ����!!...����(��Ģ����)
		Calculator cal=new Calculator();
		
		int sum=cal.sum(a,b);//���� ��ü���� ��� �Ƿ� 
		System.out.println(sum);
		
		int sub=cal.subtract(a, b);
		System.out.println(sub);
		
		int mul=cal.multiply(a, b);
		System.out.println(mul);
		
		int div=cal.divide(a, b);
		System.out.println(div);
		
		//�Ǽ��� ������ ���� �Ƿ�
		double c=3.5;
		double d=4.6;
		
		//�̷��Ե� ����!!
		//double sum2=cal.sum(c, d);
		System.out.println(cal.sum(c, d));
		
		
		System.out.println(cal.sum(c, d));
		System.out.println(cal.subtract(c, d));
		System.out.println(cal.multiply(c, d));
		System.out.println(cal.divide(c, d));
	
		System.out.println("123"+"456");
		System.out.println(cal.sum("123","456"));
		
		//call by value, call by reference �����͸� ������ ���, �����Ͱ� �ƴѰ��� ������ ���۷���
		int n=10;
		
		Cal ca=new Cal();
		ca.increase(n);
		
		System.out.println("main�� n�� : "+ n);
		
		int[] arr=new int[] {10,20,30};
		ca.increase(arr);
		
		System.out.println("main arr �� : ");
		for(int t : arr) {//foreach��
			System.out.println(t+"  ");
		}
		System.out.println();
		
	}//main method

}//main class



class Cal{
	
	//���޹��� ���� 1 ����
	void increase(int a) {
		a++;
		System.out.println("a�� �� :"+ a);
	}
	
	//�迭�� �Ķ���ͷ� �ޱ�
	void increase(int[] a) {
		for(int i=0; i<a.length; i++) {
			a[i]++;
		System.out.print(a[i]+"  ");
	}
	System.out.println();
	}
}
