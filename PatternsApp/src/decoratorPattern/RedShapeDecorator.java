package decoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape){
		super(decoratedShape);
	}
	
	@Override
	public void draw(){
		decoratedShape.draw();
		setRedBorder(decoratedShape); //decorated here
	}
	
	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border is Red");
	}
	
}
