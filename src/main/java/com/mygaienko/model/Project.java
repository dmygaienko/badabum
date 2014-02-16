package com.mygaienko.model;

import javax.persistence.*;

/**
 * Created by dmytro.mygaienko on 1/30/14.
 */

@Entity(name = "TEST_PROJECT")
@NamedQuery(name = "projectByName", query = "SELECT p from TEST_PROJECT p where p.lastName = :lastName")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="lastName")
    private String lastName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

   /* private ProjectSize size;
    private ProjectStatus status;*/
}
