package prototypess;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "prototypess")
public class Configured {

	@Bean
	@Scope("prototype")
	public News uganda() {
		return new News();
	}
}
