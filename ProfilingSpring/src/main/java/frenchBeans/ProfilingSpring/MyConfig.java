package frenchBeans.ProfilingSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = "frenchBeans.ProfilingSpring")
public class MyConfig {

	@Bean
	@Profile("test")
	public Medicine medi() {
		return new Medicine("Panadol","class B");
	}
}
