package AbstractFactory;

import ShapeGarden.Shape;

public abstract class AbstractShapeFactory {
	abstract Shape getShape(String shapeType);
}
