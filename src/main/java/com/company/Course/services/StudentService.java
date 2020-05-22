package com.company.Course.services;

import com.company.Course.entities.Groups;
import com.company.Course.entities.Student;
import com.company.Course.exceptions.NotFoundStudent;
import com.company.Course.models.StudentModel;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student getById(Long id);

    Student create(StudentModel student);

    void deleteById(Long id) throws NotFoundStudent;

    List<Student> findAllByGroup(Long group) throws NotFoundStudent;

    List<Student> findAllByIsOnline(Boolean isOnline) throws NotFoundStudent;
}
