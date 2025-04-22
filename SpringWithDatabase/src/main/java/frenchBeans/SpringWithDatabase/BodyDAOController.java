package frenchBeans.SpringWithDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import frenchBeans.SpringWithDatabase.model.BodyCare;
import frenchBeans.SpringWithDatabase.service.BodyCareService;


@Controller
@RequestMapping("/body")
public class BodyDAOController {
	
	@Autowired
	private BodyCareService bodyService;

	@ResponseBody
	@RequestMapping(value = "/add")
	public BodyCare addProduct(@RequestBody BodyCare productName) {
		
		bodyService.addProduct(productName);
		return productName;
	}
	
	@ResponseBody
	@RequestMapping(value = "/update/{id}")
	public BodyCare updateProduct(@PathVariable("id") int id) {
		BodyCare up = bodyService.getBodyCareById(id);
		bodyService.updateBodyCare(up);
		return up;
	}
	
	@ResponseBody
	@RequestMapping(value = "/get/{id}")
	public BodyCare getBodyCareById(@PathVariable("id") int id) {
		
		BodyCare body = bodyService.getBodyCareById(id);
		return body;
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete/{id}")
	public String removeBodyCare(@PathVariable("id") int id ) {
		
		bodyService.removeBodyCare(id);
		return "Body Care of" + id + "has been deleted";
		
	}
	
}


