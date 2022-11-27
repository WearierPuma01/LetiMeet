package com.etu.letimeet.service.university_division;

import com.etu.letimeet.dao.university_division.UniversityDivisionDAO;
import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.entity.university_division.UniversityDivision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UniversityDivisionServiceImpl implements UniversityDivisionService{
    @Autowired
    UniversityDivisionDAO universityDivisionDAO;

    @Override
    @Transactional
    public List<UniversityDivision> getAllUniversityDivisions() {
        return universityDivisionDAO.getAllUniversityDivisions();
    }

    @Override
    @Transactional
    public UniversityDivision updateUniversityDivision(UniversityDivision universityDivision) {
        return universityDivisionDAO.updateUniversityDivision(universityDivision);
    }

    @Override
    @Transactional
    public UniversityDivision getOneDivisionInfo(Long id) {
        return universityDivisionDAO.getOneDivisionInfo(id);
    }

    @Override
    @Transactional
    public List<Agreement> getDivisionAgreements(Long id) {
        return universityDivisionDAO.getDivisionAgreements(id);
    }

    @Override
    @Transactional
    public void addDivisionAgreement(Long id, Agreement agreement) {
        universityDivisionDAO.addDivisionAgreement(id, agreement);
    }

    @Override
    @Transactional
    public List<Event> getDivisionEvents(Long id) {
        return universityDivisionDAO.getDivisionEvents(id);
    }

    @Override
    @Transactional
    public void addDivisionEvent(Long id, Event event) {
        universityDivisionDAO.addDivisionEvent(id, event);
    }

    @Override
    @Transactional
    public List<Interaction> getDivisionInteractions(Long id) {
        return universityDivisionDAO.getDivisionInteractions(id);
    }

    @Override
    @Transactional
    public void addDivisionInteraction(Long id, Interaction interaction) {
        universityDivisionDAO.addDivisionIntegration(id, interaction);
    }

    @Override
    @Transactional
    public List<JointStructure> getDivisionJointStructures(Long id) {
        return universityDivisionDAO.getDivisionJointStructures(id);
    }

    @Override
    @Transactional
    public void addDivisionJointStructure(Long id, JointStructure jointStructure) {
        universityDivisionDAO.addDivisionJointStructure(id, jointStructure);
    }


}
