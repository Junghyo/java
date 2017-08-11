/*
 # Writer
 1) 문자 기반 출력 스트림의 최상위 클래스
 
 2) 하위 클래스 : Writer 클래스를 상속
 	- FileWriter, BufferedWriter, PrintWriter, OutputStreamWriter
 
 3) 주요 메서드
 	- write(int c) : 스트림으로 한 문자를 보내는 처리
 	- write(char[] cArray) : 스트림으로 문자 배열을 보내는 처리
 	- write(char[] cArray, int off, int len) : 스트림으로 문자 배열 부분을 추출해서 보내는 처리
 	- write(String str) : 문자열을 보내는 처리
 	- flush() : 버퍼에 잔류하는 모든 문자열 출력
 	- close() : 사용한 시스템 자원을 반납, 출력 스트림 닫기
*/
package a13_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class A07_Writer_0517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fold = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/";		
		String file = fold+"test03.txt";
		Writer writer = null;
		try {
//			Writer를 통해서 File에 쓰는 처리 -> FileWriter
//			new FileWriter() IO 발생으로 예외처리 필수	
			writer = new FileWriter(file);
			char[] data = "RONALDO".toCharArray();
			for(char d : data){
				writer.write(d);
			}
			writer.write("\nHELLO MAN!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
//				writer : 문자열 출력 스트림은 내부에 작은 버퍼가 있어서 데이터가 출력되기 전에
//				버퍼에 쌍혔다가 순서대로 출력한다. 자원 해제시, 버퍼에 잔류하고 있는 데이터를 모두
//				출력시키고 자원해제 하는 것이 일반적이다.
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
