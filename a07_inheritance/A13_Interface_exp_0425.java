package a07_inheritance;
class Hydra{
	Upgrade u;
	void move(){
		System.out.println("히드라가 움직인다.");
	}
	void setUpgrade(Upgrade what){
		this.u=what;
	}
	void printUpgrade(){
		System.out.print("히드라");
		if(u!=null){
			u.improve();
		}else{
			System.out.println("\t업그레이드 되지 않음");
		}
	}
}
interface Upgrade{
	void improve();
}
class Attack implements Upgrade{

	@Override
	public void improve() {
		// TODO Auto-generated method stub
		System.out.println("\t공격력 증가!");
	}
	
}
class Morph implements Upgrade{

	@Override
	public void improve() {
		// TODO Auto-generated method stub
		System.out.println("\t러커로 변태!");
	}
	
}

class Range implements Upgrade{

	@Override
	public void improve() {
		// TODO Auto-generated method stub
		System.out.println("\t공격사거리 증가!");
	}
	
}

class Speed implements Upgrade{

	@Override
	public void improve() {
		// TODO Auto-generated method stub
		System.out.println("\t이동속도 증가!");
		
	}
	
}
public class A13_Interface_exp_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hydra h1 = new Hydra();
		Hydra h2 = new Hydra();
		Attack a1 = new Attack();
		h1.move();
		h1.printUpgrade();
		h1.setUpgrade(a1);
		h1.printUpgrade();
		Morph m1 = new Morph();
		h1.setUpgrade(m1);
		h1.printUpgrade();
		h1.setUpgrade(new Range());
		h1.setUpgrade(null);
		h1.printUpgrade();
		h2.printUpgrade();
		Speed s1 = new Speed();
		h2.setUpgrade(s1);
		h2.printUpgrade();
		Upgrade [] u1 = {new Range(), new Attack(), new Range(), new Speed(), new Morph()};
		for(Upgrade kind : u1){
			h1.setUpgrade(kind);
			h1.printUpgrade();		
		}

	}

}
