package generics;

public class BoundedTypeExmo {
	public static void main(String[] args) {
		Integer i=20;
		Double d=40.5;
		Byte b=120;
		String str="KING";
		Character ch= 'A';
		
		doMath(i);
		doMath(d);
		doMath(b);
		//doMath(str); compile time error same as char
		
		BoundedTypeClass<Integer> obj = new BoundedTypeClass<>();
		//BoundedTypeClass<String> obj = new BoundedTypeClass<>();

		
		
	}

	 static <T extends Number> void doMath (T var) {
		 System.out.println(var.intValue()*100);
		// TODO Auto-generated method stub
		
	}


}
