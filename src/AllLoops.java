import java.util.Scanner;

public class AllLoops {

	private static Scanner scant;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		scant = new Scanner(System.in);
		System.out.println("Enter the lower range");
		x = scant.nextInt();
		System.out.println("Enter the upper range");
		y = scant.nextInt();

		if (x > y) {
			System.out.println("Error");
		} else {
			System.out.println("This is for loop");
			for (int i = x; i <= y; i++) {
				System.out.println(i);
			}
			System.out.println("This is for while loop");
			while (x <= y) {
				System.out.println(x);
				x++;
			}
			System.out.println("This is for do while loop");

			x = 10;
			do {
				System.out.println(x);
				x++;
			} while (x <= y);
		}

	}

}
