public class Student {

	static int count = 0;

	protected String name;

	protected Double percentage;

	public int rollNumber;

	String grade;

	Student() { // default constructor

		// System.out.println("Student Initialized");
		count++;
	}

	Student(int roll) {

	}

	void calculateGrade() {

		if (percentage >= 90) {
			grade = "A";
		} else if (percentage >= 80 && percentage < 90) {
			grade = "B";
		} else if (percentage >= 60 && percentage < 80) {
			grade = "C";
		} else if (percentage >= 40 && percentage < 60) {
			grade = "D";
		} else
			grade = "E";
		System.out.println(grade);

	}

	void displayName() {
		System.out.println("The name of the student is " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		// Student student2= new Student();
		student1.name = "Abhinav Singh";
		student1.displayName();
		student1.percentage = (double) 89;
		student1.calculateGrade();
		System.out.println(count);

	}

}
