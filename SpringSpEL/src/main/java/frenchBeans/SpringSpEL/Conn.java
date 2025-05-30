package frenchBeans.SpringSpEL;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "frenchBeans.SpringSpEL")
@PropertySource("Application.properties")
public class Conn {

}
