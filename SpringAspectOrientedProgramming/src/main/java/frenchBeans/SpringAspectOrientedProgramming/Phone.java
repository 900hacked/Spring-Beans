package frenchBeans.SpringAspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	public Phone() {
		
	}
	
	private String phoneName;
	
	private String userInterface;
	
	public String store() {
		return "Buy phones";
	}

	public Phone(String phoneName, String userInterface) {
		
		this.phoneName = phoneName;
		this.userInterface = userInterface;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getUserInterface() {
		return userInterface;
	}

	public void setUserInterface(String userInterface) {
		this.userInterface = userInterface;
	}
	
	

}
