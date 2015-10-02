package nullObjectPattern;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		//Here is how you define Null object behavior explicitly
		return "Name not available in Customer Database";
	}

}
