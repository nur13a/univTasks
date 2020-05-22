package com.company.Course.models;

import com.company.Course.enums.Gender;
import com.company.Course.enums.TeacherPosition;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeacherModel {
    String fullName;
    Gender gender;
    String address;
    Integer age;
    TeacherPosition position;
    String password;
}
