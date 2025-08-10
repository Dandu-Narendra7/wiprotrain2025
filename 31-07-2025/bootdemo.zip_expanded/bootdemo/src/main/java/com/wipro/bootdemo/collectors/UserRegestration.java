package com.wipro.bootdemo.collectors;


	import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;


	@Controller
	@RequestMapping("/user")
	public class UserRegestration {
	
		
		@GetMapping("/UserName")
		String showUserName(Model m)
		{
			return "UserName";
		}
		
		@PostMapping("/UserNamesubmit")
		String submitUserNameForm(@ModelAttribute("logindata") User user,Model m)
		{
			System.out.println(user);
			return "usersuccess";
		}
		
		@PostMapping("/testsubmit")
		String submitTestLoginForm(@ModelAttribute("logindata") User user,Model m)
		{
			 System.out.println("Test Submit");
			 System.out.println();
			return "usersuccess";
		}

}
