package com.mygaienko.dao;

import com.mygaienko.model.Project;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 * Created by dmytro.mygaienko on 1/31/14.
 */

@Transactional
@Repository
public class ProjectDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveProject(Project project) {
        entityManager.persist(project);
    }

    public void deleteProject(Project project) {
        entityManager.remove(project);
    }

    public Project getProjectByName(String name) {
        Query query = entityManager.createNamedQuery("projectByName");
        query.setParameter("lastName", name);
        return (Project) query.getSingleResult();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Project getProjectById(String id) {
        return entityManager.find(Project.class, id);
    }


   /* @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveProject(Project project) {
        entityManager.persist(project);
    }

    public void deleteProject(Project project) {
        entityManager.delete(project);
    }

    public Project getProjectByName(String name) {
        Criteria criteria = entityManager.createCriteria(Project.class);
        criteria.add(Restrictions.eq("name", name));
        return (Project) criteria.uniqueResult();
    }

    private Session entityManager {
        return sessionFactory.entityManager;
    }*/

}
/*@Entity
@NamedQueries({
        @NamedQuery(name="magsOverPrice",
                query="SELECT x FROM Magazine x WHERE x.price > ?1"),
        @NamedQuery(name="magsByTitle",
                query="SELECT x FROM Magazine x WHERE x.title = :titleParam")
})*/
