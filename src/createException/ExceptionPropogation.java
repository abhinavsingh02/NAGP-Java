package createException;

public class ExceptionPropogation {

	void m() {
		int data = 40 / 0;
		System.out.println(data);
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropogation obj = new ExceptionPropogation();
		obj.p();

	}

}
