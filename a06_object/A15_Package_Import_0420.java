/*
 # 패키지(package)
 - 프로그래밍에서 여러 클래스를 관리 하기 위해 기능저긍로 영향을 미칠 수 있는 클래스끼리
   묶어놓고 접근 범위 안에 효과적으로 호출하기 위해서 사용하는 개념이다.
 
 - 패키지는 물리적인 파일 시스템 기능이상으로 기능적 처리의 밀접성으로 접근범위를
   설정하는 개념과 종송관계에 있어서 상위폴더개념을 추가하여 최상위 package.하위패키지가
   동일해야 같은 package로 인식한다.
   상위package.하위package   (상위package명만 같은 것으로는 같은 package라고 할 수 없다.)
  
 # 패키지 선언과 활용
 1) 패키지는 클래스명 위 최상에 위치한다.
 - package 상위패키지.하위패키지
 - public class 클래스명(){}
 
 2) 명명 규칙
 - 숫자(X), _$(제외 특수문자)도 사용안됨
 - 모두 소문자로 작성하는 것이 naming 규칙
 - java로 시작하는 패키지는 자바 표준 api에 사용되므로 사용해서는 안된다.

 3) 같은 패키지끼리는 import라는 개념 없이 사용이 가능하며 
 	동일한 클래스를 정의할 수 없다.
 	
 # import문
 1) 같은 패키지를 사용하는 객체끼리는 특별한 키워드없이
    클래스(객체)를 호출해서 사용할 수 있다.
 	<Note.java>							<Pen.java>  
 - package com.util;				  package com.util;
 - public class Note(){}   			  public class Pen{
 										Note n = new Note();
 									  }
 2) 패키지가 다를 경우
 - 패키지명까지 포함해서 클래스 선언
 - package명 밑에 import.패키지명.사용할 클래스	
 	<Computer.java>
 package com.util.prog;
 public class Computer{
 	com.util.Note note01 = new com.util.Note();
 }
 또는
  	<Computer.java>
 package com.util.prog;
 import com.util.Note;
 public class Computer{
 	Note note01 = new Note();
 }			
 
*/	
package a06_object;

public class A15_Package_Import_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
