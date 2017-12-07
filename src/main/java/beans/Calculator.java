package beans;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Calculator {
    @Resource(name = "plus")
    private IOperation plus;
    @Resource(name = "minus")
    private IOperation minus;
    @Resource(name = "multiply")
    private IOperation multiply;
    @Resource(name = "divide")
    private IOperation divide;

    public Calculator() {
    }

    public IOperation getPlus() {
        return plus;
    }

    public void setPlus(IOperation plus) {
        this.plus = plus;
    }

    public IOperation getMinus() {
        return minus;
    }

    public void setMinus(IOperation minus) {
        this.minus = minus;
    }

    public IOperation getMultiply() {
        return multiply;
    }

    public void setMultiply(IOperation multiply) {
        this.multiply = multiply;
    }

    public IOperation getDivide() {
        return divide;
    }

    public void setDivide(IOperation divide) {
        this.divide = divide;
    }

    public String calculate(double a, double b, double c) {
        double D = 0.0, x1 = 0.0, x2 = 0.0;
        //ax2+bx+c=0
        //D=b2-4ac
        //x1=(-b+sqrt(D))/2a   x2=(-b-sqrt(D))/2a
        D = minus.calculate(multiply.calculate(b,b),multiply.calculate(4,multiply.calculate(a,c)));
        if (D < 0) {
            return "Так как дискриминант меньше нуля, то уравнение не имеет действительных решений.";
        }
        x1 = divide.calculate(plus.calculate(-b,Math.sqrt(D)),multiply.calculate(2,a));
        x2 = divide.calculate(minus.calculate(-b,Math.sqrt(D)),multiply.calculate(2,a));
        return "x1: " + String.valueOf(x1) + " x2: " + String.valueOf(x2);
    }
}
