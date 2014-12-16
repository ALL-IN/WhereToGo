package org.where2go.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author: Aleksey Alekseenko
 * Date: 15.12.2014
 */
@Entity
public class Type implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
