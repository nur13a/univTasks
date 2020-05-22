package com.company.Course.entities;

import com.company.Course.enums.Subject;
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
@Table(name = "groups")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name", unique = true)
    String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "subject")
    Subject subject;

    @Column(name = "duration")
    Integer duration;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacherId")
    Teacher teacher;
}
