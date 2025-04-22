package frenchBeans.SpringWithDatabase.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frenchBeans.SpringWithDatabase.model.BodyCare;

@Repository
public class BodyCareDAOImpli implements BodyCareDAO{
	
	
	
	@Autowired
	 private SessionFactory sessionFactory;
	
	

	@Override
	public void addProduct(BodyCare productName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.persist(productName);
	}

	@Override
	public void updateBodyCare(BodyCare product) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(product);
		
	}

	@Override
	public BodyCare getBodyCareById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		BodyCare body = (BodyCare) session.get(BodyCare.class, new Integer(id));
		return body;
	}

	@Override
	public void removeBodyCare(int id) {
		Session session = sessionFactory.getCurrentSession();
		BodyCare remove = (BodyCare) session.get(BodyCare.class, new Integer(id));
		if(null != remove){
			session.delete(remove);
		}
	}
		
	

	@Override
	public List<BodyCare> listEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
