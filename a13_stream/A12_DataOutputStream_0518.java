package a13_stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A12_DataOutputStream_0518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dtfile = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/dataFile.dat";
//		문자열을 저장 호출
//		데이터를 해당 type 저장과 호출
//		FileOutputStream : 데이터를 쓰는 스트림 클래스
		FileOutputStream fos = null;

//		DataOutputStream : 데이터를 쓰는 보조 스트림 클래스
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(dtfile);
			dos = new DataOutputStream(fos);

//			데이터를 해당 파일에 쓰기
//			Ronaldo, 95.2(실수), 1(정수)
			dos.writeUTF("Ronaldo");
			dos.writeDouble(95.724);
			dos.writeInt(1);
			dos.writeUTF("4번타자");
			dos.writeDouble(20.2124);
			dos.writeInt(2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("기타예외발생");
		} finally {
			try {
//				Buff메모리 활용시에는 flush를 먼저 시켜줘야함				
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


