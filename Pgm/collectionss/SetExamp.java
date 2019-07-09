package collectionss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExamp {

	public static void main(String[] args) {

		Set <Integer> set = new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);

		Iterator itr = set.iterator();

		System.out.println(itr.next());
		

	}

}
