package com.company.Course.models;

import com.company.Course.enums.Subject;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GiveMarksStudents {
    Long studentId;
    Integer mark;
    Subject subject;
}
