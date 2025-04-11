package frenchBeans.QualifierSpringBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Confi.class);
		 Menu men = context.getBean(Menu.class);
		 Customer cus = context.getBean(Customer.class);
		 System.out.println(men.food());
		 System.out.println(cus.plate());
		 
	}

}
