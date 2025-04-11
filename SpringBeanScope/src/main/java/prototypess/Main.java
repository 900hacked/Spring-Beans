package prototypess;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configured.class);
		News ubc = context.getBean(News.class);
		News bbc = context.getBean(News.class);
		
		System.out.println(ubc==bbc);

	}

}
