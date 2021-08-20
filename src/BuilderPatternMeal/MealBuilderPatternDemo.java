package BuilderPatternMeal;

public class MealBuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItem();
		System.out.println("Total Cost: " + vegMeal.getPrice());
		
		System.out.println("\n");
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Veg Meal");
		nonVegMeal.showItem();
		System.out.println("Total Cost: " + nonVegMeal.getPrice());		
	}
}
