/*
 # ����
 1) �����̶� ���α׷����� �����͸� ó���Ͽ� ����� �����ϴ� ���� ���ϰ� �̷� ���꿡 ���Ǵ� ǥ�ó� ��ȣ�� ������(operator)��� �Ѵ�.
 2) ��� ������ : +, -, /, *, %	
  
 */	
package a03_operator;

public class A01_basic_0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num01=25;
		int num02=75;
		System.out.println(num01+" + "+num02+" = "+(num01+num02));
		System.out.println(num01+" + "+num02+" = "+parseInt(num01+num02));
		System.out.println(num01+" + "+num02+" = "+parseDouble(num01+num02));
		System.out.println(num01+" + "+num02+" = "+num01+num02);
		System.out.println(num01+" + "+num02+" = "+parseDouble(num01)+parseDouble(num02));
		System.out.println(num01+" + "+num02+" = "+parseInt(num01)+parseInt(num02));
		System.out.println(num01+" - "+num02+" = "+(num01-num02));
		System.out.println(num01+" * "+num02+" = "+(num01*num02));
		System.out.println(num01+" * "+num02+" = "+num01*num02);
		// ����/���� -> ����������
		// ����/�Ǽ� -> �����ϴ� ������ ���� �ϳ��� �Ǽ����̾�� �Ǽ� ó���� ��. (�Ǽ���)���� �����͸� cast�Ͽ� ����ȯ���� ó���� �����ϴ�.
		System.out.println(num01+" / "+num02+" = "+(num01/num02));
		System.out.println(num01+" / "+num02+" = "+num01/num02);

		System.out.println(num01+" / "+num02+" = "+(num01/(double)num02));
		System.out.println(num01+" / "+num02+" = "+((double)num01/num02));
		
	}

	private static int parseDouble(int num01) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int parseInt(int num01) {
		// TODO Auto-generated method stub
		return 0;
	}

}
