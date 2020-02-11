package learning.interafce;

public class Square implements Shape {
	
	int side;
     
	public Square(int side) {
		// TODO Auto-generated constructor stub
		this.side=side;
	}
	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
