package com.avanticaspring.demo.service;


import com.avanticaspring.demo.domain.Teacher;
import com.avanticaspring.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    private static final List<Teacher> listTeachers= new ArrayList<>();

    @Autowired
    TeacherRepository teacherRepository;

    public TeacherService() {
        //listTeachers.add(new Teacher(0,"carlos"));
        /*listTeachers.add(new Teacher(0,"carlos"));
        listTeachers.add(new Teacher(1,"jorge"));
        listTeachers.add(new Teacher(2,"rudy"));
        listTeachers.add(new Teacher(3,"noemi"));*/
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
        return teacherRepository.findAll();
        //return listTeachers;
    }
    //Add new teacher
    public void addNewTeacher(Teacher newteacher){
        //instert new teacher into DB
        teacherRepository.save(newteacher);
        //listTeachers.add(newteacher);
    }

    //delete teacher by id
    @Deprecated
    public void deleteTeacher(int id){
        //delete a
        listTeachers.remove(id);
    }

    public void deleteTeacher(String id) {
        //delete a teacher
        teacherRepository.deleteById(id);
        //listTeachers.remove(id);
    }

    //Get a teacher By Id
    @Deprecated
    public Teacher getTeacherById(int id){
        return listTeachers.get(id);
    }

    public Teacher getTeacherById(String id) {
        //return listTeachers.get(id);
        //teacherRepository.findById(id);
        return teacherRepository.findTeacherById(id);

    }


}
