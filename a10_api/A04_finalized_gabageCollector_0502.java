/*
 # 객체 소멸자
 - 참조하지 않는 배열이나 객체는 쓰레기 수집기(Garbage Collector)가
   힙영역에서 자동적으로 소멸시킨다.
 - 가비지 콜렉터는 객체 소멸직전에 객체 소멸자( finalize() )를 실행시켜 소멸처리
 - 클래스 참조 = new 객체();
 - 참조 = null;  ---> 객체를 가비지로 만듬
 - 명시적으로 가비지 콜렉터 실행 요청
 	System.gc(); ---> 소멸시키는 내용을 console 확인
*/

package a10_api;

class Counter{
	private int cnt;

	public Counter(int cnt) {
		this.cnt = cnt;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(cnt+"번 객체의 소멸자 finalized()가 호출됨.");
	}
	
}

public class A04_finalized_gabageCollector_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter count=null;
		for(int cnt=1; cnt<=10; cnt++){
//			객체 생성			
			count = new Counter(cnt);
//			가비지로 만듬
			count=null;
//			가비지 콜렉터 실행 요청
//			객체의 finalize()가 호출됨
			System.gc();
		}

	}

}
/*
 # System 클래스
 1) 자바프로그램은 JVM 위에서 실행된다.
 	운영체제의 모든 기능을 자바 코드로 직접 접근하지는 못 한다.
 
 2) 프로그램 종료, 키보드 입력, 모니터 출력, 메모리 정리, 현재 시간읽기,
 	시스템 프로퍼티읽기, 환경 변수 읽기 등으로 한정된 부븐으로 가능하다.
 	- System.exit(5) : JVM 종료 요청.  0은 정상종료, 그외는 비정상종료
 	- System.gc() : 가비지 콜렉터 실행
 	- System.currentTimeMillis() : 현재시간 1/1000초
 	
*/