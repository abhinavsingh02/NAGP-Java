package tutorialsPoint;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] myList = { 1, 2.5, 5.6, 8.7, 89 };
		
		/*int[] marks = new int[5];
		marks[0] = 98;
		System.out.println(marks[0]);*/

		// print the all array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}

		// summing all elements
		double sum = 0;
		for (int i = 0; i < myList.length; i++) {
			sum += myList[i];
		}
		System.out.println(sum);

		// finding the largest element
		double max = 0;
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.println(max);

	}

}
