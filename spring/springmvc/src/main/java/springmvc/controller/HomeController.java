package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("this is home url");
		//data send from controller to view using model
		model.addAttribute("name","Diksha Bhutada");
		
		model.addAttribute("id",43625);
		
		List<String> friend=new ArrayList<String>();
		friend.add("saurav");
		friend.add("adii");
		friend.add("yash");
		model.addAttribute("f",friend);
		
		// marks
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		model.addAttribute("mark",list);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return "about";
	}
	// data send from controller to view by modelandview
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help controller");
		//creating model and view object
		ModelAndView modelandview=new ModelAndView();
		//setting the data
		modelandview.addObject("name","diksha");
		modelandview.addObject("id",546773);
		LocalDateTime now=LocalDateTime.now();
		modelandview.addObject("time",now);
	
		//setting view name
		modelandview.setViewName("help");
		return modelandview;
	}
	
}
