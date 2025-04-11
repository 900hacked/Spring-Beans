package frenchBeans.ProfileSpringXML;

import org.springframework.stereotype.Component;

@Component
public class Farm {
	
	public Farm() {
		
	}
	
	public String farmName;
	
	public String vegetables;
	
	public String animals;

	public Farm(String farmName, String vegetables, String animals) {
		
		this.farmName = farmName;
		this.vegetables = vegetables;
		this.animals = animals;
	}

	public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	public String getVegetables() {
		return vegetables;
	}

	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}

	public String getAnimals() {
		return animals;
	}

	public void setAnimals(String animals) {
		this.animals = animals;
	}
	
	

}
