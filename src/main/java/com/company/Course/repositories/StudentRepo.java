package com.company.Course.repositories;

import com.company.Course.entities.Groups;
import com.company.Course.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    List<Student> findAllByGroup(Groups group);
List<Student>findAllByIsOnline(Boolean isOnline);


}
