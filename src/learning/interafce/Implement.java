package learning.interafce;

public class Implement implements A, B {

	public void ShowA() {
		System.out.println("This function is of interface A.");
	}

	public void InsideClass() {
		System.out.println("This function is of Class.");
	}

	public void ShowB() {
		System.out.println("This function is of interface B.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new Implement();
		obj1.ShowA();
		// [obj1.InsideClass(); // Cannot call since obj is referring to interface A

		B obj3 = new Implement();
		obj3.ShowB();

		Implement obj2 = new Implement();
		obj2.InsideClass();

	}

}
