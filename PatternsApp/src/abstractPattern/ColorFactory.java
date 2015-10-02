package abstractPattern;

public class ColorFactory extends AbstractFactoryI {
	public Color getColor(String colorName){

		if(colorName == null){
			return null;
		}

		if(colorName.equalsIgnoreCase("Green")){
			return new Green();
		}

		if(colorName.equalsIgnoreCase("Purple")){
			return new Purple();
		}

		return null;
	}
	
	public Shape getShape(String shape){
		return null;
	}
}
