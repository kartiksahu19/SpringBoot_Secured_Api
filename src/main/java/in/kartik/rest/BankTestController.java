package in.kartik.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankTestController {
	
	@GetMapping("/")
	public String welcome() {
		
		return "Welcome to SBI Bank....!!";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		 
		return "Funds Transfer Initisted....! ";
	}
	
	@GetMapping("/balance")
	public String Checkbalance() {
		
		return "Your Account Balance :: 10,000 INR ";
	}
	
	@GetMapping("/contact")
	public String contact() {
		
		return "Stat Bank Of India Managing By Indian Cental Govt.";
	}

}
