package singleton;

import org.springframework.stereotype.Component;


public class Single {
	
	public Single() {
		
	}
	
	private String quantity;
	
	private String name;
	
	public String plural() {
		return "they are a lot of Items";
		
	}

	
	public Single(String quantity, String name) {
		super();
		this.quantity = quantity;
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
