/*
 중첩 인터페이스 확인예제
 (1단계)
 - MusicStartListener : 음악이 켜지는 리스너 구현
  
 (2단계)
 - Draw
 	필드선언
 	OnTouchListener( 중첩인터페이스 )
 		onTouch(); 추상메서드
 	drawing()
 - CircleListener : 동그라미 그려주는 실제클래스
 - TriangleListener : 세모를 그려주는 실제클래스	
   
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

