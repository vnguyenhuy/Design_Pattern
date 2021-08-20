package BuilderPattern;

public class Coke extends ColDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
