package exercise.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDeletion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("Demo.txt");
		// file.createNewFile();
		file.delete();
		System.out.println("File deleted = ");

	}

}
