/*
 # ���� �Է°�
  �޼��峪 �����ڸ� ���ؼ� ���� ������ Ÿ����
  �Է°��� ������ �������� �ʰ� ���� ���� �Էµ� �� ���� ��
  �������ڷ� ����� �� �ְ� �Ѵ�.
  
  ���� : [return Type] �޼����(������type,....�Էº���);
  	- �Էº����� �迭(�Էº���.length)for���� Ȱ���ؼ� �Է°���
  	  �޾Ƶ��δ�.
  	- ȣ���ϴ� ��( main(), �ٸ� Ŭ������ �޼���..)
  	 	* ��������.�������ڸ޼���(������1);
  	 	* ��������.�������ڸ޼���(������1, ������2);
  	 	* ��������.�������ڸ޼���(������1, ������2, ������3);
*/
package a06_object;

class GoMountain{
//  String...names ���� �Է°� ����
//  ȣ���ϴ� ������ �������� �Է°��� 
//	���������� �Է��� �����ϵ��� ó��
	public void callName(String...names){
		// names�� �迭
		for(String name:names){
			// �θ��̸�
			System.out.println(name+" ¯¯��~~~");
		}
	}
}

public class A16_variableMethod_0421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoMountain m1 = new GoMountain();
		System.out.println("�꿡���� �� �θ���.");
		m1.callName("ȫ�浿!");
		System.out.println("�꿡���� �� �θ���.");
		m1.callName("ȫ�浿!", "ȣ����!");
		System.out.println("�꿡���� �� �θ���.");
		m1.callName("ȫ�浿!", "�޽�!", "���!", "���̸���!");

	}

}

