package com.avanticaspring.demo.repository;

import com.avanticaspring.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, String> {
    Teacher findTeacherById(String id);
}
