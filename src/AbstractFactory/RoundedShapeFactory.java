package AbstractFactory;

import ShapeGarden.RoundedRectangle;
import ShapeGarden.RoundedSquare;
import ShapeGarden.Shape;

public class RoundedShapeFactory extends AbstractShapeFactory{

	@Override
	Shape getShape(String shapeType) {
		switch (shapeType.toLowerCase()) {
		case "rectangle":
			return new RoundedRectangle();
		case "square":
			return new RoundedSquare();
		default:
			return null;
		}
	}

}
