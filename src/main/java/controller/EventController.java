package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.Event;
import pack.EventService;

import java.util.Date;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/create-event", method = RequestMethod.POST)
    public Event createEmployee(@RequestBody Event event) {
//        logger.info("Start createEmployee.");
        eventService.persist(event);
        return event;
    }

    @RequestMapping(value = "/get-event", method = RequestMethod.GET)
    public
    @ResponseBody
    Event getEvent() {
        Event event = new Event();
        event.setEventName("qwe");
        event.setEventToWhom(Event.EventToWhom.COUPLE);
        event.setEventType(Event.EventType.EDUCATIONAL);
        event.setStartEventDate(new Date());
        return event;
    }
}