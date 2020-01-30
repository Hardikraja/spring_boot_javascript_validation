package com.example.validation.validation.controller;

import com.example.validation.validation.entity.StudentEntity;
import com.example.validation.validation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;

@Controller
public class StudentController {


    private StudentService studentService;

    @Autowired
    public StudentController(StudentService theStudentService){
        studentService=theStudentService;
    }

    @RequestMapping("/list")
    public String getHello(Model theModel){
        List<StudentEntity> studentList = studentService.getAllStudents();
        theModel.addAttribute("stu_list",studentList);
        return "index_page";
    }

    @RequestMapping("/delete")
    public String deleteById(@RequestParam("studentId")int theId){
        studentService.deleteStudentById(theId);
        return "redirect:/list";
    }

    @RequestMapping("/showFormForAdd")
    public String addStudent(Model theModel){
        theModel.addAttribute("studentObj",new StudentEntity());
        return "registration_form";
    }

    @RequestMapping("/save")
    public String  addStudentDb(@Valid @ModelAttribute("studentObj") StudentEntity theStudentEntity, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println(bindingResult);
            return "registration_form";
        }
        else {
            studentService.saveStudent(theStudentEntity);
            return "redirect:/list";
        }
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel){
        StudentEntity theStudent = studentService.findStudentById(theId);
        theModel.addAttribute("studentObj",theStudent);
        return "registration_form";
    }
}
