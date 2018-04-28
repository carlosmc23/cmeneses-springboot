package com.avanticaspring.demo.service;


import com.avanticaspring.demo.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    private static final List<Teacher> listTeachers= new ArrayList<>();

    public TeacherService() {
        listTeachers.add(new Teacher(0,"carlos"));
        listTeachers.add(new Teacher(1,"jorge"));
        listTeachers.add(new Teacher(2,"rudy"));
        listTeachers.add(new Teacher(3,"noemi"));
    }

    /*public List<Teacher> getAllTeachers(){
        List<Teacher> listTeachers= new ArrayList<>();
        listTeachers.add(new Teacher(1,"carlos"));
        listTeachers.add(new Teacher(2,"jorge"));
        listTeachers.add(new Teacher(3,"rudy"));
        listTeachers.add(new Teacher(4,"noemi"));
        return listTeachers;
    }*/

    //CRUD
    //List teachers
    public List<Teacher> getAllTeachers(){
        return listTeachers;
    }
    //Add new teacher
    public void addNewTeacher(Teacher newteacher){
        //instert new teacher into DB
        listTeachers.add(newteacher);
    }
    //delete teacher by id
    public void deleteTeacher(int id){
        //delete a
        listTeachers.remove(id);
    }
    //Get a teacher By Id
    public Teacher getTeacherById(int id){
        return listTeachers.get(id);
    }
    //delete teacher by id
    public void deleteTeacher(Teacher delTeacher){
        //delete a
        listTeachers.remove(delTeacher.getId());
    }

}
