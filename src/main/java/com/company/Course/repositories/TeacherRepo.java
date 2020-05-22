package com.company.Course.repositories;

import com.company.Course.entities.Teacher;
import com.company.Course.enums.Subject;
import com.company.Course.enums.TeacherPosition;
import com.company.Course.models.GiveMarksStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {
    List<Teacher> findAllByPosition(TeacherPosition position);

    @Query(value = "select g.subject ,s.id,s.mark from teacher t inner join \"groups\" as g on t.id =g.teacher_id \n" +
            "inner join student s on g.id =s.group_id \n" +
            "where s.id =:studentId and g.subject =:subject;", nativeQuery = true)
    GiveMarksStudents setMark(@Param("studentId") Long studentId, @Param("subject") Subject subject);


}
