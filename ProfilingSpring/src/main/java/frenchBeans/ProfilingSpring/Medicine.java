package frenchBeans.ProfilingSpring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class Medicine {
	
	public Medicine() {
		
	}

	private String medicineName;
	
	private String medicineClass;

	public Medicine(String medicineName, String medicineClass) {
		
		this.medicineName = medicineName;
		this.medicineClass = medicineClass;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineClass() {
		return medicineClass;
	}

	public void setMedicineClass(String medicineClass) {
		this.medicineClass = medicineClass;
	}
	
	
}
