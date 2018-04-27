package com.avanticaspring.demo.service;


import com.avanticaspring.demo.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {


    public List<Teacher> getAllTeachers(){
        List<Teacher> listTeachers= new ArrayList<>();
        listTeachers.add(new Teacher(1,"carlos"));
        listTeachers.add(new Teacher(2,"jorge"));
        listTeachers.add(new Teacher(3,"rudy"));
        return listTeachers;
    }

}
