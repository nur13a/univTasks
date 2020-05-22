package com.company.Course.services;

import com.company.Course.entities.Groups;
import com.company.Course.enums.Subject;
import com.company.Course.exceptions.NotFoundGroup;
import com.company.Course.models.GroupModel;

import java.util.List;

public interface GroupService {
    List<Groups> getAll();

    Groups getById(Long id);

    Groups create(GroupModel group);

    void deleteById(Long id) throws NotFoundGroup;

    List<Groups>getAllBySubject(Subject subject) throws NotFoundGroup;
    List<Groups>getAllByDuration(Integer duration) throws NotFoundGroup;
    Groups getByName(String name) throws NotFoundGroup;
}
