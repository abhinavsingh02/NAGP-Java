
public class LogicXor {

	static int myXor(int x, int y) {
		// return (x | y) & (~x | ~y);
		return x ^ y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 3, y = 5;
		System.out.println("XOR is " + (myXor(x, y)));

	}

}
