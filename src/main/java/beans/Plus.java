package beans;

import org.springframework.stereotype.Component;

@Component
public class Plus implements IOperation {
    public Plus() {
    }

    public double calculate(double x, double y) {
        return x + y;
    }
}
