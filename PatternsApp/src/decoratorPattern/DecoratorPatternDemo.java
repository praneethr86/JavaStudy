package decoratorPattern;

public class DecoratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square = new Square();
		Shape redSquare = new RedShapeDecorator(new Square());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		square.draw();
		redSquare.draw();
		redRectangle.draw();
		
	}

}
