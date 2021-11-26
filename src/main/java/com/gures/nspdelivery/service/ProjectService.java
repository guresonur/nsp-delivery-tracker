package com.gures.nspdelivery.service;

import com.gures.nspdelivery.model.Project;
import com.gures.nspdelivery.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(int id) {
        return projectRepository.findById(id);
    }

    public void removeProjectById(int id) {
        projectRepository.deleteById(id);
    }


}
