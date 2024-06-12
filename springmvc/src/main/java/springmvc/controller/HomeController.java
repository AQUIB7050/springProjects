package springmvc.controller;


import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {  //USE OF Model
		System.out.println("This is home url");
		
		model.addAttribute("id", 10);
		model.addAttribute("name","Aquib");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Walter");
		friends.add("Jessy");
		friends.add("Dustin");
		
		model.addAttribute("f", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView about(){  //USING ModelAndView
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("city", "patna");
		modelAndView.setViewName("about");
		return modelAndView;
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is services controller");
		return "services";
	}
	
	@RequestMapping("/help")
	public String help(Model model) { //USE OF jsp EXPRESSION LANGUAGE
		model.addAttribute("food","Italian");
		
		System.out.println("This is help controller");
		return "help";
	}

}
