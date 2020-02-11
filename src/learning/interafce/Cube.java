package learning.interafce;
public class Cube implements ThreeDShape{

	double side;
	
	public Cube(double side) {
		// TODO Auto-generated constructor stub
	this.side=side;
	}

	@Override
	public double volume() {
		return side*side*side;
	}

	@Override
	public double area() {
		return side*side;
	}

}
