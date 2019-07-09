package exceptionPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTemp {

	public String example() {
		return "example method called";
	}

	public void method2(ExceptionTemp obj) throws FileNotFoundException,NullPointerException {

		FileReader file = new FileReader("C:\\Users\AR\\Desktop\\Todos.txt");
		obj.example();

	}
}
