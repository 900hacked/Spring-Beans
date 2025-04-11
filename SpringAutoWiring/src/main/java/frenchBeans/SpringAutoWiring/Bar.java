package frenchBeans.SpringAutoWiring;

import org.springframework.stereotype.Component;

@Component
public class Bar {
	
	public Bar() {
		
	}
	
	private String barEmployees;
	
	private String barDrinks;
	
	public String food() {
		return "We serve food too";
	}

	public Bar(String barEmployees, String barDrinks) {
		
		this.barEmployees = barEmployees;
		this.barDrinks = barDrinks;
	}

	public String getBarEmployees() {
		return barEmployees;
	}

	public void setBarEmployees(String barEmployees) {
		this.barEmployees = barEmployees;
	}

	public String getBarDrinks() {
		return barDrinks;
	}

	public void setBarDrinks(String barDrinks) {
		this.barDrinks = barDrinks;
	}
	
	

}
