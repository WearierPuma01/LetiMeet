package com.etu.letimeet.dao.university_division;

import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.entity.university_division.UniversityDivision;

import java.util.List;

public interface UniversityDivisionDAO {
    public List<UniversityDivision> getAllUniversityDivisions();
    public UniversityDivision updateUniversityDivision(UniversityDivision universityDivision);
    public UniversityDivision getOneDivisionInfo(Long id);
    public List<Agreement> getDivisionAgreements(Long id);
    public void addDivisionAgreement(Long id, Agreement agreement);
    public List<Event> getDivisionEvents(Long id);
    public void addDivisionEvent(Long id, Event event);
    public List<Interaction> getDivisionInteractions(Long id);
    public void addDivisionIntegration(Long id, Interaction interaction);
    public List<JointStructure> getDivisionJointStructures(Long id);
    public void addDivisionJointStructure(Long id, JointStructure jointStructure);
}
