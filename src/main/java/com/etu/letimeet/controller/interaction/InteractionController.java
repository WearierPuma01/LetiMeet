package com.etu.letimeet.controller.interaction;

import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.service.interaction.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("/interactions")
public class InteractionController {
    @Autowired
    private InteractionService interactionService;

    @PostMapping("/updateInteraction")
    public Interaction updateInteraction(@RequestBody Interaction interaction) {
        return interactionService.updateInteraction(interaction);
    }
}
