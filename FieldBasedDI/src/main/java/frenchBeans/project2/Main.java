package frenchBeans.project2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Main {
	
	public static void main(String[] args) {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configa.class);
	Government gov = context.getBean(Government.class);
	 Offices off = context.getBean(Offices.class);
	 
	 System.out.println(off.mini());
	 System.out.println(gov.minister());
	 
	}
}
