package AbstractFactory;

public class ShapeFactoryProducer {
	public static AbstractShapeFactory getShapeFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		} else {
			return new NormalShapeFactory();
		}
	}
}
