
public final class Dog extends Animal {

	Dog() {
		// super(3);
		// System.out.println("Dog Class Constructor");
	}

	public void Bark() {
		System.out.println("Barking..");
	}

	public void noOfLegs() {
		System.out.println("Dog Have Four Legs");
	}

	@Override
	public void scream() {
		System.out.println("scream like a dog.. ");
	}

	public void shout() {
		System.out.println("Bow bow..");
	}

	@Override
	public void finalize() {
		System.out.println("Finalize called..");
	}

}
