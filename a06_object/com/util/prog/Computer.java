package a06_object.com.util.prog;

import a06_object.com.util.Pen;

public class Computer {
//		다른 package에 있는 클래스를 호출할 때..
//		1) package명.클래스명으로 선언해야 한다.
		a06_object.com.util.Note note01 = new a06_object.com.util.Note();
//		2) 사용하고자 하는 package명.클래스명 import하여 활용할 수 있다.
		Pen p = new Pen();
//		** 패키지끼리 접근이 가능할려면 class선언시에
//		@@@ class 클래스명
//		1) 같은 package일 경우 : @@@에 제어자가 없거나 public
//		2) 다른 package일 경우 : @@@에 public이 선언되어야 한다.
}
/* 확인예제
 package a06_object 패키지 하위에
 1) ourhome 패키지 생성
 - Father, Mother, Mine
 2) cousinhome 패키지 생성
 - Aunt, Uncle, Cousin  
 
 import를 사용하는 방법
 - Cousin 클래스에서 Mine 클래스 호출하기
 import 사용없이 호출하는 방법으로 객체 생성
 - Mine 클래스에서 Father클래스 호출하기
 - Mother 클래스에서 Aunt 클래스 호출하기
*/