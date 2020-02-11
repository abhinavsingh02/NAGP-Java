package exercise.slide20;

public class Cube {

	int side;

	Cube(int side) {
		this.side = side;
	}

	public int calculateArea() {
		return 6 * side * side;

	}
	public int calculateVolume() {
		return side*side*side;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube obj1 = new Cube(7);
		System.out.println("The surface area of cube is "+obj1.calculateArea());
		System.out.println("The volume of cube is "+obj1.calculateVolume());
		

	}

}
