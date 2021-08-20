package BuilderPatternMeal;

public abstract class ColDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}
}