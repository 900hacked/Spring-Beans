package frenchBeans.SpringSpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shoes {
	
	public Shoes() {
		
	}

	private String shoeName;
	
	@Value("#{electronics.gadgetName}")
	private String company;

	public Shoes(String shoeName, String company) {
		
		this.shoeName = shoeName;
		this.company = company;
	}

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
