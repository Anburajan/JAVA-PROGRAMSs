package exceptionPackage;

import java.io.FileNotFoundException;

public class ExceptionExample2 {
	 
	public static void main(String[] args) {
		ExceptionTemp obj = new ExceptionTemp();

		method(obj);
	}

	static void method(ExceptionTemp obj) throws FileNotFoundException, NullPointerException 
		obj.method2(obj);
	}

}
