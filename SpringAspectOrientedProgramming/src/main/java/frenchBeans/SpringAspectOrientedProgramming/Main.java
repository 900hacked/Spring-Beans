package frenchBeans.SpringAspectOrientedProgramming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TheConfigz.class);
//		 Apps app = context.getBean(Apps.class);
		 Phone phone = context.getBean(Phone.class);
		 
//		 System.out.println(app.appStore());
		 System.out.println(phone.store());
		 
		 
		 
		 
		 
	}

}
