package frenchBeans.project1;

public class Toys {

	private int toyId;
	
	private String toyName;
	
	public String block() {
		return "Toy Factory";
		
		}
	
	public int number() {
		return 40;
	}
	
	public Toys() {
		
	}

	public Toys(int toyId, String toyName) {
		super();
		this.toyId = toyId;
		this.toyName = toyName;
	}

	public int getToyId() {
		return toyId;
	}

	public void setToyId(int toyId) {
		this.toyId = toyId;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	@Override
	public String toString() {
		return "Toys [toyId=" + toyId + ", toyName=" + toyName + "]";
	}
	
	
	
	
}
