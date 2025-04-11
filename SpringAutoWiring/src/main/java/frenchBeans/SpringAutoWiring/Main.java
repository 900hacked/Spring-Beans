package frenchBeans.SpringAutoWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configured.class);
		Bar bars = context.getBean(Bar.class);
		 Alcohol alc = context.getBean(Alcohol.class);
		 
		 
		System.out.println(alc.restaurant());

	}

}
