/*
 # java.util.��Ű��
 - Arrays : �迭�� ����(��, ����, ����, ã��)
 - Calender : �ü���� ��¥�� �ð�
 - Date : ��¥�� �ð� ������ ����
 - Objects : ��ü��, null ���� �� ������ ��
 - StringTokenizer : Ư�� ���ڷ� ���е� ���ڿ�
 - Random : ������ ���� �� ���
 
 # ��ü �ؽ��ڵ�(hashCode())
 1) ��ü�� �ĺ��� �ϳ��� ������
 	- hashCode(): ��ü�� �޸𸮹����� �̿��ؼ� �ؽ��ڵ带 ����
 	
 2) ��ü�� �ĺ� ���μ���
 	- hashCode() -> equals() ���ϰ� -> ���� ��ü�ν�
*/

/*
 # equals : ��ü�� �ּҰ� �ٸ����� ���� �����͸� ������
 			���� type�� ���� ������ boolean���� true�� ó���Ѵ�. 
*/
package a10_api;

class Woman{
	private String name;

	public Woman(String name) {
		this.name = name;
	}
	
}

public class A02_equals_hashcode_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name01 = "ȣ����";
		String name02 = new String("ȣ����");
		String name03 = new String("ȣ����");
		System.out.println("�ּ� Ȯ��: "+(name01==name02));
		System.out.println("�ּ� Ȯ��: "+(name01==name03));
		System.out.println("�ּ� Ȯ��: "+(name02==name03));
/*
 		# equals : ��ü�� �ּҰ� �ٸ����� ���� �����͸� ������
		 			���� type�� ���� ������ boolean���� true�� ó���Ѵ�. 
*/		
//		���� class�� ����ϰ� �����͵� ���⿡
		System.out.println("������Ȯ��: "+name01.equals(name02));
		System.out.println("������Ȯ��: "+name01.equals(name03));
		System.out.println("������Ȯ��: "+name02.equals(name03));
	
//		hashcode() : ��ü�� �ĺ��� �� �ִ� �������� ����
		Woman w01 = new Woman("����");
		Woman w02 = new Woman("����");
		String w03 = "����";
		String w04 = "����";
		System.out.println("w01�� hashCode: "+w01.hashCode());
		System.out.println("w02�� hashCode: "+w02.hashCode());
		System.out.println("w03�� hashCode: "+w03.hashCode());
		System.out.println("w04�� hashCode: "+w04.hashCode());
		
//		toString() : ��ü���� ���� 'Ŭ������@16�����ؽ��ڵ�
		System.out.println("w01�� ��ü����"+w01.toString());
		System.out.println("w02�� ��ü����"+w02.toString());
		System.out.println("w03�� ��ü����"+w03.toString());
		System.out.println("w04�� ��ü����"+w04.toString());
	}

}

