package exercise.fileHandling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(new File("C:\\Users\\abhinavsingh02\\Desktop\\Password.txt"));
		while (sc.hasNextLine()) {
			String str = sc.next();
			System.out.println(str);
		}
		sc.close();
	}
}
