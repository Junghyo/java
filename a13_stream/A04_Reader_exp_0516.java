/*
 ���ɸ޴��� �Է� �޾� ����ϼ���.
 ������ ������?
 ������ ������ @@@
*/

package a13_stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class A04_Reader_exp_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] chArray = new char[6];
		System.out.println("������ ������?");
		try {
			reader.read(chArray);
			System.out.print("������ ������ ");
			for(char c : chArray){
				System.out.print(c);
			}
			String chLunch = new String (chArray);
			System.out.println("������ ����:"+chLunch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
