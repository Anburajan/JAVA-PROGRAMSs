package fileIO;

import java.io.IOException;
import java.util.Scanner;

public class StandardIO {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter firstname : ");
		String firstName = scanner.nextLine();
		
		System.out.print("Enter lastname : ");
		String lastName = scanner.nextLine();
		
		System.out.println("You fullname is : "+firstName+" "+ lastName);
		
		System.err.println("You fullname is : "+firstName+" "+ lastName);
	}

}
