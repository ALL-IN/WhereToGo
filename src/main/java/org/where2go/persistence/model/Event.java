package org.where2go.persistence.model;

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
    private String title;
    @OneToOne
    private Type type;
    @Column(nullable = false)
    private EventToWhom eventToWhom;
    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private Date endDate;
    @Column(nullable = false)
    private String address;
    @Column
    private Long counter;
    @Column
    private Long likes;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String shortDescription;
    @Column(nullable = false)
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    public Long getLike() {
        return likes;
    }

    public void setLike(Long likes) {
        this.likes = likes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Type getType() {
        return type;
    }

    public enum EventToWhom {
        SINGLE, COUPLE, CHILDREN, FRIENDS
    }
}
