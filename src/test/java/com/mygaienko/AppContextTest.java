package com.mygaienko;

import com.mygaienko.services.ProjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by enda1n on 2/2/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-config.xml")
public class AppContextTest {

    @Autowired
    ApplicationContext applicationContext;


    @Test
    public void testContext(){
        ProjectService projectService = applicationContext.getBean(ProjectService.class);
        assertNotNull(projectService);
    }
}

