package org.abol.springstarter.controllers;

import org.abol.springstarter.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {


    @GetMapping("/api/domain")
    public String getStudent(Model model){
        Student student = new Student();
        student.setName("tina");
        student.setRollNum(567);
        model.addAttribute("student",student);
        return "student-details";
    }

}
