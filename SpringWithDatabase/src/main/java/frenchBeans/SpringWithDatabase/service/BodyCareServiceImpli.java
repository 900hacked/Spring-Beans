package frenchBeans.SpringWithDatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import frenchBeans.SpringWithDatabase.DAO.BodyCareDAO;
import frenchBeans.SpringWithDatabase.model.BodyCare;

@Service
public class BodyCareServiceImpli implements BodyCareService {
	
	
	
	@Autowired
	private BodyCareDAO bodyDAO;

	@Override
	@Transactional
	public void addProduct(BodyCare productName) {
		// TODO Auto-generated method stub
		bodyDAO.addProduct(productName);
		
	}

	@Override
	@Transactional
	public void updateBodyCare(BodyCare product) {
		// TODO Auto-generated method stub
		bodyDAO.updateBodyCare(product);
		
	}

	@Override
	@Transactional
	public BodyCare getBodyCareById(int id) {
		// TODO Auto-generated method stub
		BodyCare get = bodyDAO.getBodyCareById(id);
		return get;
	}

	@Override
	@Transactional
	public void removeBodyCare(int id) {
		// TODO Auto-generated method stub
		bodyDAO.removeBodyCare(id);
		
	}

	@Override
	@Transactional
	public List<BodyCare> listEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
