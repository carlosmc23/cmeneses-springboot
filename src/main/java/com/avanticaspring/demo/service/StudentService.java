package com.avanticaspring.demo.service;


import com.avanticaspring.demo.domain.Student;
import com.avanticaspring.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //CRUD
    //List students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
        //return list students;
    }

    //Add new student
    public void addNewStudent(Student newStudent) {
        //instert new student into DB
        studentRepository.save(newStudent);
    }

    //delete student by id
    public void deleteStudent(String id) {
        //delete a atudent
        studentRepository.deleteById(id);
    }

    //Get a student By Id
    public Student getStudentById(String id) {
        //return students by Id
        return studentRepository.findStudentById(id);
    }
}
