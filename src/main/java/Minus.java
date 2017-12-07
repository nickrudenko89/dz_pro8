public class Minus implements IOperation {
    private double x;
    private double y;

    public Minus() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculate() {
        return x - y;
    }
}
