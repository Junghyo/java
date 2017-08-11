/*
 # ��ü ����( Clone() )
 1) ���� ��ü�� �ʵ尪�� ���ϰ��� ������ ���ο�
    ��ü�� �����ϴ� ���� ���Ѵ�.
    ex) Person p1 = new Person();
    	Person p2 = p1;
    	p2.setName("ȣ����");	<----p1�� ������ ��ħ
 
 2) ���� ��ü�� �ʵ尪�� ��ȣ�ϰ��� �� �� Ȱ��
 
 3) �⺻ ����
    try{
    	Object obj=clone();
    }catch(CloneNotSupportedException e){}
*/
package a10_api;
// ������ �� �ִ� �������̽��� �߰�.
class Friend implements Cloneable{
	private String name;

	public Friend(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public Friend getFriend(){
		Friend cloned=null;
//		������ ��쿡�� �ʼ��� ����ó���� �ʿ�.
		try {
			cloned=(Friend)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
	
	
}
public class A03_clone_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f1 = new Friend("4��Ÿ��");
		Friend f2 = f1;
		System.out.println("f1�� �̸�: "+f1.getName());
		f2.setName("�¿� ���̽�");
		System.out.println("f2�� �̸�: "+f2.getName());
		System.out.println("f1�� �̸�: "+f1.getName());
//		������ ���ο� Friend ��ü ����		
		Friend f3=f1.getFriend();
		f3.setName("�������");
		System.out.println("f3�� �̸�: "+f3.getName());
		System.out.println("f1�� �̸�: "+f1.getName());

	}

}
