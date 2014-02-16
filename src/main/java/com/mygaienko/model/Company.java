package com.mygaienko.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dmytro.mygaienko on 1/30/14.
 */
@Entity
@Table(name = "COMPANIES")
public class Company {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany
    List<Project> projects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /* List<Worker> workers;*/
}
