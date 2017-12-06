public class Multiply {
    private double x;
    private double y;

    public Multiply() {
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
        return x * y;
    }

    public double calculate(double z) {
        return z * x * y;
    }
}
