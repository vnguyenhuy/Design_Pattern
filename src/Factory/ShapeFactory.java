package Factory;

import java.util.Random;

import ShapeGarden.Circle;
import ShapeGarden.Rectangle;
import ShapeGarden.Shape;
import ShapeGarden.Square;

public class ShapeFactory {
	private int randomCount = 1;
	
	public Shape getShape(String shapeType) {
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

	public Shape getShapeRandom() {
		Random rand = new Random();
		rand.ints(1, 3);
		int i = rand.nextInt();
		switch (i) {
		case 1:
			return new Circle();
		case 2:
			return new Rectangle();
		case 3:
			return new Square();
		default:
			return null;
		}
	}
	
	public Shape getShapeInOrder() {
		if(randomCount == 1) {
			randomCount++;
			return new Circle();
		}
		if(randomCount == 2) {
			randomCount++;
			return new Rectangle();
		}
		if(randomCount == 3) {
			randomCount = 1;
			return new Square();
		}
		else {
			return null;
		}
	}
}
