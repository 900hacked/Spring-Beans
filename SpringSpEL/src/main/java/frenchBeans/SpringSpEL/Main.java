package frenchBeans.SpringSpEL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		System.setProperty("priority", "Playstation");
		System.setProperty("factory", "Sony");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conn.class);
		 Electronics elec = context.getBean(Electronics.class);
		 Shoes shoe = context.getBean(Shoes.class);
		
		 System.out.println(elec.getGadgetName());
		 System.out.println(shoe.getCompany());
		 System.out.println(elec.getGames());
		 System.out.println(elec.getCountries());
	}

}
