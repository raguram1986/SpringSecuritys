package com.example.studentmanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.studentmanagement.Domain.Course;
import com.example.studentmanagement.Domain.Student;
import com.example.studentmanagement.Service.CourseService;
import com.example.studentmanagement.Service.StudentService;

@Controller
public class StudentController {
	
	 @Autowired
	    private StudentService service;

	    @GetMapping("/Student")
	    public String viewHomePage(Model model) {
	        List<Student> liststudent = service.listAll();
	     //   model.addAttribute("liststudent", liststudent);
	        System.out.print("Get / ");	
	        return "Student";
	    }

	    @GetMapping("/addStudent")
	    public String add(Model model) {
	    	List<Student> liststudent = service.listAll();
	        model.addAttribute("liststudent", liststudent);
	        model.addAttribute("student", new Student());
	        return "addstudent";
	    }
	    

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveStudent(@ModelAttribute("student") Student std) {
	        service.save(std);
	        return "Student";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("addstudent");
	        Student std = service.get(id);
	        mav.addObject("student", std);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteStudentPage(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "Student";
	    }
	
	

}
