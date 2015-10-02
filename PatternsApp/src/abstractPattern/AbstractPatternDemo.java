package abstractPattern;

public class AbstractPatternDemo {
	
	public static void main(String[] args){
		
		AbstractFactoryI absFact = FactoryProducer.getFactory("color");
		
		Color color1 = absFact.getColor("green");
		color1.draw();
	
		AbstractFactoryI absFact2 = FactoryProducer.getFactory("shape");
		
		Shape shape1 = absFact2.getShape("rhombus");
		shape1.draw();
		
	}
	
	
//	public static void main(String[] args){
//		
//		FactoryProducer facProd = new FactoryProducer();
//	
//		drawColor(facProd,"green");	
//		drawColor(facProd,"purple");
//	
//	}
//
//	private static void drawColor(FactoryProducer facProd, String colorName) {
//		Color color1 = facProd.getColor(colorName);
//		color1.draw();
//	}
	
}
