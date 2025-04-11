package frenchBeans.QualifierSpringBeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Workers implements Restaurant {

	@Override
	public String food() {
		// TODO Auto-generated method stub
		return "Pasta";
	}

	@Override
	public String drinks() {
		// TODO Auto-generated method stub
		return "Juice";
	}

}
