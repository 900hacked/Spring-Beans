package frenchBeans.SpringAspectOrientedProgramming;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "frenchBeans.SpringAspectOrientedProgramming")
@EnableAspectJAutoProxy
public class TheConfigz {

}
