package exercise;

interface StrategyPattern{
	void injection();
}
class StrategyImpl implements StrategyPattern{

	@Override
	public void injection() {
		// TODO Auto-generated method stub
		System.out.println("aaaa");
	}
	
}
public class StrategyPatternService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrategyPattern sp = new StrategyImpl();
		sp.injection();
	}

}
