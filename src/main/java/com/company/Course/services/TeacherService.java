package com.company.Course.services;

import com.company.Course.entities.Student;
import com.company.Course.entities.Teacher;
import com.company.Course.enums.TeacherPosition;
import com.company.Course.exceptions.NotFoundStudent;
import com.company.Course.exceptions.NotFoundTeacher;
import com.company.Course.models.GiveMarksStudents;
import com.company.Course.models.TeacherModel;

import java.util.List;

public interface TeacherService  {

    List<Teacher> getAll();

    Teacher getById(Long id);

    Teacher create(TeacherModel teacherM);

    void deleteById(Long id) throws NotFoundTeacher;

    List<Teacher> findAllByPosition(TeacherPosition position) throws NotFoundTeacher;
    Student giveMarksStudents(GiveMarksStudents giveMarksStudents) throws NotFoundStudent;
}
