package frenchBeans.ProfileSpringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        
		context.getEnvironment().setActiveProfiles("dev");
	      
        // Now refresh the context to apply the active profile
        context.refresh();
        Farm farm = (Farm) context.getBean("farm");
        
        farm.setAnimals("cow");
        System.out.println(farm.getAnimals());

        context.close();
	}

}
