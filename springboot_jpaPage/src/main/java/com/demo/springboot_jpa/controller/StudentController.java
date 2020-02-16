package com.demo.springboot_jpa.controller;

import com.demo.springboot_jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Moon
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/students")
    public String students(@PageableDefault(size = 3,sort = {"studentNo"},direction = Sort.Direction.ASC) Pageable pageable,
                           Model model){
        model.addAttribute("page",studentService.listStudents(pageable));
        System.out.println("studentList:"+studentService.listStudents(pageable));
        return "student/studentList";
    }
}
