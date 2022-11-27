package com.etu.letimeet.controller.request_bodyes;

import com.etu.letimeet.entity.event.Event;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EventRequestBody {
    private Long id;
    private Event event;

    public Long getId() {
        return id;
    }

    @JsonProperty("partner_id")
    public void setPartnerId(Long id) {
        this.id = id;
    }

    @JsonProperty("division_id")
    public void setDivisionId(Long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(Event event) {
        this.event = event;
    }
}
