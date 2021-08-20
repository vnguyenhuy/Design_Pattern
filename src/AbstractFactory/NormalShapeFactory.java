package AbstractFactory;

import ShapeGarden.Circle;
import ShapeGarden.Rectangle;
import ShapeGarden.Shape;
import ShapeGarden.Square;

public class NormalShapeFactory extends AbstractShapeFactory{

	@Override
	Shape getShape(String shapeType) {
		switch (shapeType.toLowerCase()) {
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "square":
			return new Square();
		default:
			return null;
		}
	}

}
