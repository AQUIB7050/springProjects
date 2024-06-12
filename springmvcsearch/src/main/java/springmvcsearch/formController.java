package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcsearch.entity.Student;

@Controller
public class formController {
	
	@RequestMapping("/form")
	public String getForm(){
		return "complex_form";
	}
	
	@RequestMapping(path="/handleForm", method= RequestMethod.POST)
	public String formHandler(@ModelAttribute Student student) {
		
		return "success";
	}

}
