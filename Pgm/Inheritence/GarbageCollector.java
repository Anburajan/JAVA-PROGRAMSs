
public class GarbageCollector {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1 = null;//Here the object to which d3 is pointing to does not have any references anymore so it qualifies for GC
		
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		d2 = d3;//Here d is now pointing to new object. The old one is qualified for garbage collection as it has no reference
		
		new Dog();//This object does not have any references so it can be garbage collected
		
		System.gc();
		
	}

}
