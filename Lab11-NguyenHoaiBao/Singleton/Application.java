package lab11.Singleton;

public class Application {
    public static void main(String[] args) {
        Database foo =  Database.getInstance();
        foo.query("Select * from K66A5");
        Database bar = Database.getInstance();
        bar.query("Select * from K66A3");

        System.out.println(foo == bar);
    }
}
