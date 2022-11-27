package com.etu.letimeet.controller.request_bodyes;

import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InteractionRequestBody {
    private Long id;
    private Interaction interaction;

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

    public Interaction getInteraction() {
        return interaction;
    }

    @JsonProperty("interaction")
    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }
}
