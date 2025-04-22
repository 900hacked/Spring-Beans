package frenchBeans.SpringWithDatabase.DAO;

import java.util.List;

import frenchBeans.SpringWithDatabase.model.BodyCare;

public interface BodyCareDAO {

public void addProduct(BodyCare productName);
	
	public void updateBodyCare(BodyCare product);
	
	public BodyCare getBodyCareById(int id);
	
	public void removeBodyCare(int id);
	
	public List<BodyCare> listEmployees();
	
	
}
