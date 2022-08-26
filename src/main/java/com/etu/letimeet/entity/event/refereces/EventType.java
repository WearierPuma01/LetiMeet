package com.etu.letimeet.entity.event.refereces;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events_types")
public class EventType {
    @Id
    @Column(name = "event_type_id")
    private short eventTypeID;
    @Column(name = "event_type_name")
    private String eventTypeName;

    public EventType() {
    }

    public EventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    @Override
    public String toString() {
        return "EventType{" +
                "eventTypeID=" + eventTypeID +
                ", eventTypeName='" + eventTypeName + '\'' +
                '}';
    }

    public short getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(short eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
