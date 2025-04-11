package singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
		Single glo = context.getBean(Single.class);
		Single gloves = context.getBean(Single.class);
		
		System.out.println(glo==gloves);
		 

	}

}
