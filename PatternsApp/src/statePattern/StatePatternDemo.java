package statePattern;

public class StatePatternDemo {

	public static void main(String[] args){
		Context context = new Context(); 
		//behavior of same context object varies as the state object varies
		
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString()); //will print start state
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString()); //will print stop state
	}
	
}
