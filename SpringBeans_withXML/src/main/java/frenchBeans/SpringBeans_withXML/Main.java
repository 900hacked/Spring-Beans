package frenchBeans.SpringBeans_withXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Load the Spring configuration from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrieve the bean from the context
        Work work = (Work) context.getBean("work");
        Lib lib = (Lib) context.getBean("lib");
        // Call a method on the bean
       System.out.println(work.sentence());
       System.out.println(lib.me());

	}

}
