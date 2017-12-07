package beans;

import org.springframework.stereotype.Component;

@Component
public class Multiply implements IOperation {

    public Multiply() {
    }

    public double calculate(double x, double y) {
        return x * y;
    }
}
