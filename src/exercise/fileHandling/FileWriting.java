package exercise.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String text = "Sample text";
		File file = new File("demo1.txt");
		file.createNewFile();
		FileWriter FW = new FileWriter(file);
		FW.write(text);
		FW.close();

	}

}
