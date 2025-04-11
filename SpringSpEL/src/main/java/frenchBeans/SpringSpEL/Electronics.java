package frenchBeans.SpringSpEL;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Electronics {
	
	public Electronics() {
		
	}

	@Value("#{systemProperties['priority'] ?: 'smartTv'}")
	private String gadgetName;
	
	@Value("#{systemProperties['factory']}")
	private String manufacturer;

	@Value("#{'${listOfValues}'.split(',')}")
	private List<String> games;
	
	@Value("#{${valuesMap}}")
	private Map<String,Integer> countries;
	
	public Electronics(String gadgetName, String manufacturer, List<String> games, Map<String,Integer> countries) {
		
		this.gadgetName = gadgetName;
		this.manufacturer = manufacturer;
		this.games = games;
		this.countries = countries;
	}

	public String getGadgetName() {
		return gadgetName;
	}

	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<String> getGames() {
		return games;
	}

	public void setGames(List<String> games) {
		this.games = games;
	}

	public Map<String, Integer> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, Integer> countries) {
		this.countries = countries;
	}
	
	
}
