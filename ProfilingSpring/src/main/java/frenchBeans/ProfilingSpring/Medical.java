package frenchBeans.ProfilingSpring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!prod & !test")
public class Medical {
	
	public  Medical() {
		
	}

	private String doctorsName;
	
	private String patientsName;
	
	private String sickness;

	public Medical(String doctorsName, String patientsName, String sickness) {
		super();
		this.doctorsName = doctorsName;
		this.patientsName = patientsName;
		this.sickness = sickness;
	}

	public String getDoctorsName() {
		return doctorsName;
	}

	public void setDoctorsName(String doctorsName) {
		this.doctorsName = doctorsName;
	}

	public String getPatientsName() {
		return patientsName;
	}

	public void setPatientsName(String patientsName) {
		this.patientsName = patientsName;
	}

	public String getSickness() {
		return sickness;
	}

	public void setSickness(String sickness) {
		this.sickness = sickness;
	}
	
	
	
	
}
