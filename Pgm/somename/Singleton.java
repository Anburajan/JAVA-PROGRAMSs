package somename;

class Singleton {

    static Singleton obj = null;
    int x = 10;

    // private constructor can't be accessed outside the class
    private Singleton() {
    }

    // Factory method to provide the users with instances
    static public Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }

        return obj;
    }
}
