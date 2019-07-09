package fileIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) throws IOException {

		byte[] byteArySource = { 65, 66, 87, 37 };
		//byte[] byteAryDestination = {};

		//String s = "Apple";
		//byte[] byteArySource = s.getBytes();

		ByteArrayInputStream bais = new ByteArrayInputStream(byteArySource);
		//ByteArrayOutputStream out = new ByteArrayOutputStream();

		int i = 0;

		while ((i = bais.read()) != -1) {
			System.out.print((char) i);
			//out.write(i);
		}

	/*	byteAryDestination = out.toByteArray();

		for (int j = 0; j < byteAryDestination.length; j++)
			System.out.print((char) byteAryDestination[j]);*/

	}

}