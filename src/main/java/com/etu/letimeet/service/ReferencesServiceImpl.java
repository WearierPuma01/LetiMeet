package com.etu.letimeet.service;

import com.etu.letimeet.dao.ReferencesDAO;
import com.etu.letimeet.entity.agreement.references.AgreementStatus;
import com.etu.letimeet.entity.agreement.references.AgreementType;
import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.event.refereces.EventType;
import com.etu.letimeet.entity.interaction.references.InteractionType;
import com.etu.letimeet.entity.joint_structure.references.StructureType;
import com.etu.letimeet.entity.partner.references.PartnerType;
import com.etu.letimeet.entity.university_division.references.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReferencesServiceImpl implements ReferencesService{
    @Autowired
    private ReferencesDAO referencesDAO;

    @Override
    @Transactional
    public List<Faculty> getFaculties() {
        return referencesDAO.getFaculties();
    }

    @Override
    @Transactional
    public List<PartnerType> getPartnerTypes() {
        return referencesDAO.getPartnerTypes();
    }

    @Override
    @Transactional
    public List<StructureType> getStructureTypes() {
        return referencesDAO.getStructureTypes();
    }

    @Override
    @Transactional
    public List<InteractionType> getInteractionTypes() {
        return referencesDAO.getInteractionTypes();
    }

    @Override
    @Transactional
    public List<EventType> getEventTypes() {
        return referencesDAO.getEventTypes();
    }

    @Override
    @Transactional
    public List<AgreementStatus> getAgreementStatuses() {
        return referencesDAO.getAgreementStatuses();
    }

    @Override
    @Transactional
    public List<AgreementType> getAgreementTypes() {
        return referencesDAO.getAgreementTypes();
    }

    @Override
    @Transactional
    public List<DirectionOfDev> getDirectionsOfDev() {
        return referencesDAO.getDirectionsOfDev();
    }
}
