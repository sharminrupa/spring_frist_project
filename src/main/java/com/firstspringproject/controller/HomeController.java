package com.firstspringproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("")
	public String home(ModelMap model) {
		
		List<Student> stList = new ArrayList<Student>();
		
		Student st1 = new Student("sharmin", "01679628774");
		Student st2 = new Student("rupa", "01679628778");
		stList.add(st1);
		stList.add(st2);
		model.addAttribute("studentList", stList);
		return "index";
	}

}
