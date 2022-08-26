package com.etu.letimeet.entity.event;

import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.event.refereces.EventType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "event_id")
    private long eventId;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "event_date")
    private Date eventDate;
    @Column(name = "event_result")
    private String eventResult;
    @ManyToOne
    @JoinColumn(name = "event_type_id")
    private EventType eventType;
    @ManyToMany
    @JoinTable(
            name = "events_directions",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "direction_id")
    )
    private List<DirectionOfDev> directionsOfDev;

    public Event() {
    }

    public Event(String eventName, Date eventDate, String eventResult) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventResult = eventResult;
    }

    public void addDirectionOfDevToEvent(DirectionOfDev directionOfDev) {
        if (directionsOfDev == null) {
            directionsOfDev = new ArrayList<>();
        }
        directionsOfDev.add(directionOfDev);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", eventResult='" + eventResult + '\'' +
                '}';
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventResult() {
        return eventResult;
    }

    public void setEventResult(String eventResult) {
        this.eventResult = eventResult;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public List<DirectionOfDev> getDirectionsOfDev() {
        return directionsOfDev;
    }

    public void setDirectionsOfDev(List<DirectionOfDev> directionsOfDev) {
        this.directionsOfDev = directionsOfDev;
    }
}
