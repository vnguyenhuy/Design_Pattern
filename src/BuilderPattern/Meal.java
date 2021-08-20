package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> listOfItem = new ArrayList<Item>();
	
	public void addItem(Item item) {
		listOfItem.add(item);
	}
	
	public float getPrice() {
		float totalPrice = 0;
		for (Item item : listOfItem) {
			totalPrice += item.price();
		}
		return totalPrice;
	}
	
	public void showItem() {
		for (Item item : listOfItem) {
			System.out.print("name: " + item.name());
			System.out.print(", packing: " + item.packing().pack());
			System.out.println(", price: " + item.price());
		}
	}
}
