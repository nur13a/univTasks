package com.company.Course.entities;

import com.company.Course.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="student")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="fullName")
    String fullName;

    @Enumerated
    @Column(name = "gender")
    Gender gender;

    @ManyToOne
    @JoinColumn(name="group_id")
    Groups group;

    @Column(name="address")
    String address;

    @Column(name="age")
    Integer age;

    @Builder.Default
    @Column(name="registerDate")
    Date registerDate=new Date();

    @Column(name="isOnline")
    Boolean isOnline;

    @Column(name="mark")
    Integer mark;
}
