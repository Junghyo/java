package a07_inheritance;

class Duck{
	ChangeColor c;
	void setColor(ChangeColor color){
		this.c=color;
	}
	void showColor(){
		if(c!=null){
			c.whatColor();
			System.out.println("������ ��������.");
		}else{
			System.out.println("�׳� ������ ��������.");
		}
	}
}
interface ChangeColor{
	void whatColor();
}
class Yellow implements ChangeColor{

	@Override
	public void whatColor() {
		// TODO Auto-generated method stub
		System.out.print("�����");
	}
	
}
class White implements ChangeColor{

	@Override
	public void whatColor() {
		// TODO Auto-generated method stub
		System.out.print("���");
	}
	
}
public class A13_Interface_exp2_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new Duck();
		d1.showColor();
		ChangeColor [] c1 = { new White(), new Yellow() };
		for(ChangeColor kind : c1){
			d1.setColor(kind);
			d1.showColor();
		}
		

	}

}
