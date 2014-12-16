package org.where2go.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.where2go.dao.UserDao;
import org.where2go.persistence.model.Event;
import org.where2go.persistence.model.User;

import javax.annotation.PostConstruct;

@Component
public class UserService {
    @Autowired
    private UserDao userDao;
    @PostConstruct
    public void init() {

    }

    public void create(User user) {
        userDao.create(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    public Event retrieve(Long id) {
        return userDao.retrieve(id);
    }
}
