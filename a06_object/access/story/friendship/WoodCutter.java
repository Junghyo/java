package a06_object.access.story.friendship;

public class WoodCutter {
//	public WoodCutter(){}
//	default �����ڴ� ������� ������ �޸𸮿� �ڵ����� ����Ǿ� �ִ�.
	String casheDeer="���Ӵ��ҹ�";
	
//  private�� ����Ŭ������ � �ܺ� Ŭ������ ������ �Ұ����ϰ� ó��.	
	private String cacheClothe="�޵��� ������";
	
	void searchClothe(){
//  ���� �ʵ��̰� ������ ������	
		System.out.println("���� �ִ� ���� "+cacheClothe);
	}
	public String weddingAnnounce="���Ѱ� ���� �尡����.";
// 	���� �����ڰ� public���� ����� ���� ��Ű���� �ٸ����� ��� ��ü���� ���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
/* javaexp.a06_object.access�� company ��Ű�� ����
	manager(�ѹ���) package ����
		1) class headManger(����)
			- ��������(��������) - private
		2) class ChiefMember(����)
			- �ѹ��α�ȹ��(��Ű�� �������� ����Ȯ��)
			- �������� Ȯ��
		3) class StaffMember(���)
			- �尡 - �������� ����
			- ��������Ȯ��
			
	personnel(�λ��) package ����
		1) ChiefMember(����) - �ش� ���������ڿ� ���� ���� ���θ� Ȯ��
*/