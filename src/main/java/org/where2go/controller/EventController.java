package org.where2go.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.where2go.persistence.model.Event;
import org.where2go.services.EventService;

import java.util.Date;
@RestController
@RequestMapping(value = "/events")
@Slf4j
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Event createEmployee(@RequestBody Event event) {
        eventService.create(event);
        log.debug("Event was created");
        return event;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Event update(@RequestBody Event event) {
        eventService.update(event);
        log.debug("Event was updated");
        return event;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Event delete(@RequestBody Event event) {
        eventService.delete(event);
        log.debug("Event was deleted");
        return event;
    }

    @RequestMapping(value = "/get-event", method = RequestMethod.GET)
    public @ResponseBody Event retrieve(Long id) {
       return eventService.retrieve(id);
    }


}