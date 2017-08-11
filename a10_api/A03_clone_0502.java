/*
 # 객체 복제( Clone() )
 1) 원본 객체의 필드값과 동일값을 가지는 새로운
    객체를 생성하는 것을 말한다.
    ex) Person p1 = new Person();
    	Person p2 = p1;
    	p2.setName("호날두");	<----p1에 영향을 미침
 
 2) 원본 객체의 필드값을 보호하고자 할 때 활용
 
 3) 기본 구조
    try{
    	Object obj=clone();
    }catch(CloneNotSupportedException e){}
*/
package a10_api;
// 복제할 수 있는 인터페이스를 추가.
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
//		복제할 경우에는 필수로 예외처리가 필요.
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
		Friend f1 = new Friend("4번타자");
		Friend f2 = f1;
		System.out.println("f1의 이름: "+f1.getName());
		f2.setName("좌완 에이스");
		System.out.println("f2의 이름: "+f2.getName());
		System.out.println("f1의 이름: "+f1.getName());
//		복제된 새로운 Friend 객체 생성		
		Friend f3=f1.getFriend();
		f3.setName("수비요정");
		System.out.println("f3의 이름: "+f3.getName());
		System.out.println("f1의 이름: "+f1.getName());

	}

}
