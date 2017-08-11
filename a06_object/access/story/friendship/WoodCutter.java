package a06_object.access.story.friendship;

public class WoodCutter {
//	public WoodCutter(){}
//	default 생성자는 선언되지 않으면 메모리에 자동으로 선언되어 있다.
	String casheDeer="숲속덤불밑";
	
//  private는 내부클래스외 어떤 외부 클래스도 접근이 불가능하게 처리.	
	private String cacheClothe="뒷동산 바위밑";
	
	void searchClothe(){
//  내부 필드이게 접근이 가능함	
		System.out.println("옷이 있는 곳은 "+cacheClothe);
	}
	public String weddingAnnounce="노총각 드디어 장가가다.";
// 	접근 제어자가 public으로 선언된 것은 패키지가 다르더라도 모든 객체에서 접근 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
/* javaexp.a06_object.access에 company 패키지 생성
	manager(총무부) package 생성
		1) class headManger(부장)
			- 가족생일(개인정보) - private
		2) class ChiefMember(과장)
			- 총무부기획서(패키지 내에서만 정보확인)
			- 부장정보 확인
		3) class StaffMember(사원)
			- 장가 - 공지사항 정보
			- 과장정보확인
			
	personnel(인사부) package 생성
		1) ChiefMember(과장) - 해당 접근제어자에 따라 접근 여부를 확인
*/