package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        
        byte a = 65; 
        
        byte b = -30; 
        
     
        System.out.println("~a : "+ ~a);        
        
        System.out.println("a & b : "+ (a & b));
        
       
        System.out.println("a | b : "+ (a | b));     
     
      	System.out.println("b >>> 2 : "+ (b >>> 2));
                                                          
    }
     
}