package frenchBeans.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Main {
	
	@Autowired
    private ApplicationContext applicationContext;
    public void start() {
    	Government myService = (Government) applicationContext.getBean("government");
    }
    
    
}
