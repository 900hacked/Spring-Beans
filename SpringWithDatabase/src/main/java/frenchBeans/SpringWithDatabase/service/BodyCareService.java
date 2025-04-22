package frenchBeans.SpringWithDatabase.service;

import java.util.List;

import frenchBeans.SpringWithDatabase.model.BodyCare;

public interface BodyCareService {

public void addProduct(BodyCare productName);
	
	public void updateBodyCare(BodyCare product);
	
	public BodyCare getBodyCareById(int id);
	
	public void removeBodyCare(int id);
	
	public List<BodyCare> listEmployees();
	
}
