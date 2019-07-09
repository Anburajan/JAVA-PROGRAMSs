package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {

	public static void main(String[] args) {

		DogObject dogObj = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			dogObj = new DogObject("Brown");
			fos = new FileOutputStream("C:\\Users\\AR\\Desktop\\object.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(dogObj);
		} catch (IOException e) {
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
