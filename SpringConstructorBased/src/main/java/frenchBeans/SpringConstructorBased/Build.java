package frenchBeans.SpringConstructorBased;



public class Build {
	
	public Peep myPeep;
	
	public String bob() {
		this.myPeep = new Item();
		return myPeep.wall();
	}

	public static void main(String[] args) {
		
		
		Build build = new Build();
		System.out.println(build.bob());
	}
}
