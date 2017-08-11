/*
 ������ Ÿ���� ����
 �⺻ ������ type
 -������, �Ǽ���, ����
 
 ���� ������ type
 - reference, adderess value
 - ��ü-Ŭ����
 - �迭
 - �������̽�

	stack : 100����( heap���� �ּ�)		
	heap : 100��(���� ��ü, �迭)
*/

/*
 # JVM �޸�
 stack ������ heap����
 
 stack ���� 
 1)	primitive data type
   		�⺻ ������ Ÿ��(����, �Ǽ�, boolean) �Ҵ�
   		���� ���念���� ���� �������� �޸� ������ ����
   
 2) reference data type
   		������ ������Ÿ��(��ü, �迭, �������̽�) �Ҵ�.
   		���� ���念������ ���� ������ �޸��� �ּҰ��� �Ҵ��ϰ�
   		���� �����ʹ� heap������ �Ҵ�Ǵ� ���� ���Ѵ�.
 
 heap ����
 	- ������ �����Ͱ� ���� ���� �޸𸮷� stack�� �ּҰ��� ���� ȣ��ȴ�.
  
 # �޼ҵ� ����
 - �����, �ʵ嵥����, �޼ҵ嵥����, �޼ҵ� �ڵ�, ������ �ڵ� ���� �з��ؼ� ����.
 - JVM�� ���۵� �� �����ǰ� ��� �����尡 �����ϴ� �����̴�.
 
 # �޸𸮿��� ==, != ����
 - �⺻�������������� �����Ϳ� �޸𸮰� �����ϱ⿡ ���� �����ʹ� ���� �޸𸮷� ������ ��(boolean)���� ��Ÿ����.
 ex) int num01 = 25;
 	 int num02 = 25;
 	 System.out.println(num01==num02);		- true
 
 - ������������ �����Ϳ� �޸𸮰� �������� �ʱ� ������ ���� ��ü�� ȣ���ϴ��� �ּҰ��� �ٸ��⿡ �ٸ� �ּҰ����� �ν��Ͽ� ��Ÿ����.
 ex) Person p1 = new Person();	 
 	 Person p2 = new Person();
 	 System.out.println(p1==p2); 		-false
*/

/*
 # null, nullPointer
 1) ������ �����Ϳ��� ���������� �����ϰ� heap������ ���� ��ü�� �������� ���� �� null�� �Ҵ��Ѵ�.
 - person p = null;
 
 2) ��ü�� heap������ �Ҵ���� �ʴ� ��Ȳ���� �޼��带 ȣ���ϸ� �߻��ϴ� ������ NullPointerException�̴�.
 - �迭�� ���� ���� ȣ��, �����Ͱ� ���� ��Ȳ���� ȣ��
 ex) String name = null;
 	 System.out.println(name.length());
 	 System.out.println( args[0] );
*/

/*
 # String ��ü ������ ���ؼ�
 1. String�� ��ü�̴�.
 1) ù���ڰ� �빮���� ���� �ڹٿ��� ��ü�� �����Ѵ�.
 
 2) ��ü�� ���� �޼��带 ������ �ִ�.
 	- .length(), substing(idx01, idx02), concat();
 
 3) "���ڿ�"�� �ٷ� �Ҵ��� �� �ִ�. new String("���ڿ�")�ε� �Ҵ� ����.
 	- ������ : "���ڿ�"�� �ٷ� �Ҵ��ϸ� ���� ���ڿ��� ���� stack�ּҷ� �Ҵ�Ǿ� �ֱ⿡
 	  �� �����ڸ� ���� ���� ���ڿ��� true���� ��µȴ�.
 	  ex) System.out.println("�޽�"=="�޽�"); true
 	
 	- new�� ��ü������ �ϸ鼭 ���� ���ڿ������� �ٸ� �ּҰ��� ȣ���ϱ⿡ false���� ��µȴ�.
 	  ex) String name01 = new String("�޽�");
		  String name02 = new String("�޽�");
		  System.out.println(name01==name02); false
		  System.out.println(name01.equals(name02)); equals : ���ڿ� ��ü�� ���ϴ� �޼��带 Ȱ��
 	
 
*/
package a05_reference;

public class A01_basic_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 25;
		
		System.out.println(age==25);
		// == : �񱳿�����. ���� ������ ���� ���念���� Ȯ���� �� �ִ�.
		
		A01_basic_0417 p = new A01_basic_0417();
		System.out.println(p);
		/* a05_reference.A01_basic_0417@dcf3e99
		��ü��@heap������ �ּҰ��� 16�����ڵ�� �Ҵ�(JVM���� �ڵ��Ҵ�)
		stack���������� dcf3e99�ּҸ� �Ҵ��ϰ� ���� A01_basic_0417()��
		heap������ dcf3e99�ּҿ� ��ü�� �Ҵ�Ǿ� �ִ�. */
		
		/* �޸��� ==, != ������ Ȱ��.
		stack �ּҰ��� ���� �������� �⺻ ���������� ���� �����ϸ� true.
		�������������� ���� ��ü�� �����ϴ��� heap ������ ���� ��ü�� �ٸ��Ƿ� false. */
		int num01 = 30;
		int num02 = 30;
		System.out.println("�⺻��������: "+(num01==num02));
		
		A01_basic_0417 a01 = new A01_basic_0417();
		A01_basic_0417 a02 = new A01_basic_0417();
		System.out.println("������������: "+(a01==a02));
		System.out.println(a01);
		System.out.println(a02);
		// ������ ��ü�� �����ϴ��� heap ������ �ٸ� ��ġ�� �����ϱ⿡ stack������ �ּҰ��� �ٸ��Ƿ� false�� ���´�.
		// a01 stack �ּ� : 7dc5e7b4 , a02 stack �ּ� : 1ee0005
		
		/* null���� �Ҵ�.
		���� ������ ��ü�� �Ҵ����� ���� �� ó���ϴ� �κ�.
		�Ϲ������� ��ü�� �ʱ�ȭ�� �� Ȱ��ȴ�.*/
		A01_basic_0417 a03 = null;
		String name=null;
		System.out.println("������ü�� ���� �������� a03: "+a03);
		System.out.println("������ü�� ���� �������� name: "+name);
		// int num07=null; �⺻ ���������� �������� �ƴϱ⿡ null�� �Ҵ� �� �� ����.
		
		/* �������� �����͸� �Ҵ�Ǿ��� ���� �Ҵ���� �ʾ��� �� �����߻� �κ�.
		heap������ �����Ͱ� ��, ���� ��ü�� �Ҵ���� �ʾұ⿡ ������ �޼ҵ峪 ������ ȣ���ϸ�
		NullPointerException�� �߻��Ѵ�. */
		String name02 ="ũ����Ƽ�ƴ� ȣ����";
		System.out.println("��ü�� �Ҵ�� ���: "+name02.length());
		// ���ڿ�.length() : ���ڿ��� ����
//		 System.out.println("��ü�� �Ҵ絵�� ���� ���: "+name.length());
		// NullPointException : �����Ǵ� ��ü�� ���µ� �ش� ���� �޼��带 ȣ���� ���
		
		
		// �迭������ �ش� ��ü�� �����Ͱ� �Ҵ���� �ʾ��� ��
		// ArrayIndexOutOfBoundsException : �迭�� �ش� ������ �����Ͱ� ������ ��Ÿ��
//		System.out.println(args[0]);
//		System.out.println( args.length );
		
		// �迭 ��ü�� �������� �ʾ��� ��� �ش� ������ ȣ���ϸ� NullPointerException
//		String [] name03 = null;
//		System.out.println(name03[0]);
		
		/* String���� �ּҿ� ���ڿ��� ��
		 1. String�� ��ü�̴�. ������ ���Կ����ڿ� ���ؼ� ���������� ���ڿ��� �Ҵ��ϸ� 
		 	���ڿ��� ���� ���� ���� �ּҿ� �Ҵ��� �ȴ�. */
		String name05 = "ȣ����";
		String name06 = "ȣ����";
		System.out.println(name05==name06);
		
		/*
		 2. ��ü�� ��Ģ�����δ� String �������� = new String(���ڿ�)��
		 ������ �Ǹ� �Ϲ����� framework�� ������ �ε��� ���ؼ� ó���Ǵ� ����
		 ���������� �̿� ���� ������� ó���ȴ�.
		 �̷��� �� ���� ��ü�� ���ڿ��� ������ �ٸ� ���������� Ȱ���ϱ⿡ �ٸ� �ּҷ� �Ҵ�Ǿ� �ּҰ� �񱳴� false���� �ȴ�.
		 */
		String name07 = new String("���");
		String name08 = new String("���");
		System.out.println(name07==name08); // false�� ��Ÿ��
		
		/* ���ڿ� ��ü�� ���� �񱳴� ��Ģ������ ���ڿ� ��ü���� �����ϴ� �޼���(.equals)�� Ȱ���ؼ� ó���ؾ� �Ѵ�. 
		���ڿ�����.equals("���ڿ�") */
		System.out.println(name07.equals(name08));
		// ���ڿ��� ���� ��, true���� ��µȴ�.


	}

}
