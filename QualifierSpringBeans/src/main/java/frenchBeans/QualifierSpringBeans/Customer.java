package frenchBeans.QualifierSpringBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired 
	@Qualifier("menu")
	private Restaurant rest;
	
	public String plate() {
		return rest.food();
	}

}
