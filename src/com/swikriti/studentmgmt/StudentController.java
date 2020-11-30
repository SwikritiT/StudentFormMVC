package com.swikriti.studentmgmt;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swikriti.spring.dto.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping(value="/student-form")
	public String create(Model themodel) {
		Student student = new Student();
		themodel.addAttribute("student",student);
		return "student/student-form";
	}
	@RequestMapping(value="store", method = RequestMethod.POST)
	public String store(@Valid @ModelAttribute("student") Student student, BindingResult thebindingresult) {
		if (thebindingresult.hasErrors()) {
			return "student/student-form";
		}
		return "student/profile";
		
	}
	@RequestMapping("edit")
	public String edit(Model model){
		Student student = new Student();
		student.setName("Harry");
		student.setAddress("Hogwarts");
		student.setCountry("England");
		student.setGender("male");
		student.setHobbies(new String[]{"Reading","Singing"});
		model.addAttribute("student",student);
		return "student/edit";
	}
	@RequestMapping(value="update", method = RequestMethod.POST)
public String update(@ModelAttribute("student") Student student) {
		
		return "student/profile";
		
	}

}
