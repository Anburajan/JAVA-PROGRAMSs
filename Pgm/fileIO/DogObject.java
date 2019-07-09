package fileIO;

import java.io.Serializable;

public class DogObject implements Serializable{

	String color;  
	 
	 public DogObject(String color) {  
	  this.color = color;  
	 } 
	 
	 public String getColor() {
		return color;
	}

	public void bark(){
		 System.out.println("Barking..");
	 }

}
