package Task02;

public class GarmentFactory {
	public static GarmentType createGarments(String selection) {

		// There is also another method that gets the class type on runtime
		// I don't remember the exact syntax, but it was something like
		// selection.getclass().getName(). something....
		//It was taught to us in last class
		if (selection.equalsIgnoreCase("Sweater")) {
			return new Sweater();
		} else if (selection.equalsIgnoreCase("Jacket")) {
			return new Jacket();
		}
		throw new IllegalArgumentException("Selection doesnot exist");
	}
}
