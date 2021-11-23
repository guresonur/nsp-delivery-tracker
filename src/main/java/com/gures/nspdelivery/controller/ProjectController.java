package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Customer;
import com.gures.nspdelivery.model.Project;
import com.gures.nspdelivery.repository.CustomerRepository;
import com.gures.nspdelivery.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value= "/projectList", produces = "application/json")
    public List<Project> getProjects () {
        return projectRepository.findAll();
    }

    @PostMapping(value = "/addProject", produces = "application/json", consumes = "application/json")
    public Project addProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    @GetMapping(value = "/customerByProjectId/{projectId}", produces = "application/json")
    public Optional<Customer> getCustomerByProjectId(@PathVariable int projectId) {
        return customerRepository.findById(projectRepository.findCustomerIdByProjectId(projectId));
    }

}
