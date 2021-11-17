package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Project;
import com.gures.nspdelivery.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping(value= "/projectList", produces = "application/json")
    public List<Project> getProjects () {
        return projectRepository.findAll();
    }

    @PostMapping(value = "/addProject", produces = "application/json", consumes = "application/json")
    public Project addProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

}
