package structural.composite.shapes;

import java.awt.*;

public abstract class BaseShape implements Shaper {
    public int x, y;

    public Color color;
    private boolean selected = false;
}
