
public class InheritanceExample {

	public static void main(String[] args) {

		Dog dogObj = new Dog();
		// Behaviour of Living Being
		dogObj.breath();
		dogObj.respond();

		// Behaviour of Animal
		dogObj.walk();
		dogObj.sleep();

		// Behaviour of Dog
		dogObj.Bark();

		
		
		Cat catObj = new Cat();
		// Behaviour of Living Being
		catObj.breath();
		catObj.respond();

		// Behaviour of Animal
		catObj.walk();
		catObj.sleep();

		// Behaviour of Dog
		catObj.Meow();
	}

}
