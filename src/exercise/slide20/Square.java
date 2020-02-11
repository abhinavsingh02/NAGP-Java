package exercise.slide20;

public class Square {

	int side;

	Square(int side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}

	public int calculateArea() {
		return side * side;
	}

	public void calculateVolume() throws OperationNotSupportedException {
		throw new OperationNotSupportedException(side);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square obj = new Square(5);
		
	try {
		System.out.println("The surface area of sqaure is : "+obj.calculateArea());
		obj.calculateVolume();
	}
	catch(OperationNotSupportedException e) {
		System.out.println("The square is not eligible for this operation.");
		//e.printStackTrace();
	}
		

	}

}
