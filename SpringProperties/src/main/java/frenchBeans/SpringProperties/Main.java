package frenchBeans.SpringProperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Confii.class);
		 Church chur = context.getBean(Church.class);
		 chur.setPriestName("Tony");
		
//		 chur.setPriestName("Mark");
		 System.out.println(chur.father());
		 System.out.println(chur.dini());
		 
		 
		 

	}

}
