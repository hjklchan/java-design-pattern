package creation.abstract_factory.factories;

import creation.abstract_factory.buttons.Button;
import creation.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
