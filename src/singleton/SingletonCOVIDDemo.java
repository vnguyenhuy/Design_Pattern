package singleton;

public class SingletonCOVIDDemo {
	public static void main(String[] args) {		
		
		//get the only object available
		SingleCOVIDObject covidObject = SingleCOVIDObject.getInstance();
		covidObject.showMessage();
		
	}
}
