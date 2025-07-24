package setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterInjection.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }
}
