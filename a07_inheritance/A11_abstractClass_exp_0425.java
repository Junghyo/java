/*
 확인예제.
 <Terran>
 공통 : call(){} : 해당로봇 호출
 재정의: attack();
  
*/

package a07_inheritance;

abstract class Terran{
	String name;
	public void product(){
		System.out.println(name+"을 생산합니다.");
	}
	public abstract void quote();
}
class Scv extends Terran{
	Scv(){
		super.name="SCV";
	}

	@Override
	public void quote() {
		// TODO Auto-generated method stub
		System.out.println(name+": SCV good to go sir. scv");	
	}
}

class Ghost extends Terran{
	Ghost(){
		super.name="Ghost";
	}

	@Override
	public void quote() {
		// TODO Auto-generated method stub
		System.out.println(name+": Somebody calls for an Exterminater.");
	}
}

class Marin extends Terran{
	Marin(){
		super.name="Marin";
	}

	@Override
	public void quote() {
		// TODO Auto-generated method stub
		System.out.println(name+": Who wanna a piece of meat, boy");
	}
}
public class A11_abstractClass_exp_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terran [] t1 = { new Scv(), new Marin(), new Ghost() };
		for(Terran unit : t1){
			unit.product();
			unit.quote();
		}

	}

}
