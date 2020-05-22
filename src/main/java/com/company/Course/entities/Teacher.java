package com.company.Course.entities;

import com.company.Course.enums.Gender;
import com.company.Course.enums.TeacherPosition;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="fullName")
    String fullName;

    @Enumerated
    @Column(name = "gender")
    Gender gender;

    @Column(name="address")
    String address;

    @Column(name="age")
    Integer age;

    @Enumerated
    @Column(name="position")
    TeacherPosition position;

    @Column(name="password",length = 8)
    String password;
}
