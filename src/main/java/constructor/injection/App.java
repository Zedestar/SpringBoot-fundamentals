package constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("constructorInject.xml");

        Car car = (Car) context.getBean("myCar");
        Specification specification = (Specification) context.getBean("mySpecification");
        System.out.println(car);
        System.out.println(specification);
    }
}
