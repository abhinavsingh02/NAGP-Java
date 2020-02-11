package learning.interafce;
public class Sphere implements ThreeDShape {
	
	public double rad;
	 
	public Sphere(double rad) {
		// TODO Auto-generated constructor stub
	this.rad=rad;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		double v = (4*Math.PI*rad*rad*rad)/3;
		return v;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 4*Math.PI*rad*rad;
	}
	}


