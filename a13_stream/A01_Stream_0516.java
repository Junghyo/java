/*
 # JSP
 1) 기본객체
 2) 페이지 모듈화<jsp:include><jsp:forward>
 3) 에러처리
 4) 자바 빈즈
 3) 쿠키/세션
 4) EL/JSTL
 5) MVC 모델2
*/

/*
  # 생각해봅시다.
  1. Stream으로 어떤 데이터들이 전송될 수 있을까?  - binary data
  2. 다양한 데이터를 전송할 때 필요한 기능들은 어떤 것이 있을까?  - Buffer
  - data 단위별 숫자, 문자, image, 동영상
  - 한 자, 한 라인, 한번에 담을 수 있는 buffer 용량지정
  - 로컬(내부 pc), 네트워크
  3. Exception은 필요한가? 	- 자바에서는 필수
*/

/*
 # IO 패키지
 1) 프로그램에서 데이터를 외부에 읽고 다시 외부로 출력하는 작업이 일어난다.
 
 2) 데이터 입력
 	- 사용자 키보드 입력
 	- 파일 또는 네트워크를 통해서 입력
 
 3) 데이터 출력
 	- 모니터/프린터를 통해 출력
 	- 파일 출력, 네트워크 출력 및 전송
 
 4) Stream : 자바에서 데이터를 입출력 해주는 객체
 	- 단일 방향으로 연속적으로 흘러가는 것을 말함.
 	
 	
  ┌────출발지 ────┐----입력스트림---->프로그램 ----출력스트림----> ┌───도착지───┐
  │ -키보드		 │											    │-모니터         │
  │ -파일	     │											    │-파일             │
  │ -프로그램        │										        │-프로그램      │
  └──────────────┘ 											    └────────────┘

 			      패키지명											내용
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ 			      
                 File						: 파일 시스템(파일, 폴더)의 정보를 얻기 위한 클래스
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                Console 					: 콘솔로부터 문자를 입출력하기 위한 클래스
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
       InputStream/OutputStream			 	: 바이트 단위를 입출력하기 위한 최상위 클래스
 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
 FileInputStream/FileOutputStream
 DataInputStream/DataOutputStream			: 바이트 단위를 입출력하기 위한 하위 스트림 클래스
 ObjectInputStream/ObjectOutputStream
 BufferedInputStream/BufferedOutputStream
 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
              Reader/Writer					: 문자 단위 입출력을 위한 최상위 스트림 
 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━          
 FileReader/FileWriter
 InputStreamReader/InputStreamWriter		: 문자 단위 입출력을 위한 하위 스트림 클래스
 PrintWriter
 BufferReader/BufferedWriter           
 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━          
 
 # 자바의 기본적인 데이터 입출력(IO)
 자바의 기본적인 입출력 API는 java.io 패키지를 통해서 제공하고 있다.
 - File클래스 : 파일시스템의 정보
 - 데이터를 입출력하기 위한 다양한 입출력 스트림 클래스
 

*/
package a13_stream;

import java.io.IOException;
import java.io.InputStream;

public class A01_Stream_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		키보드 입력
//		입력의 최상위 Stream : InputStream		
		InputStream is=null;

//		키보드 입력 : System.in.read()로 처리
//		System.in : InputStream의 실체 객체
		is = System.in;
		
//		read()라는 메서드를 통해 문자 한자를 입력 받을 수 있다.
//		기본적으로 int, char로 전환(casting)하면 문자를 받을 수 있다.
//		io(input/output)이 발생하면 예외처리(Exception)을 해준다.		
		try {
			int n=0;
			do{
				n=is.read();
				System.in.read();
				System.in.read();
				System.out.println("아스키코드:"+n+"\n문자로 변환: "+(char)n);
			}while(n!='Q');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
