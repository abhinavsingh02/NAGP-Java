package tutorialsPoint;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean phony= false;
		boolean authentic = !phony;
		System.out.println(authentic);
		
		boolean phony2 = true;
		boolean ans = phony && phony2;
		System.out.println(ans);
		boolean ans2 = phony || phony2;
		System.out.println(ans2);

	}

}
