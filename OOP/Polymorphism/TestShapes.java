package homeWork3;

public class TestShapes {

	public static void main(String[] args) {
		
		OverLoad shapes = new OverRide();
		System.out.println("Adding a + b + c = " + shapes.lenghtOfShapes(10, 20, 30));
		System.out.println("Adding a + b = "  + shapes.lenghtOfShapes(10, 20));
		System.out.println("Adding a + b + c + d = " + shapes.lenghtOfShapes(10.5, 20, 30));
		
		//this is from overRide class
		System.out.println("Adding a + b + c + d + 5 = " + shapes.lenghtOfShapes(10, 20, 30, 40));
		
	}

}
