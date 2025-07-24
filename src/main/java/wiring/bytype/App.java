package wiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowiringByType.xml");
      Book book = (Book) context.getBean("blessingBook");
      System.out.println(book);
    }
}
