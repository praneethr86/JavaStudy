package statePattern;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player in stop state");
		context.setState(this);
	}
	
	public String toString(){
		return "Stop state";
	}

}
