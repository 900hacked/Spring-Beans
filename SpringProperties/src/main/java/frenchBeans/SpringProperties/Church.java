package frenchBeans.SpringProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Church {
	
	
	public Church() {
		
	}
	
	private int priestID;
	
	@Value("${app.name}")
	private String priestName;
	
	@Value("${religion.name}")
	private String religion;

	public Church(int priestID, String priestName) {
		
		this.priestID = priestID;
		this.priestName = priestName;
	}

	
	public String father() {
		return priestName;
	}
	
	public String dini() {
		return religion;
	}
	
	public int getPriestID() {
		return priestID;
	}

	public void setPriestID(int priestID) {
		this.priestID = priestID;
	}

	public String getPriestName() {
		return priestName;
	}

	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}


	public String getReligion() {
		return religion;
	}


	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	

}
