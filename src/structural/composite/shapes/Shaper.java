package structural.composite.shapes;

import java.awt.*;

public interface Shaper {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelect();
    void paint(Graphics graphics);
}
