package net.bhanoo.OnlineShopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		return new ModelAndView("page").addObject("message", "Welcome to Spring WebMVC");
	}
}
