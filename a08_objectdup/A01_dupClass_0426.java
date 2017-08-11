/*
 ���� Ŭ���� ���踦 ���ؼ� ���α׷��� ó���ϴµ� Ŭ���� ���ο� Ŭ������ �����ϴ�
 # ��ø �������̽� ����
 public class View{
 	public interface OnClickListener{
 		public void onClick(View v); 		
 	}
 }
 
 # ��ø Ŭ���� ����
 1) ��� Ŭ����( �ܺ�$����.class )
  - �ν��Ͻ� ��� Ŭ���� : �ܺΰ�ü�� �����ؾ߸� ����� �� �ִ� ���� ��øŬ����
  class �ܺ�{ class ����{} }
  
  - ����(static)��� Ŭ���� : �ܺ�Ŭ������ �ٷ� ������ �� �ִ� ���� ��øŬ����
  class �ܺ�{ static class ����{} }
 
 2) ���� Ŭ���� : �޼��尡 ������ ���� ����� �� �ִ� ��øŬ����( �ܺ�$1����.class ) 
 	- class �ܺ�{
 	  	void �޼���(){
 	  		class ���η���Ŭ����{}
 	  	}
 	  }
 
 # ��� Ŭ����
 1. �ν��Ͻ���� Ŭ������ ������� Ŭ������ ������
 	  1) �ܺΰ�ü ���� ���� ����
 	  2) static ����� ���𰡴� ����
 	  		- �ν��Ͻ� ��� Ŭ���� ���ο����� X
 	  		- ����(static) ��� Ŭ���� ���ο����� O
*/
package a08_objectdup;



// �ν��Ͻ� ��� Ŭ���� : �ܺΰ�ü�� ������ ����Ŭ���� ��� ����
class InstOuter{
// �ν��Ͻ� ��� Ŭ���� InstOuter.InstInnerMember
	 
	class InstInnerMember{
//		�ν��Ͻ� �ʵ�		
		String name="ȣ����";
//		�ν��Ͻ� �޼���		
		void callName(){
			System.out.println("ȣ����");
		}
//		static int num=1;	�����߻�. ��� �Ұ�
	}
}
// ���� ��� Ŭ����
// ���ο� static ��� Ŭ������ ����� ���� ���Ѵ�.
class InstOuter2{
//	����(static) ��� Ŭ����
	static class StaticMemberClass{
		String name="����(static)��� Ŭ����";
		void CallName(){
			System.out.println(name+"�� ȣ��˴ϴ�.");
		}
//		static ��� ��� ����		
		static int num=1;		
	}
}
public class A01_dupClass_0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		�ܺ�Ŭ���� ��ü�� �������� �ʰ� ����Ŭ������ ���� �����ϸ� ���� �߻�		
//		InstInnerMember i1 = new InstInnerMember();

//		�ܺ�Ŭ�������� �ν��Ͻ���� Ŭ������ ���� Ŭ������  ȣ���Ϸ��� 
//		1) ���� �ܺΰ�ü ����		
		InstOuter o1 = new InstOuter();
//		2) ���ΰ�ü -> �ܺ�Ŭ������.����Ŭ������ �������� = �ܺΰ�ü����.new ����Ŭ������();
//		3) InstOuter$InstInnerMember.class Ŭ���������� ����.
		InstOuter.InstInnerMember i1 = o1.new InstInnerMember();
		System.out.println("���� Ŭ���� �̸�: "+i1.name);
		i1.callName();
		
//		������� Ŭ������ 
//		�ܺ�Ŭ���� ��ü�� ������ �ʿ� ����		
//		1) �ܺ�Ŭ������.����Ŭ������ �������� = new �ܺ�Ŭ������.����Ŭ������();
		InstOuter2.StaticMemberClass s1 = new InstOuter2.StaticMemberClass();
		s1.CallName();
	}

}
/*
 # URL(Uniform Resource Locator)
 1) ����
 	- [��������]://[ȣ��Ʈ][��Ʈ][���][���ϸ�][.Ȯ����][�������ڿ�]
 	ex) https://www.google.co.kr/search?q=jsp&oq=jsp&aqs=chrome..69i57j0l5.2494j0j7&sourceid=chrome&ie=UTF-8
 		- �������� : http
 		- ȣ��Ʈ : www.google.co.kr
 		- ��Ʈ : 80(http ���������� �⺻ ��Ʈ)
 		- ��� : /search
 		- �������ڿ� : q=jsp&oq=jsp&aqs=
 2) URL�� �����ø����̼ǿ� ��û�� �����ϱ� ���� �뵵�� ���	
 
 # ������ JSP
 1. �ڹٸ� ���� Sun���� ���� �� ���� ǥ��
 	- ����(Servlet) : ���� �ڵ� ����� Ư¡
 	- JSP(JavaServer Page)
 		
*/

			 