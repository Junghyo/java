/*
 java������ ���α׷��ֻ� ��/�ܺ��� ������ ���� ó���� �ϰ� �ִ�.
 �Ϲ������� �����Ͱ� input, output�� �Ͼ�� ������ �ݵ�� ����ó���� �ؾ� �Ѵ�.
 ���� ���� �������� �ִ� code
 try{
 	���� ���� �������� �ִ� code
 }catch(Exception e){
 	���� �߻��� ó���� ����
  
*/
package a00_basic;

public class A08_Exception_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("���α׷� START!");
			int num = 3/0;
			// ���ܰ� �߻��ϸ� �ϴ��� ������ �������� �ʰ�
			System.out.println("���α׷� END!");
		}catch(Exception e){
			// ���ܰ� �߻��ϸ� catch��(Exception)���� Jump�Ͽ� ó���� ��.
			System.out.println("���� �߻�!");
			System.out.println("���ܳ��� : "+e.getMessage());
		}finally{
			System.out.println("���� ��� ���� ó���� ����!");
		}

	}

}
