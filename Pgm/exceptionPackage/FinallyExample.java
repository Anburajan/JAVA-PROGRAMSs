package exceptionPackage;

public class FinallyExample {

	public static void main(String[] args) {

		Object obj = null;

		try {
				obj.toString();
		} catch (NullPointerException e) {
			e.printStackTrace();
		/*}finally{
			//Disconnect from DB
			//Release the system resource
			System.out.println("Finally block");*/ 
		}

	}
}
