package springmvcsearch;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerExceptionHandler(Model m) {
		m.addAttribute("msg", "Null Pointer Exception Occured");
		return "null_page";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String numberFormatExceptionHandler(Model m) {
		m.addAttribute("msg", "Number Format Exception Occured");
		return "null_page";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandler(Model m) {
		m.addAttribute("msg", "Exception has Occured");
		return "null_page";
	}
	

}
