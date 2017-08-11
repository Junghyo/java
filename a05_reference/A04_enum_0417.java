/*
 # ���� Ÿ��(enum)
 1. ������ �߿��� ��� ������ ���� ó���ϴ� ��� ���Ǵ� ����
 - ������ ��� ��~��
 
 2. ����
 	1) ��������. ������ enum�̸�.java ���ϻ���
 	2) public enum ����Ÿ���̸�{}
 	3) �������
 		- public enum ����Ÿ���̸�{�����1, �����2, �����3,....};
 	ex) public enum Week{Monday, Tuesday, Wednesday, Thursday,....., Sunday}	
 
 3. Ȱ�� : enum��ü ���� = enum��ü��.���
 	- Week week01 = Week.Sunday;
 	
*/
package a05_reference;

public class A04_enum_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week week01 = Week.MONDAY;
		Week today = Week.MONDAY;
		System.out.println("enum������ ���Ͽ��� : "+(week01==today));
		System.out.println(week01.valueOf("MONDAY"));

		/*
		 # enum�� ���� �޼���
		 - name() : ���� ��ü�� ���ڿ�
		 - ordinal() : ���� ��ü�� ����(0����)
		 - values() : ��� ���� ��ü���� �迭�� ����
		 - compareTo() : ���� ���̸� ������
		 - valueOf(����������) : ���ڿ� �ش��ϴ� ���Ű�ü.
		*/
		
		String name = today.name();
		System.out.println("name() ȣ�� : "+name);
		// name() : �ش� ���ڿ��� �����´�
		
		today = Week.SUNDAY;
		int ordinal = today.ordinal();
		System.out.println("ordinal() ȣ�� : "+ordinal);
		// ordinal() : index���� �����´�. enum(Week)�� ������ ������� �����´�.
		
		System.out.println("valueOf : "+Week.valueOf("SATURDAY"));
		Week tomorrow = Week.valueOf("TUESDAY");
		System.out.println("valueOf : "+tomorrow.name());
		// valueOf("���ڿ��� ������ ��")
		
		Week[] days = Week.values();
		for(Week day : days){
			System.out.println(day);
		}
		// value() : ���� Ÿ���� ��� �����͸� �迭��ü�� ������
		
	}

}

/*
 # Ȯ�� �� ����
 1. ���� Ÿ�Կ� ���� ���� �� Ʋ�� ����?
 	1) ���� Ÿ���� �迭, ����, Ŭ����, �������̽��� �ִ�.
 	2) ���� Ÿ�� ������ �޸� ���� ��ġ�� �����̴�.
 	3) ���� Ÿ�Կ��� ==, != �����ڴ� ��ü ������ ���Ѵ�.
 	4) ���� Ÿ���� null������ �ʱ�ȭ�� �� ����.
 
 2. String Ÿ�Կ� ���� �������� Ʋ�� ���� �����ΰ�?
  	1) String�� Ŭ�����̹Ƿ� ���� Ÿ���̴�.
  	2) String�� Ÿ���� ���ڿ� �񱳴� ==�� ����ؾ� �Ѵ�.
  	3) ������ ���ڿ� ���ͷ��� �����ϴ� ������ ������ String��ü�� �����Ѵ�.
  	4) new String("���ڿ�")�� ���ڿ��� �����ϴ��� �ٸ� String ��ü�� �����Ѵ�.
  	
 3. �־��� �迭�� for���� �̿��ؼ� �ִ밪�� �����ϴ� ���α׷��� ����� ������
 	int max=0;
 	int[] dataList={1, 7, 3, 10, 6, 9};
 	for�� ó��
 	System.out.println("�ִ밪:"+max);
*/ 
