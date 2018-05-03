package com.avanticaspring.demo.web;

import com.avanticaspring.demo.domain.Student;
import com.avanticaspring.demo.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Api(value = "onlinestore", description = "Operations pertaining to products in Online Store")//para Swagger
public class StudentController {
    @Autowired
    private StudentService studentService;

    //get all students
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //get student by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable String id) {
        System.out.println("the id a student is: " + id);
        return studentService.getStudentById(id);
    }

    //insert a new student
    @RequestMapping(method = RequestMethod.POST)
    public void addNewStudent(@RequestBody Student newStudent) {
        System.out.println("The name a new Student is: " + newStudent.getName());
        studentService.addNewStudent(newStudent);
    }

    //delete student by id
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable String id) {
        System.out.println("The id of student deleted is: " + id);
        studentService.deleteStudent(id);
    }

    //delete student by RequestBody
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteStudentByBody(@RequestBody Student delStudent) {
        System.out.println("the name student deleted is:" + delStudent.getName());
        studentService.deleteStudent(delStudent.getId());
    }


}
