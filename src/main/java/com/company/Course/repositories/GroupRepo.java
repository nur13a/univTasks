package com.company.Course.repositories;

import com.company.Course.entities.Groups;
import com.company.Course.enums.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepo extends JpaRepository<Groups, Long> {

    List<Groups> findAllBySubject(Subject subject);

    List<Groups> findAllByDuration(Integer duration);

    Groups findByName(String name);
}
