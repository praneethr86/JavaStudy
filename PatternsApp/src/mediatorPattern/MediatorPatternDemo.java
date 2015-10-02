package mediatorPattern;

public class MediatorPatternDemo {
	public static void main(String[] args){
		User robert = new User("Robert");
		User jim = new User("Jim");
		
		robert.sendMessage("Hello there");
		jim.sendMessage("Sayonara");
	}
}
