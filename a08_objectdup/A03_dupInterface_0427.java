/*
 ��ø �������̽� Ȯ�ο���
 (1�ܰ�)
 - MusicStartListener : ������ ������ ������ ����
  
 (2�ܰ�)
 - Draw
 	�ʵ弱��
 	OnTouchListener( ��ø�������̽� )
 		onTouch(); �߻�޼���
 	drawing()
 - CircleListener : ���׶�� �׷��ִ� ����Ŭ����
 - TriangleListener : ���� �׷��ִ� ����Ŭ����	
   
*/
package a08_objectdup;

class Draw{
	OnTouchListener listener;
	
	void setOnListener(OnTouchListener what){
		this.listener=what;
	}
	void drawing(){
		if(listener!=null){
			listener.onTouch();
		}else{
			System.out.println("Can't Drawing");
		}
	}
	interface OnTouchListener{
		void onTouch();
	}
}
class Circle implements Draw.OnTouchListener{

	@Override
	public void onTouch() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}
	
}
class Triangle implements Draw.OnTouchListener{

	@Override
	public void onTouch() {
		// TODO Auto-generated method stub
		System.out.println("Driawing Triangle");
	}
	
}
public class A03_dupInterface_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw d1 = new Draw();
		d1.drawing();
		d1.setOnListener(new Circle());
		d1.drawing();
		d1.setOnListener(new Triangle());
		d1.drawing();
		d1.setOnListener(null);
		d1.drawing();

	}

}

