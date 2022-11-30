package com.etu.letimeet.dao.interaction;

import com.etu.letimeet.entity.interaction.Interaction;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class InteractionDAOImpl implements InteractionDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public Interaction updateInteraction(Interaction interaction) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(interaction);
        return interaction;
    }
}
