package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
    @Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user,Model model)//BindingResult result)
	{
		
		/*if(result.hasErrors())
		{
			return "contact";
		}*/
		System.out.println(user);
		int createdUser =this.userService.createUser(user);
		model.addAttribute("msg","User created with id"+createdUser);
		//process
		
		//model.addAttribute("user",user);
		return "success";
	}

}

//First type for writting program
/*@RequestMapping(path = "/processform", method = RequestMethod.POST)
public String handleForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName,
		@RequestParam("password") String userPassword, Model model) {
	System.out.println("user email" + userEmail);
	System.out.println("user name" + userName);
	System.out.println("user password" + userPassword);

	model.addAttribute("name", userName);
	model.addAttribute("email", userEmail);
	model.addAttribute("password", userPassword);
	return "success";
}*/

// Second type for writting program
/*@RequestMapping(path = "/processform", method = RequestMethod.POST)
public String handleForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName,
		@RequestParam("password") String userPassword, Model model)
{
	User user=new User();
	user.setEmail(userEmail);
	user.setUserName(userName);
	user.setPassword(userPassword);
	
	System.out.println(user);
	
	//process
	
	model.addAttribute("user",user);
	return "success";
}
}*/
