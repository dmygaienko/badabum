package com.mygaienko.services;

import com.mygaienko.dao.ProjectDao;
import com.mygaienko.model.Project;
import com.mygaienko.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dmytro.mygaienko on 1/30/14.
 */
@Service
public class ProjectService {

    private ProjectDao projectDao;

    public ProjectDao getProjectDao() {
        return projectDao;
    }

    @Autowired
    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    public boolean isHelpful(Worker worker){
        return false;
    };

    public Project getProjectById(String name) {
        return projectDao.getProjectById(name);
    };

    public void saveProject(Project project) {
        projectDao.saveProject(project);
    }

    public void deleteProjectByName(Project project) {
        projectDao.deleteProject(project);
    }

}
