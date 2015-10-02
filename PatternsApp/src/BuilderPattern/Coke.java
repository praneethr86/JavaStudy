package BuilderPattern;

public class Coke extends ColdDrink {

	@Override
	public String name(){
		return "Coke";
	}
	
	@Override 
	public float price(){
		return 11.75f;
	}
		
}
