package singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "singleton")
public class Configure {

	@Bean
	@Scope("singleton")
	public Single sin() {
		return new Single();
	}
}
