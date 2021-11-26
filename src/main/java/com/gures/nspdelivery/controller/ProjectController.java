package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Project;
import com.gures.nspdelivery.repository.CustomerRepository;
import com.gures.nspdelivery.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value= "/projectList", produces = "application/json")
    public List<Project> getProjects () {
        return projectService.findAllProjects();
    }

    @PostMapping(value = "/addProject", produces = "application/json", consumes = "application/json")
    public Project addProject(@RequestBody Project project) {
        return projectService.addProject(project);
    }

    /*@GetMapping(value = "/customerByProjectId/{projectId}", produces = "application/json")
    public Optional<Customer> getCustomerByProjectId(@PathVariable int projectId) {
        return customerRepository.findById(projectService.findCustomerIdByProjectId(projectId));
    }*/

}
