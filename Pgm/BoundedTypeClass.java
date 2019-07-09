package generics;

public class BoundedTypeClass<T extends Number> {
	private T num;
	public void setNumber(T num) {
		this.num =num;
	}
	
	public boolean isEven() {
		return num.intValue()%2==0;
				
	}

}
