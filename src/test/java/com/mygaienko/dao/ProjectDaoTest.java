package com.mygaienko.dao;

import com.mygaienko.model.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmytro.mygaienko on 1/31/14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-config.xml")
public class ProjectDaoTest {
    private ProjectDao projectDao;

    @Autowired
    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Test
    public void testGetProjectByName() {
        Project expectedProject = new Project();
        expectedProject.setLastName("ololoev");
        projectDao.saveProject(expectedProject);

        Project project = projectDao.getProjectByName("ololoev");
        assertEquals("ololoev", project.getLastName());
    }
}
