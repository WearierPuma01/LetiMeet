package com.etu.letimeet.service.partner;

import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.entity.partner.Partner;

import java.util.List;

public interface PartnerService {
    public List<Partner> getAllPartners();

    public Partner updatePartner(Partner partner);

    public Partner getOnePartnerInfo(Long id);

    public List<Agreement> getPartnerAgreements(Long id);

    public void addPartnerAgreement(Long id, Agreement agreement);

    public List<Event> getPartnerEvents(Long id);

    public void addPartnerEvent(Long id, Event event);
    public List<Interaction> getPartnerInteractions(Long id);
    public void addPartnerInteraction(Long id, Interaction interaction);
    public List<JointStructure> getPartnerJointStructures(Long id);
    public void addPartnerJointStructure(Long id, JointStructure jointStructure);
}
