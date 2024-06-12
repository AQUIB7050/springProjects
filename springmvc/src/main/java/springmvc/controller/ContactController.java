package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String contact() {
		return "contact";
	}

	// STORING DATA USING HttpServletRequest(OLD WAY)

//	@RequestMapping(path = "/processform" ,method=RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		String name = request.getParameter("name");
//		System.out.println(name);
//		return "";
//	}

	// STORING DATA USING @RequestParam

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			@RequestParam("name") String name, 
//			@RequestParam("email") String email,
//			@RequestParam("password") String password, Model model) {
//		
//		//HERE WE CAN ADD PROCESS FOR DATABASE
//		
//		model.addAttribute("userName", name);
//		model.addAttribute("userEmail", email);
//		model.addAttribute("userPassword", password);
//		
//		
//		return "success";
//	}

	// FIRST USE OF @ModelAttribute
	// HERE IT WILL AUTOMATICALLY MAP THE USER WITH CLASS AND SAVE IT TO A MODEL
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user) {
		if(user.getName().isBlank()) {
			return "redirect:/contact";
		}
		this.userService.createUser(user);
		return "success";
	}
	
	//SECOND USE OF @ModelAttribute
	
	@ModelAttribute
	public void commonTexts(Model model) {
		model.addAttribute("Header", "Hey! this is for fun");
		model.addAttribute("Desc", "try learning now");
		
	}

}
