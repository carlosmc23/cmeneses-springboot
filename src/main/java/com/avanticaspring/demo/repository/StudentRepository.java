package com.avanticaspring.demo.repository;

import com.avanticaspring.demo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findStudentById(String id);
}
