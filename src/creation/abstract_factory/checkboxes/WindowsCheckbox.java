package creation.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("You have created WindowsCheckbox");
    }
}
