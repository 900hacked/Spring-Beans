package frenchBeans.SpringAspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component
public class Apps {
	
	public Apps() {
		
	}
	
	private String appName;
	
	private String group;
	
	public String appStore() {
		return "Download apps";
	}

	public Apps(String appName, String group) {
		
		this.appName = appName;
		this.group = group;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	
	

}
