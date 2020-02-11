package tutorialsPoint;

public class Puppy {

	int PuppyAge;

	Puppy(String name) {
		System.out.println("the puppy name is " + name + ".");
	}

	public void setAge(int age) {
		PuppyAge = age;
	}

	public int returnAge() {
		System.out.println("The puppy age is " + PuppyAge + ".");
		return PuppyAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy obj1 = new Puppy("Tommy");
		obj1.setAge(7);
		;
		obj1.returnAge();
		System.out.println();

	}

}
