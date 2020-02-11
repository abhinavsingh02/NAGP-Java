package learning.interafce;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cube obj1 = new Cube(5);
		System.out.println("The volume of cube is "+obj1.volume()+".");
		
		Circle obj2 = new Circle(5);
		System.out.println("The area of circle is "+obj2.area()+".");;
		
		Sphere obj3 = new Sphere(5);
		System.out.println("The volume of sphere is "+obj3.volume()+".");
		
		Square obj4 = new Square(5);
		System.out.println("The area of square is "+obj4.area()+".");
		
		

	}

}
