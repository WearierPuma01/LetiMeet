package com.etu.letimeet.dao.references;

import com.etu.letimeet.entity.agreement.references.AgreementStatus;
import com.etu.letimeet.entity.agreement.references.AgreementType;
import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.event.refereces.EventType;
import com.etu.letimeet.entity.interaction.references.InteractionType;
import com.etu.letimeet.entity.joint_structure.references.StructureType;
import com.etu.letimeet.entity.partner.references.PartnerType;
import com.etu.letimeet.entity.university_division.references.Faculty;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ReferencesDAOImpl implements ReferencesDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Faculty> getFaculties() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from faculties";
        return session.createQuery(query, Faculty.class).getResultList();
    }

    @Override
    public List<PartnerType> getPartnerTypes() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from partner_types";
        return session.createQuery(query, PartnerType.class).getResultList();
    }

    @Override
    public List<StructureType> getStructureTypes() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from structure_types";
        return session.createQuery(query, StructureType.class).getResultList();
    }

    @Override
    public List<InteractionType> getInteractionTypes() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from interaction_types";
        return session.createQuery(query, InteractionType.class).getResultList();
    }

    @Override
    public List<EventType> getEventTypes() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from event_types";
        return session.createQuery(query, EventType.class).getResultList();
    }

    @Override
    public List<AgreementStatus> getAgreementStatuses() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from agreement_status";
        return session.createQuery(query, AgreementStatus.class).getResultList();
    }

    @Override
    public List<AgreementType> getAgreementTypes() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from agreement_types";
        return session.createQuery(query, AgreementType.class).getResultList();
    }

    @Override
    public List<DirectionOfDev> getDirectionsOfDev() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from directions_of_dev";
        return session.createQuery(query, DirectionOfDev.class).getResultList();
    }
}
