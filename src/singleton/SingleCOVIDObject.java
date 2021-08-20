package singleton;

public class SingleCOVIDObject {
	private static SingleCOVIDObject covidObject;
	
	//if the Object = null -> create it.
	//if the Object != null -> get it.
	// => there is only an instance available
	public static SingleCOVIDObject getInstance() {
		if(covidObject == null) {
			covidObject = new SingleCOVIDObject();
		}
		return covidObject;
	}
	
	//make the constructor private so that the class is not instantiated
	private SingleCOVIDObject() {
	}
		
	public void showMessage() {
		System.out.println("goodbye COVID forever!!!");
	}
}
