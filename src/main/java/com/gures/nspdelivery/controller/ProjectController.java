package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Project;
import com.gures.nspdelivery.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @GetMapping(value= "/projectList", produces = "application/json")
    public ResponseEntity<List<Project>> getProjects () {
        List<Project> projects = projectService.findAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Project> getProjectById (@PathVariable int id) {
        Project projectById = projectService.getProjectById(id);
        return new ResponseEntity<>(projectById, HttpStatus.OK);
    }

    @PostMapping(value = "/addProject", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Project>  addProject(@RequestBody Project project) {
        Project projectAdded = projectService.addProject(project);
        return new ResponseEntity<>(projectAdded, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable int id)
    {
        projectService.removeProjectById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/projectsCustomer/{id}", produces = "application/json")
    public ResponseEntity<List<Project>> getProjectsByCustomerId (@PathVariable int id) {
        List<Project> projects = projectService.findProjectsByCustomerId(id);
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

}
