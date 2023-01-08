package lab12.factory.pseudocode;

public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Render a checkbox in macOS style");
    }
}
