package AbstractFactory;

import ShapeGarden.Shape;

public class AbstractShapeFactoryDemo {
	public static void main(String[] args) {
		AbstractShapeFactory shapeFactory = ShapeFactoryProducer.getShapeFactory(false);
		
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		
		shapeFactory = ShapeFactoryProducer.getShapeFactory(true);
		
		Shape shape4 = shapeFactory.getShape("Rectangle");
		shape4.draw();
		
		Shape shape5 = shapeFactory.getShape("Square");
		shape5.draw();
	}
}
