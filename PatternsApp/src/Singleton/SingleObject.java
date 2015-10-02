package Singleton;

public class SingleObject {

	private static SingleObject simpleObject = new SingleObject();
	
	private SingleObject(){};
	
	public static SingleObject getInstance(){
		return simpleObject;
	}
	
	public void draw(){
		System.out.println("Inside draw");
	}
	
}
