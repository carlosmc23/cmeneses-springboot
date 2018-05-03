package com.avanticaspring.demo.web;

import com.avanticaspring.demo.domain.Teacher;
import com.avanticaspring.demo.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")

public class TeacherController {
    //dependecy injection
    @Autowired
    private TeacherService teacherService;
    //get all teachers
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
    //Insert new teacher
    @RequestMapping(method = RequestMethod.POST)
    public void addNewTeacher(@RequestBody Teacher newTeacher){
        System.out.println("the name of new teacher is: "+newTeacher);
        teacherService.addNewTeacher(newTeacher);
    }
    //Delete teacher localhost:9090/teachers/2
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteTeacher(@PathVariable String id) {
        System.out.println("the id teacher delete is: "+ id);
        teacherService.deleteTeacher(id);
        //teacherService.deleteTeacher(id);
    }
    //delete teacher por el requestbody
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteTeacherBody(@RequestBody Teacher delTeacher){
        System.out.println("the name of teacher deleted is: "+delTeacher);
        // revisar teacherService.deleteTeacher(delTeacher);
        teacherService.deleteTeacher(delTeacher.getId());
        //teacherService.deleteTeacher((int)delTeacher.getCi());
    }

    //get teacher by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Teacher getTeacherById(@PathVariable String id) {
        System.out.println("the id teacher is: " + id);
        return teacherService.getTeacherById(id);
        //return teacherService.getTeacherById(id);
    }
}
