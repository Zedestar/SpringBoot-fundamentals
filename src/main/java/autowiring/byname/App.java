package autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowiringByName.xml");
      Book book = (Book) context.getBean("myBook");
      System.out.println(book);
    }
}
