package com.gures.nspdelivery.model;

import javax.persistence.*;

@Entity
public class User {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userId;

    private Role role;

    @Column(unique = true)
    private String userName;

    public User() {
    }

    public User(int userId, Role role, String userName) {
        this.userId = userId;
        this.role = role;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
