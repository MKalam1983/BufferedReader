package homeWork3;

public class OverLoad {
	// (Polymorphism) this is an overloading class
	public int lenghtOfShapes(int a, int b) {
		int totalLength = a + b;
		return totalLength;
	}

	public int lenghtOfShapes(int a, int b, int c) {
		int totalLength = a + b + c;
		return totalLength;
	}

	public int lenghtOfShapes(int a, int b, int c, int d) {
		int totalLength = a + b + c + d;
		return totalLength;
	}

	public double lenghtOfShapes(double a, int b, int c) {
		double totalLength = a + b + c;
		return totalLength;
	}

}
