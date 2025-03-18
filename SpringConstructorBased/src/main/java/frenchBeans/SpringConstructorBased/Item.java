package frenchBeans.SpringConstructorBased;

public class Item implements Peep {

	@Override
	public String wall() {
		
		return "I am building a wall";
	}

	@Override
	public int measure() {
		
		return 67;
	}

	
}
