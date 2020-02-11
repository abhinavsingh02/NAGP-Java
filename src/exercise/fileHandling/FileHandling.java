package exercise.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("data.txt");
		try {
			boolean createNewFile = file.createNewFile();
			System.out.println("File created = " + createNewFile);
		}

		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
