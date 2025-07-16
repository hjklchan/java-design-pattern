package structural.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // 是否刚好合适
    public boolean fits(RoundPeg peg) {
        return getRadius() >= peg.getRadius();
    }
}
