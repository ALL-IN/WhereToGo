package org.where2go.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.where2go.persistence.model.Event;
import org.where2go.persistence.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("userDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UserDao {
    private static final String SELECT_QUERY = "select u from User u";

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create(User user) {
        entityManager.persist(user);
    }

    public void update(User user) {
        entityManager.merge(user);
    }

    public void delete(User user) {
        entityManager.remove(user);
    }

    public Event retrieve(Long id) {
        return entityManager.find(Event.class, id);
    }

    public List<User> selectAll() {
        Query query = entityManager.createQuery(SELECT_QUERY);
        List<User> users = (List<User>) query.getResultList();
        return users;
    }
}
