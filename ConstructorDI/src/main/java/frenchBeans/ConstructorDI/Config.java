package frenchBeans.ConstructorDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "frenchBeans.ConstructorDI")
public class Config {

	@Bean
	public Protons pro() {
		return new Electrons();
	}
	
	@Bean
	public Kinetic kin() {
		return new Impli();
	}
}
