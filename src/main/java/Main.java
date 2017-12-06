import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext fileSystemXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
        Calculator calc = (Calculator) fileSystemXmlApplicationContext.getBean("calc");
        System.out.println(calc.calculate(4, -15, 9));
    }
}
