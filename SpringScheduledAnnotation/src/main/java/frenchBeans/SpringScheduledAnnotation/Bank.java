package frenchBeans.SpringScheduledAnnotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	
	public Bank() {
		
	}
	
	private String bankName;
	
	
	private String location;

	public Bank(String bankName, String location) {
		
		this.bankName = bankName;
		this.location = location;
	}
	
//	@Scheduled(fixedDelay = 5000)
//	public void  money() {
//		System.out.println("Money will come");
//		
//	}
//	
//	@Scheduled(fixedRate = 5000)
//	public void  loans() {
//		System.out.println("you have to fit our requirements to get a loan");
//		
//	}
	
//	@Scheduled(fixedDelay = 4000, initialDelay = 7000)
//	public void  savings() {
//		System.out.println("Save your money with us");
//		
//	}
	
	
	//This is scheduled to run at 11:20 of the 15th of every month
	//it accepts the 24 hour clock
////	@Scheduled(cron = "0 11 14 9 * ?")
////	public void  currency() {
////		System.out.println("Uganda Shillings");
//		
//	}
	
	//this is scheduled to print following UK time
	@Scheduled(cron = "0 20 12 9 * ?", zone = "Europe/London")
	public void  area() {
		System.out.println("Kampla Road");
		
	}
	
	
	
	

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
