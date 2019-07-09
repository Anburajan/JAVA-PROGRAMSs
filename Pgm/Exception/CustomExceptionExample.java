package exceptionPackage;

public class CustomExceptionExample {

	public static void main(String[] args) {
		System.out.println("Something1");

		method(15);
		System.out.println("Something2");
		System.out.println("Something3");

	}

	static void method(int age) {
		if (age < 18) {
			try {
				throw new CustomException("Age limit is low , u are not able to apply thins");
			} catch (CustomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
