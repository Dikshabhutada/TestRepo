package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	// redirect prefix
    public String one()
	{
		System.out.println("this is one handler");
		return "redirect:/enjoy";
	}
	
	// RedirectView
	/*public RedirectView one()
	{
		System.out.println("this is one handler");
		RedirectView r=new RedirectView();
		r.setUrl("https://www.google.com");
		
		return r;
	}*/
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("this is second handler[enjoy]");
		return "contact";
	}

}
