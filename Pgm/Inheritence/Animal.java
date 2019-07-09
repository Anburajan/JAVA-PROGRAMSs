
public abstract class Animal extends LivingBeing {

	static {

		// System.out.println("Static Block");
	}

	Animal() {
		// super();
		// Instance init block
		// System.out.println("Animal Class Constructor");
	}

	Animal(int x) {
		System.out.println("Animal Class Constructor");
	}

	Animal(int x, int y) {
		System.out.println("Animal Class Constructor");
	}

	static void somemeth() {
		System.out.println("static meth");
	}

	{

		// System.out.println("Instance Init Block");
	}

	public void walk() {
		System.out.println("Walking..");
	}

	public void sleep() {
		System.out.println("Sleeping..");
	}

	public void scream() {
		System.out.println("screaming.. ");
	}

	public abstract void shout();
}
