package frenchBeans.project1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configs.class);
	 Toys toy = context.getBean(Toys.class);
	 Store store = context.getBean(Store.class);
	 
	 System.out.println(toy.block());
	 store.setRobots(new Toys(2,"Boat"));
	 System.out.println(store.getRobots());
	 
	}
}
