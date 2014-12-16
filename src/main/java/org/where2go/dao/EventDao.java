package org.where2go.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.where2go.persistence.model.Event;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("eventDao")
@Transactional(propagation = Propagation.REQUIRED)
public class EventDao {

    private static final String SELECT_QUERY = "select e from Event e";

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create(Event event) {
        entityManager.persist(event);
    }

    public void update(Event event) {
        entityManager.merge(event);
    }

    public void delete(Event event) {
        entityManager.remove(event);
    }

    public Event retrieve(Long id) {
        return entityManager.find(Event.class, id);
    }

    public List<Event> selectAll() {
        Query query = entityManager.createQuery(SELECT_QUERY);
        List<Event> events = (List<Event>) query.getResultList();
        return events;
    }

}