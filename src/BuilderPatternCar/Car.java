package BuilderPatternCar;

public class Car {
	private int numberOfWheel;
	private SeatBelt seatBelt;
	private String color;
	private Windowscreen windowScreen;
	private Engineer engineer;
	
	public Car(int numberOfWheel, SeatBelt seatBelt, String color, Windowscreen windowScreen, Engineer engineer) {
		this.numberOfWheel = numberOfWheel;
		this.seatBelt = seatBelt;
		this.color = color;
		this.windowScreen = windowScreen;
		this.engineer = engineer;
	}
	
	public int getNumberOfWheel() {
		return numberOfWheel;
	}
	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}
	public SeatBelt getSeatBelt() {
		return seatBelt;
	}
	public void setSeatBelt(SeatBelt seatBelt) {
		this.seatBelt = seatBelt;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Windowscreen getWindowScreen() {
		return windowScreen;
	}
	public void setWindowScreen(Windowscreen windowScreen) {
		this.windowScreen = windowScreen;
	}
	public Engineer getEngineer() {
		return engineer;
	}
	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
	}		
}
