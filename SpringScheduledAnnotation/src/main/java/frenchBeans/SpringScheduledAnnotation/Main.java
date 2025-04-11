package frenchBeans.SpringScheduledAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TheConfig.class);
		 Bank bank = context.getBean(Bank.class);

		 bank.setBankName("ABSA");
		 System.out.println(bank.getBankName());
		 
//		 bank.money();
//		 
//		 bank.loans();
		 
//		 bank.savings();
		 
//		 bank.currency();
		 
		 bank.area();
	}

}
