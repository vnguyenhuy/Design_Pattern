package BuilderPatternCar;

public class CarBuilder implements ICarBuilder{

	private int numberOfWheel;
	private SeatBelt seatBelt;
	private String color;
	private Windowscreen windowScreen;
	private Engineer engineer;
	
	@Override
	public CarBuilder addNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
		return this;
	}

	@Override
	public CarBuilder addSeatBelt(SeatBelt seatBelt) {
		this.seatBelt = seatBelt;
		return this;
	}

	@Override
	public CarBuilder addColor(String color) {
		this.color = color;
		return this;
	}

	@Override
	public CarBuilder addWindowScreen(Windowscreen windowScreen) {
		this.windowScreen = windowScreen;
		return this;
	}

	@Override
	public CarBuilder addEngineer(Engineer engineer) {
		this.engineer = engineer;
		return this;
	}

	@Override
	public Car build() {
		return new Car(numberOfWheel, seatBelt, color, windowScreen, engineer);
	}
}