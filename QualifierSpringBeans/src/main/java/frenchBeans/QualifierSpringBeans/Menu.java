package frenchBeans.QualifierSpringBeans;

import org.springframework.stereotype.Component;

@Component

public class Menu implements Restaurant{

	@Override
	public String food() {
		// TODO Auto-generated method stub
		return "Burgers";
	}

	@Override
	public String drinks() {
		// TODO Auto-generated method stub
		return "Fanta";
	}

}
