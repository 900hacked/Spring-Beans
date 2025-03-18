package frenchBeans.SpringBean2;

import org.springframework.stereotype.Component;

@Component
public class Vaccancies {
	
	public String word() {
		return "YES SIR";
	}

	private int vaccancyId;
	
	private String jobVaccancies;
	
	public Vaccancies() {
		
	}

	public Vaccancies(int vaccancyId, String jobVaccancies) {
		
		this.vaccancyId = vaccancyId;
		this.jobVaccancies = jobVaccancies;
	}

	public int getVaccancyId() {
		return vaccancyId;
	}

	public void setVaccancyId(int vaccancyId) {
		this.vaccancyId = vaccancyId;
	}

	public String getJobVaccancies() {
		return jobVaccancies;
	}

	public void setJobVaccancies(String jobVaccancies) {
		this.jobVaccancies = jobVaccancies;
	}
	
	
	
	
}
