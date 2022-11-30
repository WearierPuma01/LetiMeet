package com.etu.letimeet.dao.event;

import com.etu.letimeet.entity.event.Event;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class EventDAOImpl implements EventDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public Event updateEvent(Event event) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(event);
        return event;
    }
}
