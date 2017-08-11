package a13_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A13_DataInputStream_0518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		파일에 있는 데이터 가져오기
		String dtfile = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/dataFile.dat";

//		1. FileInputStream : 파일에 있는 내용 가져오는 기본 Stream
		FileInputStream fis = null;
		
//		2. DataInputStream : 데이터 내용 가져오는 보조 Stream		
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(dtfile);
			dis = new DataInputStream(fis);
			String name = "";
			double score = 0;
			int num = 0;
			for(int cnt=1; cnt<=2; cnt++){
				name = dis.readUTF();
				score = dis.readDouble();
				num = dis.readInt();
				System.out.print(name+"\t");
				System.out.print(score+"\t");
				System.out.print(num+"\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("기타예외 발생");
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		
	}

}
