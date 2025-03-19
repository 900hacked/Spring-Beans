package frenchBeans.project2;

import org.springframework.stereotype.Component;

@Component
public class Government {
	
	private int ministryId;
	
	private String ministryName;
	
	private String district;
	
	
	public String minister() {
		return "I am the Minister of IT";
	}

	

	public Government() {
		
	}

	public Government(int ministryId, String ministryName) {
		super();
		this.ministryId = ministryId;
		this.ministryName = ministryName;
	}

	public int getMinistryId() {
		return ministryId;
	}

	public void setMinistryId(int ministryId) {
		this.ministryId = ministryId;
	}

	public String getMinistryName() {
		return ministryName;
	}

	public void setMinistryName(String ministryName) {
		this.ministryName = ministryName;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getDistrict() {
		return district;
	}

}
