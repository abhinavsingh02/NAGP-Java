package tutorialsPoint;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for (int i = 0; i <= 20; i += 2) {
			System.out.println(i);// Printing in the increasing order through for loop
		}

		int i = 20;
		while (i > 0) {
			System.out.println(i);// Printing in the decreasing order
			i -= 2;
			
			  if(i<15) { break; }
			  // This is for break the loop
		}

		int j = 0;
		do {
			System.out.println("Nagarro");
			j++;
		} while (j <= 2);

		int k = 0;
		for (k = 1; k < 6; k++) {
			if (k == 5)
				continue;
			System.out.println(k);
		} */
		
		myLabel: for (int i=1;i<4;i++) {
			for(int j=1;j<4;j++) {
				if(i==2 && j==2) {
					continue myLabel;
				}
				System.out.println(i+" "+j);
			}
		}

	}
}
