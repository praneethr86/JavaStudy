package abstractPattern;

public class ShapeFactory extends AbstractFactoryI {
	
	public Shape getShape(String shape){
		
		if(shape == null){
			return null;
		}
		
		if(shape.equalsIgnoreCase("Rhombus")){
			return new Rhombus();
		}
		
		if(shape.equalsIgnoreCase("Hexagon")){
			return new Hexagon();
		}
		
		return null;
	}
	
	public Color getColor(String color){
		return null;
	}
	
}
