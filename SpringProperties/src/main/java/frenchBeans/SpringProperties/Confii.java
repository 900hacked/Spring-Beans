package frenchBeans.SpringProperties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "frenchBeans.SpringProperties")
@PropertySource("Application.properties")
public class Confii {

}
