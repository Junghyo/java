/*
 # ����ó�� �ڵ�
 try{
 	1. ���ܰ� �߻��Ҹ��� �ڵ�
 	2. ���ܰ� �߻��Ҹ��� �ڵ� <--- ���⼭ ���ܹ߻���, catch �ʿ� ���ǵ� ����Ŭ������ ����
 	ex) String name=null;
 		System.out.println(name.length());
 		NullpointException �߻�. �� ��ü�� catch�� ����.
 	3. ���ܰ� �߻��Ҹ��� �ڵ� <--- 2�� �ڵ�(��������)���� ���ܹ߻��ϸ� 3, 4���� ������� ����
 	4. ���ܰ� �߻��Ҹ��� �ڵ�
 }catch(����Ŭ���� ����){
 	NullpointException �̻��� ����Ŭ������ ���ǵǾ� �ִ�.
 }
*/
package a09_exception;

public class A02_basic_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
//		���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�			
			System.out.println("���ܰ� �߻��Ҹ��� �ڵ� 1");
			System.out.println("���ܰ� �߻��Ҹ��� �ڵ� 2");
			String name="ȫ�浿";
			System.out.println(name.toString());
//			throw ���� ��ü NullPointerException()			
			System.out.println("���ܰ� �߻��Ҹ��� �ڵ� 3");
			System.out.println("���ܰ� �߻��Ҹ��� �ڵ� 4");
			System.out.println("���ܰ� �߻��Ҹ��� �ڵ� 5");
			System.out.println("���ܰ� �߻��Ҹ��� �ڵ� 6");
		}catch(NullPointerException e){
//		���ܰ� �߻����� �� ó���� �ڵ�
//		NullPointerExceptionŬ���� �̻��� ����Ŭ���� ����			
			System.out.println("���� �߻�. ~~~�� ó���Ѵ�.");
		}
		System.out.println("���α׷� ���� ����.");

	}

}

