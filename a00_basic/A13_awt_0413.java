package a00_basic;

import java.awt.Button;
import java.awt.Frame;

class ShowJava{
	Frame frame;
	// �ڹٿ��� ȭ��ó��
	
	Button btnEast;
	Button btnWest;
	Button btnSouth;
	Button btnNorth;
	Button btnCenter;
	
	ShowJava(){
		frame = new Frame("�ڹٿ��� ȭ��ó��");
		btnEast = new Button("���ʹ�ư");
		btnWest = new Button("���ʹ�ư");
		btnSouth = new Button("���ʹ�ư");
		btnNorth = new Button("���ʹ�ư");
		btnCenter = new Button("�߾ӹ�ư");
	}
	void launchFrame(){
		frame.add(btnEast, "East");
		// frame�� ���ʿ�
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
