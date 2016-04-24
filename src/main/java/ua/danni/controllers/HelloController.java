package ua.danni.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.danni.service.CoursesService;
import ua.danni.service.UserService;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	UserService userService;


		@RequestMapping(method = RequestMethod.GET)
		public String start(Model model){
			return "index";
		}



}