package beans;

import org.springframework.stereotype.Component;

//@Component("minusOperation")
@Component
public class Minus implements IOperation {
    public Minus() {
    }

    public double calculate(double x, double y) {
        return x - y;
    }
}
