package com.gures.nspdelivery.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Server implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serverId;

    private String hostname;

    private String selinuxStatus;

    private String rhelRel;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "project_id")
    private Project project;

    public Server() {
    }

    public Server(int serverId, String hostname, String selinuxStatus, String rhelRel, Project project) {
        this.serverId = serverId;
        this.hostname = hostname;
        this.selinuxStatus = selinuxStatus;
        this.rhelRel = rhelRel;
        this.project = project;
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getSelinuxStatus() {
        return selinuxStatus;
    }

    public void setSelinuxStatus(String selinuxStatus) {
        this.selinuxStatus = selinuxStatus;
    }

    public String getRhelRel() {
        return rhelRel;
    }

    public void setRhelRel(String rhelRel) {
        this.rhelRel = rhelRel;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
