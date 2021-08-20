package BuilderPatternCar;

public interface ICarBuilder {
	public CarBuilder addNumberOfWheel(int numberOfWheel);
	public CarBuilder addSeatBelt(SeatBelt seatBelt);
	public CarBuilder addColor(String color);
	public CarBuilder addWindowScreen(Windowscreen windowScreen);
	public CarBuilder addEngineer(Engineer engineer);
	public Car build();
}
