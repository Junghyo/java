package a08_objectdup;



// Button Ŭ������ �� �̺�Ʈ ó���ϴ� ��ø �������̽� Ȱ��
class Button{
//	�������̽� Ÿ�� �ʵ�
	OnClickListener listener;

//	�ܺο��� �پ��ϰ� ó���ϴ� ��ü��ü�� �޾Ƶ��� �� �ְ�
//	�޼��� ����
	void setOnClickListener(OnClickListener listener){
		this.listener = listener;
	}
	void touch(){
		if(listener!=null){
			listener.onClick();
		}else{
			System.out.println("�����ʿ� ���� ��ü �Ҵ���� ����");
		}
	}
//	Button Ŭ������ ���ӵ� ��ø �������̽� ����
	interface OnClickListener{
//		�߻�޼��� ����		
		void onClick();
	}
}
//	���� Ŭ���� ����.. OnClickListener�� implement��...
//	��ư�� Ŭ������ �� ��ȭ�� �ɾ��ִ� Ŭ����, �޼����� �����ִ� Ŭ����
//	��ø�������̽��� Ŭ������.�������̽��� : Button.OnClickListener
class CallListener implements Button.OnClickListener{

//	Button.OnClickListener�� onClick()�߻�޼��尡
//	���ǵǾ� �ֱ� ������ �ݵ�� implements�ϴ� ���� ������ �ؾ� �Ѵ�.	
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �ɴ�");
		
	}
	
}
// �޼��� �����ִ� Ŭ����
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("�޼����� ������");
	}
	
}
class TurnOnMusic implements Button.OnClickListener{

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("������ Ʋ��");
	}
	
}
class TurnOffMusic implements Button.OnClickListener{

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("������ ����");
	}
	
}
public class A02_dupInterface_0427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ư Ŭ���� ����.
		Button btn01 = new Button();
		btn01.touch(); // Listener ��ü�� �Ҵ���� �ʾұ⿡ 
		// listener ��ü �Ҵ���� �޽��� ǥ��.. null.
		// void setOnClickListener(OnClickListener listener)
		// �������̽��� ���� ��ü�� �Ҵ�..
		// ����: OnClickListener listener = new CallListener();
		btn01.setOnClickListener(new CallListener());
		btn01.touch();
		btn01.setOnClickListener(new MessageListener());
		btn01.touch();
		btn01.setOnClickListener(new TurnOnMusic());
		btn01.touch();
		btn01.setOnClickListener(new TurnOffMusic());
		btn01.touch();

	}

}
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