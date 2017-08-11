/*
 # ��ü �Ҹ���
 - �������� �ʴ� �迭�̳� ��ü�� ������ ������(Garbage Collector)��
   ���������� �ڵ������� �Ҹ��Ų��.
 - ������ �ݷ��ʹ� ��ü �Ҹ������� ��ü �Ҹ���( finalize() )�� ������� �Ҹ�ó��
 - Ŭ���� ���� = new ��ü();
 - ���� = null;  ---> ��ü�� �������� ����
 - ��������� ������ �ݷ��� ���� ��û
 	System.gc(); ---> �Ҹ��Ű�� ������ console Ȯ��
*/

package a10_api;

class Counter{
	private int cnt;

	public Counter(int cnt) {
		this.cnt = cnt;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(cnt+"�� ��ü�� �Ҹ��� finalized()�� ȣ���.");
	}
	
}

public class A04_finalized_gabageCollector_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter count=null;
		for(int cnt=1; cnt<=10; cnt++){
//			��ü ����			
			count = new Counter(cnt);
//			�������� ����
			count=null;
//			������ �ݷ��� ���� ��û
//			��ü�� finalize()�� ȣ���
			System.gc();
		}

	}

}
/*
 # System Ŭ����
 1) �ڹ����α׷��� JVM ������ ����ȴ�.
 	�ü���� ��� ����� �ڹ� �ڵ�� ���� ���������� �� �Ѵ�.
 
 2) ���α׷� ����, Ű���� �Է�, ����� ���, �޸� ����, ���� �ð��б�,
 	�ý��� ������Ƽ�б�, ȯ�� ���� �б� ������ ������ �κ����� �����ϴ�.
 	- System.exit(5) : JVM ���� ��û.  0�� ��������, �׿ܴ� ����������
 	- System.gc() : ������ �ݷ��� ����
 	- System.currentTimeMillis() : ����ð� 1/1000��
 	
*/