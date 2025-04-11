package frenchBeans.SpringAutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Alcohol {
	
	public Alcohol() {
		
	}
	
	private Bar sip;

	public Bar getSip() {
		return sip;
	}

	public void setSip(Bar sip) {
		this.sip = sip;
	}

	
	@Autowired
	public Alcohol(Bar sip) {
		
		this.sip = sip;
	}
	
	public String restaurant() {
		return sip.food();
	}
	
	

}
