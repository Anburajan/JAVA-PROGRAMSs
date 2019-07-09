package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ImageCopyExample {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\AR\\Desktop\\mypic.jpg");
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\AR\\Desktop\\mypic_copy.jpg");
		
		int i = 0;
		while((i = in.read())!= -1){
			out.write(i);
		}
	}

}
