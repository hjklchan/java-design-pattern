package creation.abstract_factory;

import creation.abstract_factory.buttons.Button;
import creation.abstract_factory.checkboxes.Checkbox;
import creation.abstract_factory.factories.GUIFactory;
import creation.abstract_factory.factories.MacOSGUIFactory;
import creation.abstract_factory.factories.WindowsGUIFactory;

public class Main {

    public static void main(String[] args) {
        Application application = new Application(new WindowsGUIFactory());
        application.execRender();
    }

}

class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void execRender() {
        button.render();
        checkbox.render();
    }
}
