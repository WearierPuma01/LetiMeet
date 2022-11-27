package com.etu.letimeet.dao.university_division;

import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.entity.partner.Partner;
import com.etu.letimeet.entity.university_division.UniversityDivision;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UniversityDivisionDAOImpl implements UniversityDivisionDAO{
    @Autowired
    EntityManager entityManager;

    @Override
    public List<UniversityDivision> getAllUniversityDivisions() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from university_divisions";
        return session.createQuery(query, UniversityDivision.class).getResultList();
    }

    @Override
    public UniversityDivision updateUniversityDivision(UniversityDivision universityDivision) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(universityDivision);
        return universityDivision;
    }

    @Override
    public UniversityDivision getOneDivisionInfo(Long id) {
        Session session = entityManager.unwrap(Session.class);
        return entityManager.find(UniversityDivision.class, id);
    }

    @Override
    public List<Agreement> getDivisionAgreements(Long id) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision = entityManager.find(UniversityDivision.class, id);
        return  universityDivision.getAgreements();
    }

    @Override
    public void addDivisionAgreement(Long id, Agreement agreement) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision =  entityManager.find(UniversityDivision.class, id);
        universityDivision.addAgreement(agreement);
        session.update(universityDivision);
    }

    @Override
    public List<Event> getDivisionEvents(Long id) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision = entityManager.find(UniversityDivision.class, id);
        return universityDivision.getEvents();
    }

    @Override
    public void addDivisionEvent(Long id, Event event) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision =  entityManager.find(UniversityDivision.class, id);
        universityDivision.addEvent(event);
        session.update(universityDivision);
    }

    @Override
    public List<Interaction> getDivisionInteractions(Long id) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision = entityManager.find(UniversityDivision.class, id);
        return universityDivision.getInteractions();
    }

    @Override
    public void addDivisionIntegration(Long id, Interaction interaction) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision =  entityManager.find(UniversityDivision.class, id);
        universityDivision.addInteractionToPartner(interaction);
        session.update(universityDivision);
    }

    @Override
    public List<JointStructure> getDivisionJointStructures(Long id) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision = entityManager.find(UniversityDivision.class, id);
        return universityDivision.getJointStructures();
    }

    @Override
    public void addDivisionJointStructure(Long id, JointStructure jointStructure) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision =  entityManager.find(UniversityDivision.class, id);
        universityDivision.addJointStructureToPartner(jointStructure);
        session.update(universityDivision);
    }


}
