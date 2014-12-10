package pack;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Author: Aleksey Alekseenko
 * Date: 07.12.2014
 */
@Component
public class EventService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("EventService");
    private EntityManager em = emf.createEntityManager();
//    public static void main(String[] args) {
//          persist();
//        emf.close();
//    }
    @PostConstruct
    public void init() {
        emf = Persistence.createEntityManagerFactory("EventService");
        em = emf.createEntityManager();
    }

    public void persist(Event event) {
        em.getTransaction().begin();
        try {
            em.persist(event);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
