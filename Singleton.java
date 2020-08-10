public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton get() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.get();
        Singleton secondSingleton = Singleton.get();
        System.out.println(firstSingleton == secondSingleton);
    }
}
