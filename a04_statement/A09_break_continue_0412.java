/*
 # breaK�� continue
 1. break
 -loop��, switch������ �ش� block({})�� �ߴ�ó���ؼ� ���������Բ� ó���ϴ� ���� ���Ѵ�.
 -���̻� �ش� block���� ���μ����� ó������ ����
 while(){
	 if(����)
	 break;	 
 }
 
 2. continue
 -loop������ ���ǿ� ���� continue�� ��Ÿ�� �� �ش� ���μ����� ���� loop������ �Ѿ�� ���� ���Ѵ�.
 -�ѹ� 5�� ���� ������� �ʰ� ���� 6������ �ٽ� ��� ó��
 for( int cnt=1; cnt<=10; cnt++){
	 if(cnt==5) continue;
	 System.out.println("�ѹ�:"+cnt);
 }
 */
package a04_statement;

public class A09_break_continue_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break
		for(int cnt=1; cnt<=10; cnt++){
			System.out.println("�����̰� ����� "+cnt+"�� �Ծ���.");
			if(cnt==5){
				System.out.println(cnt+"�� �Ծ����ϱ� �׸� �Ծ�");
				break;
				// �ش� ���μ��� ��ü�� �ߴܽ�Ű�� ��
			}
		}
		// continue
		for(int cnt=1; cnt<=10; cnt++){
			if(cnt==6){
				System.out.println(cnt+"��° ���� ���ߺ���");
				continue;
			}
			System.out.println("ȣ���� "+cnt+"��° ���� �Դ�!");
		}
		// 2. for���� �̿��Ͽ� 10~150���� ���� �߿� 5�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
		int sum=0;
		for(int i=10; i<=150; i++){
			if(i%5==0){
				sum+=i;
				System.out.println("+"+i+"="+sum);
			}
		}
		// while��, Math.random()�� �̿��Ͽ� �ֻ��� ���� �ΰ��� ������ �ϰ� �ֻ��� ���� 5�� �ƴϸ� ���, ���� 5�� �ߴ� ó���ǰ� �ϼ���.
		int dice01 = (int)Math.random()*6+1;
		int dice02 = (int)Math.random()*6+1;

	}

}
/* Ȯ�ο���
 1. ���ǹ��� �ݺ����� ������ ��ȣ �ӿ� �־����.
 	1) ���ǹ�: (	), (	) 	-- if, switch
 	2) �ݺ���: (	), (	), (	)	-- for, while, do while
 
 2. for���� �̿��Ͽ� 10~150���� ���� �߿� 5�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
 
 3. while��, Math.random()�� �̿��Ͽ� �ֻ��� ���� �ΰ��� ������ �ϰ� �ֻ��� ���� 5�� �ƴϸ� ���, ���� 5�� �ߴ� ó���ǰ� �ϼ���.
 	1) ������� : @@@, @@@ �� @@@
 
 4. ���� for���� �̿��Ͽ� ������ 4x+5y=60�� ��� �ظ� ���ϼ���. x,y�� 10���� ����
 	1) ������� : x:@@, y:@@
*/
