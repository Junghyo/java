/*
 # �ܺ� ������ �� �Է�
 1) ����
 - java Ŭ������[]data01[]data02
 - data01, data02�� ���ڿ� �迭�� �ԷµǾ�
 - main(String[] args)����  		
*/
package a03_operator;

public class A04_argument_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� 1 : "+args[0]);
		System.out.println("���� 1�� ���� : "+args[1]);
		System.out.println("���� 2 : "+args[2]);
		System.out.println("���� 2�� ���� : "+args[3]);		
		// ����ó���� ���ؼ� ����ó��
		// Integer.parseInt("���������ڿ�")
		String fruit01 = args[0];
		String fruit02 = args[2];
		int fruitCnt01 = Integer.parseInt(args[1]);
		int fruitCnt02 = Integer.parseInt(args[3]);
		System.out.println("���� ���ų���");
		System.out.println( fruit01+"\t"+fruitCnt01+"\t"+(fruitCnt01*3000) );
		System.out.println( fruit02+"\t"+fruitCnt02+"\t"+(fruitCnt02*4000) );
		
		

	}

}
