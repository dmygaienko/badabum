package com.mygaienko.model;


import javax.persistence.*;
import java.util.List;

/**
 * Created by dmytro.mygaienko on 1/30/14.
 */
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "salary")
    private int salary;
/*    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Company employer;*/
    @ManyToMany
    private List<Project> projects;
}
