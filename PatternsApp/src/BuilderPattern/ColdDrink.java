package BuilderPattern;

public class ColdDrink implements Item {

	@Override
	public String name() {
		return "ColdDrink";
	}

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public float price() {
		return 0;
	}

}
