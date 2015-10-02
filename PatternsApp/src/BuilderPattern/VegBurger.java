package BuilderPattern;

public class VegBurger extends Burger {
	
	@Override
	public String name(){
		return "VeggieBurger";
	}
	
	@Override 
	public float price(){
		return 25f;
	}
}
