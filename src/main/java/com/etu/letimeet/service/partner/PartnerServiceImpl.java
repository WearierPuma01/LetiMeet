package com.etu.letimeet.service.partner;

import com.etu.letimeet.dao.partner.PartnerDAO;
import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.entity.partner.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PartnerServiceImpl implements PartnerService{
    @Autowired
    private PartnerDAO partnerDAO;

    @Override
    @Transactional
    public List<Partner> getAllPartners() {
        return partnerDAO.getAllPartners();
    }

    @Override
    @Transactional
    public Partner updatePartner(Partner partner) {
        return partnerDAO.updatePartner(partner);
    }

    @Override
    @Transactional
    public Partner getOnePartnerInfo(Long id) {
        return partnerDAO.getOnePartnerInfo(id);
    }

    @Override
    @Transactional
    public List<Agreement> getPartnerAgreements(Long id) {
        return partnerDAO.getPartnerAgreements(id);
    }

    @Override
    @Transactional
    public void addPartnerAgreement(Long id, Agreement agreement) {
        partnerDAO.addPartnerAgreement(id, agreement);
    }

    @Override
    @Transactional
    public List<Event> getPartnerEvents(Long id) {
        return partnerDAO.getPartnerEvents(id);
    }

    @Override
    @Transactional
    public void addPartnerEvent(Long id, Event event) {
        partnerDAO.addPartnerEvent(id, event);
    }

    @Override
    @Transactional
    public List<Interaction> getPartnerInteractions(Long id) {
        return partnerDAO.getPartnerInteractions(id);
    }

    @Override
    @Transactional
    public void addPartnerInteraction(Long id, Interaction interaction) {
        partnerDAO.addPartnerInteraction(id, interaction);
    }

    @Override
    @Transactional
    public List<JointStructure> getPartnerJointStructures(Long id) {
        return partnerDAO.getPartnerJointStructures(id);
    }

    @Override
    @Transactional
    public void addPartnerJointStructure(Long id, JointStructure jointStructure) {
        partnerDAO.addPartnerJointStructure(id, jointStructure);
    }
}
