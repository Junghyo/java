package a13_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A14_DataInStream_exp_0518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dtfile = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/prodData.dat";
		FileInputStream fis = null;
		DataInputStream dis = null;
		System.out.println("이름\t골\t등번호");
		try {
			fis = new FileInputStream(dtfile);
			dis = new DataInputStream(fis);
			for(int i = 1; i<4; i++){
		
					System.out.print(dis.readUTF()+"\t");
					System.out.print(dis.readInt()+"\t");
					System.out.print(dis.readShort()+"\n");

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
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
