package lab14.bridge.uml;

public class TestMain {
    public static void main(String[] args) {
        Computer computer = new PC(new WindowsOS());
        computer.startUp();
        computer.browseInternet("facebook.com");

        Computer computer1 = new Laptop(new MacOS());
        computer1.startUp();
        computer1.browseInternet("youtube.com");
        if (computer1.canMoveComputer()) {
            System.out.println("Move to another place");
        }
    }
}
