package pack;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Author: Aleksey Alekseenko
 * Date: 07.12.2014
 */
@Entity
public class Event implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private String eventName;
    @Column(nullable = false)
    private EventType eventType;
    @Column(nullable = false)
    private EventToWhom eventToWhom;
    @Column(nullable = false)
    private Date startEventDate;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStartEventDate() {
        return startEventDate;
    }

    public void setStartEventDate(Date startEventDate) {
        this.startEventDate = startEventDate;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public EventToWhom getEventToWhom() {
        return eventToWhom;
    }

    public void setEventToWhom(EventToWhom eventToWhom) {
        this.eventToWhom = eventToWhom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public enum EventType {
        EDUCATIONAL, ENTERTAINING
    }

    public enum EventToWhom {
        SINGLE, COUPLE, FAMILY, ALL
    }
}
