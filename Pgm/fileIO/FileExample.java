package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		//FileInputStream in = new FileInputStream("C:\\Users\\AR\\Desktop\\temp.txt");
		//FileInputStream in = new FileInputStream(new File("C:\\Users\\AR\\Desktop\\temp.txt"));
		
		File newDir = new File("C:\\Users\\AR\\Desktop\\Directory\\subDirectory");
		
		if(!newDir.exists()){
			newDir.mkdirs();
			System.out.println("File Created : "+newDir.getName());
			System.out.println("At : "+newDir.getAbsolutePath());
		}
		newDir.is
	}

}
