import java.util.Scanner;

public class Choco_2 {

	private static Scanner scant;

	public static void main(String[] args) {
		scant = new Scanner(System.in);
		int n, r = 0, q = 0;
		System.out.println("Enter the amount: ");//Write next logic if the chocolate price is not equal to 1 rs
		n = scant.nextInt();
		int wrap = n;
		int sum = n;
		while (wrap > 3) {
			q = wrap / 3;
			r = wrap % 3;
			wrap = q + r;
			sum += q;

		}
		System.out.println("You can have maximum " + sum + " chocolates.");
	}

}

