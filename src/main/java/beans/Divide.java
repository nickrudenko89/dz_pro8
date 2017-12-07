package beans;

import org.springframework.stereotype.Component;

@Component
public class Divide implements IOperation {
    public Divide() {
    }

    public double calculate(double x, double y) {
        return x / y;
    }
}
