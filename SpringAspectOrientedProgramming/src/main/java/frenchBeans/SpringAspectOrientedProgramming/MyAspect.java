package frenchBeans.SpringAspectOrientedProgramming;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class MyAspect {
	
//	@Before("execution(* frenchBeans.SpringAspectOrientedProgramming.Apps.*(..))")
//	 public void beforeAdvice() {
//	 System.out.println("Before advice is executed!");
//	}
//	
//	@Before("execution(* frenchBeans.SpringAspectOrientedProgramming.Phone.*(..))")
//	 public void beforePhone() {
//	 System.out.println("Android or IOS");
//	}
	
//	@After("execution(* frenchBeans.SpringAspectOrientedProgramming.Phone.*(..))")
//	 public void afterOrder() {
//	 System.out.println("Thank you for shopping with us.");
//			   
//	 }
	
	@Before("execution(public String frenchBeans.SpringAspectOrientedProgramming.Phone.store())") //specifies pointcut
	 public void log() {
		 System.out.println("Logging some advice");
	 }

}
