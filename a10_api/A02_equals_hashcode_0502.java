/*
 # java.util.패키지
 - Arrays : 배열을 조작(비교, 복사, 정렬, 찾기)
 - Calender : 운영체제의 날짜와 시간
 - Date : 날짜와 시간 정보를 저장
 - Objects : 객체비교, null 여부 등 조사할 때
 - StringTokenizer : 특정 문자로 구분된 문자열
 - Random : 난수를 얻을 때 사용
 
 # 객체 해시코드(hashCode())
 1) 객체를 식별할 하나의 정수값
 	- hashCode(): 객체의 메모리번지를 이용해서 해시코드를 만듬
 	
 2) 객체를 식별 프로세스
 	- hashCode() -> equals() 리턴값 -> 동일 객체인식
*/

/*
 # equals : 객체의 주소가 다르더라도 같은 데이터를 가지고
 			같은 type을 쓰고 있으면 boolean값을 true로 처리한다. 
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
		String name01 = "호날두";
		String name02 = new String("호날두");
		String name03 = new String("호날두");
		System.out.println("주소 확인: "+(name01==name02));
		System.out.println("주소 확인: "+(name01==name03));
		System.out.println("주소 확인: "+(name02==name03));
/*
 		# equals : 객체의 주소가 다르더라도 같은 데이터를 가지고
		 			같은 type을 쓰고 있으면 boolean값을 true로 처리한다. 
*/		
//		같은 class를 사용하고 데이터도 같기에
		System.out.println("데이터확인: "+name01.equals(name02));
		System.out.println("데이터확인: "+name01.equals(name03));
		System.out.println("데이터확인: "+name02.equals(name03));
	
//		hashcode() : 객체를 식별할 수 있는 정수값을 가짐
		Woman w01 = new Woman("설현");
		Woman w02 = new Woman("설현");
		String w03 = "설현";
		String w04 = "설현";
		System.out.println("w01의 hashCode: "+w01.hashCode());
		System.out.println("w02의 hashCode: "+w02.hashCode());
		System.out.println("w03의 hashCode: "+w03.hashCode());
		System.out.println("w04의 hashCode: "+w04.hashCode());
		
//		toString() : 객체문자 정보 '클래스명@16진수해시코드
		System.out.println("w01의 객체정보"+w01.toString());
		System.out.println("w02의 객체정보"+w02.toString());
		System.out.println("w03의 객체정보"+w03.toString());
		System.out.println("w04의 객체정보"+w04.toString());
	}

}

