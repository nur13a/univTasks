package com.company.Course.services;

import com.company.Course.entities.Groups;
import com.company.Course.enums.Subject;
import com.company.Course.exceptions.NotFoundGroup;
import com.company.Course.models.GroupModel;
import com.company.Course.repositories.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepo groupRepo;

    @Override
    public List<Groups> getAll() {
        return groupRepo.findAll();
    }

    @Override
    public Groups getById(Long id) {
        Optional<Groups> group = groupRepo.findById(id);
        return group.get();
    }

    @Override
    public Groups create(GroupModel groupModel) {
        Groups group = Groups.builder().name(groupModel.getName())
                .subject(groupModel.getSubject())
                .build();
        return groupRepo.save(group);
    }

    @Override
    public void deleteById(Long id) throws NotFoundGroup {
        Groups group = getById(id);
        if (group != null)
            groupRepo.delete(group);
        else throw new NotFoundGroup();
    }

    @Override
    public List<Groups> getAllBySubject(Subject subject) throws NotFoundGroup {
        List<Groups> groups = groupRepo.findAllBySubject(subject);
        if (groups != null)
            return groups;
        else throw new NotFoundGroup();
    }

    @Override
    public List<Groups> getAllByDuration(Integer duration) throws NotFoundGroup {
        List<Groups> groups = groupRepo.findAllByDuration(duration);
        if (groups != null)
            return groups;
        else throw new NotFoundGroup();
    }

    @Override
    public Groups getByName(String name) throws NotFoundGroup {
        Groups group = groupRepo.findByName(name);
        if (group != null)
            return group;
        else throw new NotFoundGroup();
    }
}
