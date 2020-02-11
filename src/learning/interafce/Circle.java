package learning.interafce;

public class Circle implements Shape{

	int rad;
	
    public Circle(int rad) {
		// TODO Auto-generated constructor stub
    	this.rad=rad;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*rad*rad;
	}

}
