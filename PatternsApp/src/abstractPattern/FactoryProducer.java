package abstractPattern;

public class FactoryProducer {
	
	public static AbstractFactoryI getFactory(String choice){
		if(choice.equalsIgnoreCase("Color")){
			return new ColorFactory();
		}
		if(choice.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}
		return null;
	}
	
}
