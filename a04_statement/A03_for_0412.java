/*
 # for��(�ݺ���)
 - �ݺ�ó������ Ư���� ������ �ʿ�� �ϰ� ����ó���� �� �� ���� ���� Ȱ��Ǵ� ��.
 - for( �ʱⰪ; �ݺ��� ����; �Ѱ�(������ );{
 		�ݺ��� ����(������ ����-�ʱⰪ Ȱ��)
   }
 - �ʱⰪ : int count=1; int idx=0; cnt=100;
 - �ݺ��� ���� : count < 100(����);, cnt > 0(����);, idx < �迭.length;
 - ������ : count++, cnt--, count+=2, cnt-=5 
 
  # �迭�� ȿ�������� Ȱ��Ǵ� for�� 2��° ����
  - �Ϲ� primitive data �迭, ��ü �迭
  
  - String 
  names={"ȣ����", "�޽�", "���"};
  names[0] : "ȣ����"��� �����Ͱ� ���ִ� ���� ��ü		-- String name=names[0];
  for( ���� ��ü ���� : �迭��ü ){
  		�迭�� ������ü�� Ȱ���ؼ� ó�� ����
  }
  ex) for(String name : names){
  			System.out.println("�̸�"+name);
  	  }
*/
package a04_statement;

public class A03_for_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 15~50���� ���.
		for(int count=15; count<=50; count++){
			System.out.println("��ȣ : "+count);
		}
		
		// 5�� ������ tab �� �ٹٲ� ó��
		for(int count=15; count<=50; count++){
			System.out.print(count);
			// print �ٹٲ� ����
			if(count%5==0){
				System.out.println();
				// ��ȣ 5�� ���� �������� 0�̸� �ٹٲ�
			}else{
				System.out.print("\t");
				// �׷��� ������ ��ȣ�� tab����
			}
		}
		// 1~100���� �����͸� �ջ��ϼ���
		int sum=0;
		for(int cnt=1; cnt<=100; cnt++){
			System.out.print(cnt);
			if(cnt!=100){
				System.out.print(" + ");
			}
			if(cnt%10==0){
				System.out.println();
			}
			sum+=cnt;
			// ������ ����ó��
			
		}
		System.out.println("= "+sum);
		
		/* �迭 ó�� */
		String[] foods={"���", "¥���", "��ġ�"};
		// �迭 ���� ������Ÿ��[] ������ = {������1, ������2, ������3,...}
		for(int idx=0; idx<foods.length; idx++){
		// �迭��.length : �迭�� ũ�� = index��������ȣ+1	
			System.out.println((idx+1)+"��° ���� : "+foods[idx]);
		}
		
		// for(��������/��ü : �迭��ü){ �ش� �迭��ü�� ���� ������ ���� ������ ��ü �Ҵ�}
		String[] names={"ȣ����", "�޽�", "���"};
		for(String name : names){
			System.out.println("�̸� "+name);
		}
	}

}

