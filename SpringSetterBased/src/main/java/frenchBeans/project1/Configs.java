package frenchBeans.project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "frenchBeans.project1")
public class Configs {
	
	@Bean
    public Toys service() {
        return new Toys();  // Create and return the Service bean
    }

	@Bean
	public Store store() {
		Store store = new Store();
		
		store.setRobots(service());
		
		return store;
	}
}
