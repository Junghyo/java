package a00_basic;

import java.awt.Button;
import java.awt.Frame;

class ShowJava{
	Frame frame;
	// 자바에서 화면처리
	
	Button btnEast;
	Button btnWest;
	Button btnSouth;
	Button btnNorth;
	Button btnCenter;
	
	ShowJava(){
		frame = new Frame("자바에서 화면처리");
		btnEast = new Button("동쪽버튼");
		btnWest = new Button("서쪽버튼");
		btnSouth = new Button("남쪽버튼");
		btnNorth = new Button("북쪽버튼");
		btnCenter = new Button("중앙버튼");
	}
	void launchFrame(){
		frame.add(btnEast, "East");
		// frame의 동쪽에
		frame.add(btnWest, "West");
		frame.add(btnSouth, "South");
		frame.add(btnNorth, "North");
		frame.add(btnCenter, "Center");
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
public class A13_awt_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowJava sj = new ShowJava();
		sj.launchFrame();

	}

}
