package a13_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A06_OutputStream_exp_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/test02";
		InputStream is = System.in;
		OutputStream os = null;
		byte[] charArray = new byte[12];
		try {
			os = new FileOutputStream(file);
			is.read(charArray);
			for(byte data : charArray){
				os.write(data);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}

