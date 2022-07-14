package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayController {
	
	@Autowired
	CoronaVirusDataService coronavirusdataservice;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("DataStoringClass", coronavirusdataservice.getAlldata());
		return "display";
	}
	
}
