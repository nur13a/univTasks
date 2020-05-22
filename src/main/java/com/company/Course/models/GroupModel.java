package com.company.Course.models;

import com.company.Course.entities.Teacher;
import com.company.Course.enums.Subject;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GroupModel {
    Long id;
    String name;
    Subject subject;
    Integer duration;
    List<Teacher> teacherList;
}
