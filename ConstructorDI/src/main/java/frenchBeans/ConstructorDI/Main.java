package frenchBeans.ConstructorDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		 Protons vac = context.getBean(Electrons.class);
		 Kinetic tic = context.getBean(Impli.class);
		System.out.println(vac.white());
		System.out.println(vac.red());
		System.out.println(tic.energy());
		

	}

}
