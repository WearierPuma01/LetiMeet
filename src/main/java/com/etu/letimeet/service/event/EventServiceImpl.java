package com.etu.letimeet.service.event;

import com.etu.letimeet.dao.event.EventDAO;
import com.etu.letimeet.entity.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventDAO eventDAO;

    @Override
    @Transactional
    public Event updateEvent(Event event) {
        return eventDAO.updateEvent(event);
    }
}
