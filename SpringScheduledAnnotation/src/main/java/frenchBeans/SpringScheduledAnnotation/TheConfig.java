package frenchBeans.SpringScheduledAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@ComponentScan(basePackages = "frenchBeans.SpringScheduledAnnotation")
@EnableScheduling
public class TheConfig {

}
