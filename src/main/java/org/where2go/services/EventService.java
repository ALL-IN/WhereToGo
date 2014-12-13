package org.where2go.services;

import org.where2go.controller.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.where2go.persistence.model.Event;

/**
 * Author: Aleksey Alekseenko
 * Date: 07.12.2014
 */
@Component
public class EventService {
    @Autowired
    private EventDao eventDao;

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
