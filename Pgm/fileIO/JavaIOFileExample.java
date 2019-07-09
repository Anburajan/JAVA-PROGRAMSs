package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaIOFileExample {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\AR\\Desktop\\temp.txt");
		InputStreamReader inr = new InputStreamReader(in,"UTF-8");
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\AR\\Desktop\\temp_new.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
		
		int i = 0;
		while((i = inr.read())!= -1){
			osw.write(i);
		}
		
		osw.flush();
	}

}
