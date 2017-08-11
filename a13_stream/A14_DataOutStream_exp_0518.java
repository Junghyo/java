/*
 확인예제
 1단계 아래 데이터를 prodData.dat에 저장하고 호출
 물건명		가격		갯수
 @@@		@@@		@@
 
 2단계 Scanner 클래스를 활용하여 위와 같은 데이터를 입력하여 데이터 파일에 저장. 저장된 파일의 데이터를 불러서 리스트하는 처리
*/
package a13_stream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class A14_DataOutStream_exp_0518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/";
		String fname = "prodData.dat";
		File f01 = new File(dir+fname);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			if(!f01.exists()){
				f01.createNewFile();
			}else{
				fos = new FileOutputStream(f01);
				dos = new DataOutputStream(fos);
				dos.writeUTF("호날두");
				dos.writeInt(40);
				dos.writeShort(7);
				dos.writeUTF("메시");
				dos.writeInt(10);
				dos.writeShort(10);
				dos.writeUTF("즐라탄");
				dos.writeInt(30);
				dos.writeShort(9);
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.flush();
				dos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
/*
# 정리
1. 입출력 스트림에 대한 설명 중 틀린 것은 무엇입니까?
	1) 하나의 스트림으로 입력과 출력이 동시에 가능하다.
	2) 프로그램을 기준으로 데이터가 들어오면 입력 스트림이다.
	3) 프로그램을 기준으로 데이터가 나가면 출력 스트림이다.
	4) 콘솔에 출력하거나, 파일에 저장하려면 출력 스트림을 사용해야 한다.

2. InputStream과 Reader에 대한 설명으로 틀린 것은 무엇입니까?
	1) 이미지데이터는 InputStream 또는 Reader로 모두 읽을 수 있다.
	2) Reader의 read()메소드는 1문자를 읽는다.
	3) InputStream의 read() 메서드는 1바이트를 읽는다.
	4) InputStreamReader를 이용하면 InputStream을 Reader로 변환시킬 수 있다.
	
3. InputStream의 read(byte[] b, int off, int len)메서드에 대한 설명으로 틀린 것은 무엇입니까?
 	1) 메서드의 리턴값을 읽는 바이트 수이다.
 	2) 첫번째 매개값 b에는 읽은 데이터가 저장된다.
 	3) 두번째 매개값 off에는 첫번째 매개값 b에서 데이터가 저장될 시작 인덱스이다.
 	4) 세번째 매개값 len은 첫번째 매개값 b에서 데이터가 저장된 마지막 인덱스이다.
 	
4. 출력 스트림에서 데이터 출력 후, flush()메서드를 호출하는 이유가 무엇입니까?  답:1
	1) 출력 스트림의 버퍼에 있는 데이터를 모두 출력시키고 버퍼를 비운다.
	2) 출력 스트림을 메모리에서 제거한다.
	3) 출력 스트림의 버퍼에 있는 데이터를 모두 삭제한다.
	4) 출력 스트림을 닫는 역할을 한다.
*/