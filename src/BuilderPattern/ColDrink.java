package BuilderPattern;

public abstract class ColDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}
}