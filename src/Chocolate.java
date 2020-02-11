public class Chocolate {

	public static void main(String[] args) {

		/* int n = 30, c = 1, wrap = 3;
		int total = 0;

		int choco = n / c;

		total += choco;

		while (choco >= wrap) {
			total += choco / wrap;
			choco = (choco / wrap) + (choco % wrap);
		}
		System.out.println(total); 
		*/
		int money=20;
		int choco=money;
		int wrap=3;
		choco = choco + (choco-1)/(wrap-1);
		System.out.println(choco);
		
		
	}
}
