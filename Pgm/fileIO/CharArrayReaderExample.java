package fileIO;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample {

	public static void main(String[] args) throws IOException {
		char[] charAry = { 'a', 'p', 'p', 'l', 'e' };

		CharArrayReader car = new CharArrayReader(charAry);

		int i = 0;

		while ((i = car.read()) != -1) {
			System.out.print((char) i);
		}
	}

}
