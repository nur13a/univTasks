package com.company.Course.models;

import com.company.Course.entities.Groups;
import com.company.Course.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentModel {
    String fullName;
    Integer age;
    Gender gender;
    Groups group;
    String address;
    Boolean isOnline;
}
