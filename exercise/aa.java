package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("out.txt");
		Scanner sc;
		try {
			sc = new Scanner(file);
			while(sc.hasNext()){
				System.out.println(sc.next().concat("¹Ý°©½À´Ï´Ù"));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
