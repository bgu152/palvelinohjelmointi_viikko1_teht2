package com.example.viikko1teht2.web;
import com.example.viikko1teht2.domain.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class StudentController {
	List<Student> opiskelijalista = new ArrayList<>();
	
	
	@RequestMapping("/hello")
	public String opiskelijat(Model model) {
		opiskelijalista.clear();		
		Student opiskelija0 = new Student("Kalle", "Andersson");
		Student opiskelija1 = new Student("Dan", "Brown");
		Student opiskelija2 = new Student("Mike", "Mars");
		opiskelijalista.add(opiskelija0);
		opiskelijalista.add(opiskelija1);
		opiskelijalista.add(opiskelija2);
		model.addAttribute("students", opiskelijalista);
		return "hello";
		
	}
}
