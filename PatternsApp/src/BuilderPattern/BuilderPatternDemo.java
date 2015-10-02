package BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args){
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		Meal nonvegMeal = mealBuilder.prepareNonVegMeal();

		vegMeal.showItems();
		System.out.println("Total Cost of Veg meal : "+ vegMeal.getCost());
		
		nonvegMeal.showItems();
		System.out.println("Total Cost of NonVeg Meal : "+ nonvegMeal.getCost());
	}
}
