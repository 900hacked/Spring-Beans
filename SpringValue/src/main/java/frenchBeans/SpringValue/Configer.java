package frenchBeans.SpringValue;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "frenchBeans.SpringValue")
@PropertySource("Application.properties")
public class Configer {

}
