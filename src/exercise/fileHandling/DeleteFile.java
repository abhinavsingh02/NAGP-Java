package exercise.fileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File del = new File("C:\\Users\\abhinavsingh02\\eclipse-workspace\\NAGP JAVA\\demo1.txt");

		if (del.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Filed to delete the file.");
		}

	}

}
