package com.etu.letimeet.service.interaction;

import com.etu.letimeet.entity.interaction.Interaction;

import javax.persistence.criteria.CriteriaBuilder;

public interface InteractionService {
    public Interaction updateInteraction(Interaction interaction);
}
