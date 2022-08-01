package exercise1;

public class Singleton  {
	double d = Math.PI;
	
    private Singleton() {}

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();

    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}