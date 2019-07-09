
public class TypeCasting {

	public static void main(String[] args) {

		LivingBeing lbObj = new LivingBeing();
		//Animal aniObj = new Animal();
		Dog dogObj = new Dog();
		Cat catObj = new Cat();
		
		//System.out.println(aniObj instanceof Animal);
		Animal a1 = dogObj;
		//Animal a2 = new Dog();
		//LivingBeing lb = dogObj;
		
		System.out.println((Dog)a1 instanceof Dog);//Dog d = aniObj;
		//Dog d1 = lbObj;
		//Dog d2 = catObj;
		
		//Dog d3 = (Dog)catObj;
		//Dog d4 = (Dog)aniObj;
		
		//Dog d5 = (Dog)a1;
		
		//Object obj = aniObj;
		//Object obj1 = (LivingBeing)aniObj;
		//obj2 = (Dog)aniObj;
	}

}
