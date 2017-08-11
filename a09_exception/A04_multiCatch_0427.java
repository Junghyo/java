/*
 # ���� catch
 1) ���ܴ� ���� �ٹ������� ���� ���ܸ� �߻��� �� ������
 	���� ���ܸ� �ϳ��� try{}catch(����1){}catch(����2){}
 	�������� ó���� �� �ִ�.
 2) ����
 	try{
 		�߻��Ҹ��� �ڵ�1
 		�߻��Ҹ��� �ڵ�1(����1�� ���)
 		�߻��Ҹ��� �ڵ�1(����2�� ���)
 		
 	}catch(����1 - ������Ŭ����){
 	
 	}catch(����2 - ���� �����̸� ����Ŭ����){
 	
 	}catch(����3 - ���������� ����Ŭ����){
 	
 	}catch(�ֻ��� ���� ���� Ŭ����){
 	
 	}
 
 # finally
 ���ܰ� �߻��ϴ� ��쳪 �߻����� �ʰ� ���������� ó���ϴ� ���,
 ��� �� ó���� ���μ����� ���α׷��� ���� ���� try catch�� ������ ������
 finally{} ������ ���Խ�Ų��.	
 ex)
 	��������� Ŭ���� ����
  	try{
		���� = ��������� ��ü ����
		����
 	}catch(����){
 	
 	}finally{
 		��������� ��ü �ڿ����� .close();
 	}
 	
*/

/*
 # ���� Ŭ�������� Ȱ��Ǵ� �޼���
 catch(����Ŭ���� ����){
 	����.�޼���();
 }
 e.getMessage() : ���ܸ� ������ �ִ� �޽����� ���ڿ��� return
 e.printStackTrace() : ������ �߻� ��θ� ���������� ���
*/
package a09_exception;

public class A04_multiCatch_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayIndexOutOfBoundsException, NumberFormatException 	
//		�� ���ܰ� �Բ� �߻��ϴ� ���� ó��
		try{
			String data01 = args[0];
			System.out.println(data01.toString());
			int num01 = Integer.parseInt(data01);
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println(aie.getMessage());
			aie.printStackTrace();
			System.out.println("args�� �ش� �ε����� ���� �Էµ��� �ʾҽ��ϴ�.");
		}catch(NumberFormatException nfe){
//			�������ø޼���			
			System.out.println("�޼��� : "+nfe.getMessage());
			System.out.println("������ ���ڿ��� �Է��ؾ� �մϴ�.");
//			���� ��� ����			
			nfe.printStackTrace();
//		XXXXException�� ���� Exception Ŭ����					
		}catch(Exception e){
			System.out.println("��Ÿ ���� �߻�");
		}finally{
			System.out.println("���ܰ� �ְų� ���������� ó���ǵ� �����ϴ� ���μ��� ����");
		}

	}

}

