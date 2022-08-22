package com.jenkins.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Autowired
    private long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
}
