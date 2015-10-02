package Singleton;

public class SingletonPatternDemo {

	public static void main(String[] args){
		
		//SingleObject simpleObject = new SingleObject();
		
		SingleObject simpleObject = SingleObject.getInstance();
		
		simpleObject.draw();
		
	}
	
}
