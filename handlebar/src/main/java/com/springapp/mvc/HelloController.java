package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView printWelcome(ModelMap model) {
		ModelAndView mav = new ModelAndView("home");
//		mav.addObject("msg", "Hello world!");
		return mav;
	}
}