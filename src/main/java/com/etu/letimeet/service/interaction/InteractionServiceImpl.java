package com.etu.letimeet.service.interaction;

import com.etu.letimeet.dao.interaction.InteractionDAO;
import com.etu.letimeet.entity.interaction.Interaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class InteractionServiceImpl implements InteractionService{
    @Autowired
    private InteractionDAO interactionDAO;

    @Override
    @Transactional
    public Interaction updateInteraction(Interaction interaction) {
        return interactionDAO.updateInteraction(interaction);
    }
}
