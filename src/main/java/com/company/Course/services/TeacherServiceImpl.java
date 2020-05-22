package com.company.Course.services;

import com.company.Course.entities.Student;
import com.company.Course.entities.Teacher;
import com.company.Course.enums.Subject;
import com.company.Course.enums.TeacherPosition;
import com.company.Course.exceptions.NotFoundStudent;
import com.company.Course.exceptions.NotFoundTeacher;
import com.company.Course.models.GiveMarksStudents;
import com.company.Course.models.TeacherModel;
import com.company.Course.repositories.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private StudentService studentService;

    @Override
    public List<Teacher> getAll() {
        return teacherRepo.findAll();
    }

    @Override
    public Teacher getById(Long id) {
        Optional<Teacher> teacher = teacherRepo.findById(id);
        return teacher.get();
    }

    @Override
    public Teacher create(TeacherModel teacherModel) {
        Teacher teacher = Teacher.builder().fullName(teacherModel.getFullName())
                .age(teacherModel.getAge())
                .address(teacherModel.getAddress())
                .gender(teacherModel.getGender())
                .position(teacherModel.getPosition())
                .password(teacherModel.getPassword()).build();
        return teacherRepo.save(teacher);
    }

    @Override
    public void deleteById(Long id) throws NotFoundTeacher {
        Teacher teacher = getById(id);
        if (teacher != null)
            teacherRepo.delete(teacher);
        else throw new NotFoundTeacher();
    }

    @Override
    public List<Teacher> findAllByPosition(TeacherPosition position) throws NotFoundTeacher {
        List<Teacher> teachers = teacherRepo.findAllByPosition(position);
        if (teachers != null) return teachers;
        else throw new NotFoundTeacher();
    }

    @Override
    public Student giveMarksStudents(GiveMarksStudents giveMarksStudents) throws NotFoundStudent {
        GiveMarksStudents mark = teacherRepo.setMark(giveMarksStudents.getStudentId(), giveMarksStudents.getSubject());
        if (mark != null) {
            Student student = studentService.getById(mark.getStudentId());
            student.setMark(giveMarksStudents.getMark());
            return student;
        } else throw new NotFoundStudent();
    }
}
