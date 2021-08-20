package BuilderPatternCar;

public class BuilderPatternCarDemo {
	public static void main(String[] args) {

		// 1st way to create a new car
		Car manualCar = new Car(4, new SeatBelt("safe seat belt"), "123", new Windowscreen("thuy tinh"), new Engineer("Peter"));

		// 2nd way to create a new car
		Car builderCar = new CarBuilder()
								.addNumberOfWheel(4)
								.addSeatBelt(new SeatBelt("safest seat belt"))
								.addColor("123")
								.addWindowScreen(new Windowscreen("kinh chong dan"))
								.addEngineer(new Engineer("William"))
								.build();
	}
}
