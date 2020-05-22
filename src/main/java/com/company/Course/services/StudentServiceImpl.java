package com.company.Course.services;

import com.company.Course.entities.Groups;
import com.company.Course.entities.Student;
import com.company.Course.exceptions.NotFoundStudent;
import com.company.Course.models.StudentModel;
import com.company.Course.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private GroupService groupService;

    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student getById(Long id) {
        Optional<Student> student = studentRepo.findById(id);
        return student.get();
    }

    @Override
    public Student create(StudentModel studentModel) {
        Student student = Student.builder().fullName(studentModel.getFullName())
                .age(studentModel.getAge())
                .address(studentModel.getAddress())
                .gender(studentModel.getGender())
                .group(studentModel.getGroup())
                .isOnline(studentModel.getIsOnline()).build();
        return studentRepo.save(student);
    }

    @Override
    public void deleteById(Long id) throws NotFoundStudent {
        Student student = getById(id);
        if (student != null)
            studentRepo.delete(student);
        else throw new NotFoundStudent();
    }

    @Override
    public List<Student> findAllByGroup(Long groupId) throws NotFoundStudent {
        Groups group=groupService.getById(groupId);
        List<Student> students = studentRepo.findAllByGroup(group);
        if (students != null)
            return students;
        else throw new NotFoundStudent();
    }

    @Override
    public List<Student> findAllByIsOnline(Boolean isOnline) throws NotFoundStudent {
        List<Student> students = studentRepo.findAllByIsOnline(isOnline);
        if (students != null)
            return students;
        else throw new NotFoundStudent();
    }
}
