
public class Cat extends Animal{
	public void Meow(){
		System.out.println("Meow..");
	}
	
	public void run(){
		System.out.println("Running at 10 KM/Hour..");
	}
	
	public void run(int speed){
		System.out.println("Dog is chasing : Running Faster at"+speed+"KM/hour..");
	}
	
	public void scream(){
		System.out.println("scream like a cat.. ");
	}
	
	public void shout(){
		System.out.println("Ppurr.. ");
	}
	
	@Override
	public String toString(){
		return "Cat Object";
	}
}
