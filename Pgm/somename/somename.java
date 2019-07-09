
package somename;

public class somename {
    private int x = 20;
    private int y = 30;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x % 10 == 0)
        this.x = x;
        else
            this.x = 0;
    }

    public int getY() {
        return y;
    }
    
    public void method(){
    System.out.println(x + y);
    }
}
