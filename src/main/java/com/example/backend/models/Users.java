package com.example.backend.models;


import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
@Table(appliesTo = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    private String email;

    public Users(Users copy) {
        username = copy.username;
        email = copy.email;
    }

    public Users() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String setUsername(String username) {
        this.username = username;
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }
}
