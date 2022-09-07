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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
