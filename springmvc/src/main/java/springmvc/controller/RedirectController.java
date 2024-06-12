package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	//USING REDIRECT PREFIX
	@RequestMapping("/one")
	public String one() {
		System.out.println("Hi i am calling two, using redirect prefix");
		return "redirect:/two";
	}
	
	//USING REDIRECT VIEW
	@RequestMapping("/two")
	public RedirectView two() {
		RedirectView redirectView = new RedirectView();
		System.out.println("hi from two, calling three using RedirectView");
		redirectView.setUrl("three");
		return redirectView;
	}
	
	@RequestMapping("/three")
	public String three() {
		System.out.println("this is a hi from three");
		return "";
	}

}
