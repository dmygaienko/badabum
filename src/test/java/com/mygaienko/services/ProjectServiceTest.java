package com.mygaienko.services;

import com.mygaienko.model.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by enda1n on 2/1/14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-config.xml")
public class ProjectServiceTest {
    @Autowired
    private ProjectService projectService;

    @Test
    public void testSaveProject() {
        Project expectedProject = new Project();
        expectedProject.setLastName("Project 01");

        projectService.saveProject(expectedProject);
        /*Project actualProject = projectService.getProjectById(expectedProject.getLastName());
        assertEquals(expectedProject.getLastName(), actualProject.getLastName());*/
    }
}
