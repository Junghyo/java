/*
 # Statement�� ����
 - �ڹ� �ҽ��ڵ�� Ȱ��Ǵ� ���� statement(��)��� �ϴµ� ���� ������ �������� �з��� �� �ִ�.
	 
		 					������
		 		���๮					�б⹮(����), �ݺ���
		 					���
 ��(Stamement)
	 			
	 			����๮	�ּ�

 # ���๮
 ex) int num01=25; 	������type ������ = �Ҵ絥����;
 
 # ���ǹ�
  - if else
  ex) if( ���� boolean ){
  		true�� ��� ó���� ����
  	  }else{
  	  	false�� ��� ó���� ����
  	  }
  
 */
package a04_statement;

public class A01_ifelse_04112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� �� ���. 0~2
		int gameIdx = (int)(Math.random()*3);
		// (int)casting
		if(gameIdx==0){
			System.out.println("����");
		}else if(gameIdx==1){
			System.out.println("����");
		}else{
			System.out.println("��");
		}
	}

}
