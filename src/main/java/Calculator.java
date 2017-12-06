public class Calculator {
    private Plus plus;
    private Minus minus;
    private Multiply multiply;
    private Divide divide;

    public Calculator() {
    }

    public Plus getPlus() {
        return plus;
    }

    public void setPlus(Plus plus) {
        this.plus = plus;
    }

    public Minus getMinus() {
        return minus;
    }

    public void setMinus(Minus minus) {
        this.minus = minus;
    }

    public Multiply getMultiply() {
        return multiply;
    }

    public void setMultiply(Multiply multiply) {
        this.multiply = multiply;
    }

    public Divide getDivide() {
        return divide;
    }

    public void setDivide(Divide divide) {
        this.divide = divide;
    }

    public String calculate(double a, double b, double c) {
        double D = 0.0, x1 = 0.0, x2 = 0.0;
        //ax2+bx+c=0
        //D=b2-4ac
        //x1=(-b+sqrt(D))/2a   x2=(-b-sqrt(D))/2a
        multiply.setX(b);
        multiply.setY(b);
        minus.setX(multiply.calculate());
        multiply.setX(a);
        multiply.setY(c);
        minus.setY(multiply.calculate(4));
        D = minus.calculate();
        if (D < 0) {
            return "Так как дискриминант меньше нуля, то уравнение не имеет действительных решений.";
        }
        plus.setX(-b);
        plus.setY(Math.sqrt(D));
        divide.setX(plus.calculate());
        multiply.setX(2);
        multiply.setY(a);
        divide.setY(multiply.calculate());
        x1 = divide.calculate();
        minus.setX(-b);
        minus.setY(Math.sqrt(D));
        divide.setX(minus.calculate());
        x2 = divide.calculate();
        return "x1: " + String.valueOf(x1) + " x2: " + String.valueOf(x2);
    }
}
