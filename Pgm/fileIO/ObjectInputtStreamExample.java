package fileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputtStreamExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		DogObject dogObj = null;
		FileInputStream fis = new FileInputStream("C:\\Users\\AR\\Desktop\\object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		dogObj = (DogObject)ois.readObject();
		
		dogObj.bark();
		System.out.println(dogObj.getColor());
	}

}