package com.gures.nspdelivery.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;

    private String projectDescription;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "customer_id", nullable = false)
    @JsonBackReference
    private Customer customer;

    @OneToMany (mappedBy = "project", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Server> servers;

    public Project() {
    }

    public Project(int projectId, String projectDescription, Customer customer, List<Server> servers) {
        this.projectId = projectId;
        this.projectDescription = projectDescription;
        this.customer = customer;
        this.servers = servers;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }
}
