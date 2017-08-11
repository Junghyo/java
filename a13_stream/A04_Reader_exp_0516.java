/*
 점심메뉴를 입력 받아 출력하세요.
 오늘의 점심은?
 선택한 점심은 @@@
*/

package a13_stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class A04_Reader_exp_0516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] chArray = new char[6];
		System.out.println("오늘의 점심은?");
		try {
			reader.read(chArray);
			System.out.print("선택한 점심은 ");
			for(char c : chArray){
				System.out.print(c);
			}
			String chLunch = new String (chArray);
			System.out.println("선택한 점심:"+chLunch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
