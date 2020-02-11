package tutorialsPoint;

public class Polymorphism {

	public int add(int x) { // Method Overloading
		int y = x + 2;
		return y;
	}

	public int add(int x, int y) { // Method Overloading
		int z = x + y;
		return z;
	}

	public void method1() {
		System.out.println("This is the parent class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism obj1 = new Polymorphism();
		System.out.println(obj1.add(3));// Method overloading calling 1
		System.out.println(obj1.add(4, 5));// Method overloading calling 2
		obj1.method1();
		Polymorphism obj2 = new ChildPolymorphism();//Method overriding; creating object of child class
		obj2.method1();

	}

}
