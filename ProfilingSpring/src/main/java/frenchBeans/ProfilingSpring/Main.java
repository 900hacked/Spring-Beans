package frenchBeans.ProfilingSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;



public class Main {

	public static void main(String[] args) {
        // Set the active profile before creating the context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyConfig.class);
        // Set the active profile
        context.getEnvironment().setActiveProfiles("dev");
      
        // Now refresh the context to apply the active profile
        context.refresh();
        // After refreshing, get the beans and use them
        Medical medic = context.getBean(Medical.class);
//        Medicine drugs = context.getBean(Medicine.class);
        medic.setDoctorsName("John");
        System.out.println(medic.getDoctorsName());
//        drugs.setMedicineName("Panadol");
//        System.out.println(drugs.getMedicineName());
        // Close the context to free resources
        context.close();
        
        
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//    	context.getEnvironment().setActiveProfiles("test");
//    	context.register(MyConfig.class);
//    	context.refresh(); // this reloads the application context to create anly the specified bean
//    	context.getBean(Medicine.class).getMedicineName();
//    	
//    	System.out.println(context.getBean(Medicine.class).getMedicineName());
//    	
//    	context.close();
    }
}


