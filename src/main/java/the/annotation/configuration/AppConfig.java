package the.annotation.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "the.annotation.configuration")
public class AppConfig {
}
