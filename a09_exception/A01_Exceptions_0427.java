/*
 # ����
 1) ��ǥ
 	- ���ܰ� ���α׷����� �߻��ϴ� ��Ȳ�� ���ؼ�
 	  ó���� ���μ��� ������ �ȴ�.
 	- �ڹٿ��� ���ܸ� ó���ϴ� ���α׷��� �⺻ ������ �ȴ�.
 	- �������� ���ܸ� ó���ϴ� api�� ����� �˰� ������ �� �ȴ�.
 	- ����� ���� ���� Ŭ������ �����ϰ� Ȱ���� �� �ȴ�.
 
 # ���ܶ�?
 1) ��ǻ�� �ϵ���������� ������, �������� �������α׷� ������
 	�߻��ϴ� ���� �ڹٿ����� error��� �Ѵ�.
 
 2) JVM ���� ������ ����� ������ ���α׷��� �߰��ϰ� ������
 	������ �Ҵ��ϰ� �ȴ�.
 	
 3) �̷� ���α׷����� �����ڴ� ��ó�� ����� ����.	
 
 4) �ڹٿ��� error �̿ܿ� ����(Exception)��� �θ��� ������ �ִ�.
 	���ܶ� ������� �߸��� ���� �Ǵ� ������ �ڵ� ������ �߻��ϴ�
 	���α׷� ������ ���Ѵ�. ���� �̷� ������ �߻��ϸ� ���α׷��� ����ȴ�.
 	�ڹٿ����� ����ó��(Exception)�� ���α׷��� �������� �ʰ�
 	���� ���°� �����ǵ��� �Ѵ�.
 	
 5) ����
 	- �Ϲ� ���� : ������ üũ ����
 	- ���� ���� : ������ �� ���� ó��
 
 #
 ClassNotFoundException(�Ϲ� ���� : �����Ͻ� �߻�)	---->
 InterruptedException(�Ϲ� ���� : �����Ͻ� �߻�)	---->	java.lange.Exception
 RuntimeException(����� �߻� ����)					---->
 
 NullPointerException(������, ���� ���� ���� ���)	---->
 NumberFormatException(������ ��ȯ���� ����)		---->	RuntimeException
 
 # ���� ���ܵ�
 1) ������ �� �߻��ϴ� ���� �ƴϱ⿡ ������ �����̳�
 	������ �׽�Ʈ �ڵ�� ����ó���� �ؾ� �ϴ� ���� ���Ѵ�.
 
 2) NullPointerException
 	- ��ü ������ ���� ����. null���� ���� ���� ������
 	  ���� ������(.)�� ����ؼ� ����� ȣ������ �� �߻��ϴ� ����
 
 3)	ArrayIndexOutOfBoundsException
  	- �迭���� �ε����� ������ �ʰ��ؼ� ������� �� �߻��ϴ� ����
  
 4) NumberFormatException
 	- ���ڿ��� ���ڷ� ��ȯ�ϴ� ��� ������ ���ڿ��� �ϴµ� �׷��� ���� ��
 	  ó���ϴ� ��ü �޼ҵ忡�� ���� �߻�. 
 	- Integer.parseInt("������ ���ڿ�") -> ������ȯ
 	- Integer.parseDouble("�Ǽ��� ���ڿ�") -> �Ǽ���ȯ
 	- ������ ���ڿ��̳� �Ǽ��� ���ڿ��� �ƴ� ���, 
 	  ex) "1", "2", "3.4"�� �ƴϰ� "a1, "a2", "b3.4"�� �� ������ ���� �߻� 
*/
package a09_exception;

public class A01_Exceptions_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		�����Ͱ� �Էµ��� �ʾ��� �� ����.		
		String data=null;
//		null ��Ȳ���� (.)�� Ȱ���ؼ� �ش� ����� ȣ��� �߻�.
//		System.out.println(data.length());
		// NullPointerException
//		���� �߻��� jvm���� �����ϴ� ���� ������ Ȯ�� �� 
//		�� ������ �����ؼ� ���� ó���ϸ� �ȴ�.		
		
//		String data2 = args[0];
//		String data3 = args[1];
//		System.out.println(data2);
		// ArrayIndexOutOfBoundsException
// 		�迭�� �����Ͱ� ���µ�, index������ �Ѿ ȣ��Ǿ��� ��,
// 		�߻��ϴ� ���� 
		String data4 = "100";
		String data5 = "a100";
		int num01 = Integer.parseInt(data4);
		int num02 = Integer.parseInt(data5);
		System.out.println(data4);
		System.out.println(num01);
		System.out.println(data5);
		System.out.println(num02);
		// NumberFormatException
		
		
	}

}
					