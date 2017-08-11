package a00_basic;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class A07_Util_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greet="Hello";
		System.out.println(greet.replace('o','i'));
		// ���ڿ� �ٲ� ó�� replace
		
		System.out.println(greet.substring(1, 4)); 
		// substring(�ε���, ����) : �κ����. �ε�����ȣ 1~3�� ����ϰڴ�.
		
		System.out.println(greet.length());
		// length() : ���ڿ� ���� ���
		
		
		/* Wrapper Ŭ���� 
		primitive data�� ��üȭ ���� ��� ó���� �� �� �ְ� ������
		1) int -> Integer
			ex) Integer int01 = new Integer("25");
		
		2) double -> Double
			ex) Double dbl01 = new Double("27.5");
			
		3) char -> Character
			ex) Character c01 = new Character('c');  */
		
		Integer int01 = new Integer("25");
		Double dbl01 = new Double("27.5");
		Character c01 = new Character('c'); 
		System.out.println(int01.toString());
		System.out.println(dbl01.doubleValue());
		System.out.println(c01.toString());
		
		/* Random Ŭ����
		������ ���� ��Ÿ��
		nextInt(100) : 1���� 100���� ���� ������ ���
		
		import XXX : Ư���� ��� Ŭ������ �⺻������ �������� ���� �� Ȱ��.
		- class�� ���� ���� : import java.util.Random;
		 */
		Random ran = new Random();
		int num = ran.nextInt(100);
		System.out.println("1~100������ ������ ��: "+num);
		float f = ran.nextFloat();
		System.out.println("0.0���� 1.0���� ������ ��: "+f);
		boolean b = ran.nextBoolean();
		System.out.println("true/false ������ ��: "+b);
		
		/* SimpleDataFormat : ��¥�� ���ϴ� �������� ����Ҷ� Ȱ��ȴ�.
		 SimpleDataFormat("yyyy�� MM�� dd�� hh:mm:ss a")
		 yyyy: �⵵, 	MM: ��, 	dd: ��, 	HH: �ð�, 	mm: ��, 	ss: ��, 	a: am/pm ó��
		 */
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
		
		String date = sdf.format( new Date() );
		System.out.println(date);
		
	}

}
