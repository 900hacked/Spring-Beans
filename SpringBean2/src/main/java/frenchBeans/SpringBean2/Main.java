package frenchBeans.SpringBean2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
		Vaccancies vac = context.getBean(Vaccancies.class);
		System.out.println(vac.word());

	}

}
