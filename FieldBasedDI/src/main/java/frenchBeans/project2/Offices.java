package frenchBeans.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Offices {

	
	@Autowired
	private Government govt;
	
	public String mini() {
		govt.setMinistryName("Ministry Of ICT");
		
		return govt.getMinistryName();
	}
}
