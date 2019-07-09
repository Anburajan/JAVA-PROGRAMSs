
package somename;

public class somename1 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*somename obj = new somename();
        obj.method();
        obj.getX();
        
        obj.setX(97);
        System.out.println(obj.getX());*/
        
        ARConstructors ARObj = new ARConstructors();
        
        
       Singleton a = Singleton.getInstance();
       Singleton b = Singleton.getInstance();
       a.x = a.x + 10;
       System.out.println("Value of a.x = " + a.x);
       System.out.println("Value of b.x = " + b.x);
    }
}
