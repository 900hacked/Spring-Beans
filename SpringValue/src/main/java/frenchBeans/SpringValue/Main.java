package frenchBeans.SpringValue;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configer.class);
		 Movies mov = context.getBean(Movies.class);
		 
		 System.out.println(mov.getMovieName());
		 System.out.println(mov.getGenre());
	}

}
