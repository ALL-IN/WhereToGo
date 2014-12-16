package org.where2go.services;

import org.where2go.dao.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.where2go.persistence.model.Event;
import org.where2go.persistence.model.Type;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Author: Aleksey Alekseenko
 * Date: 07.12.2014
 */
@Component
public class EventService {
    @Autowired
    private EventDao eventDao;

    @PostConstruct
    public void init() {
        Event event = new Event();
        event.setTitle("title");
        event.setAddress("address");
        event.setDescription("description");
        event.setStartDate(new Date());
        event.setEndDate(new Date());
        event.setLocation("location");
        event.setPrice(1);
        event.setEventToWhom(Event.EventToWhom.CHILDREN);
        event.setShortDescription("shortDescr");
        Type type = new Type();
        type.setName("type");
        event.setType(type);
        eventDao.create(event);
    }

    public void create(Event event) {
        eventDao.create(event);
    }

    public void update(Event event) {
        eventDao.update(event);
    }

    public void delete(Event event) {
        eventDao.delete(event);
    }

    public Event retrieve(Long id) {
        return eventDao.retrieve(id);
    }
}
