package collectionss;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {

		Myown o1 = new Myown(10);
		Myown o2 = new Myown(10);
		Myown o3 = new Myown(10);
		ArrayList<Myown> list = new ArrayList<>();

		list.add(o1);
		list.add(o2);
		list.add(o3);

		System.out.println(list);

	}

}
