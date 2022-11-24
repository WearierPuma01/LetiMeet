package com.etu.letimeet.dao.references;

import com.etu.letimeet.entity.agreement.references.AgreementStatus;
import com.etu.letimeet.entity.agreement.references.AgreementType;
import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.event.refereces.EventType;
import com.etu.letimeet.entity.interaction.references.InteractionType;
import com.etu.letimeet.entity.joint_structure.references.StructureType;
import com.etu.letimeet.entity.partner.references.PartnerType;
import com.etu.letimeet.entity.university_division.references.Faculty;

import java.util.List;

public interface ReferencesDAO {
    public List<Faculty> getFaculties();
    public List<PartnerType> getPartnerTypes();
    public List<StructureType> getStructureTypes();
    public List<InteractionType> getInteractionTypes();
    public List<EventType> getEventTypes();
    public List<AgreementStatus> getAgreementStatuses();
    public List<AgreementType> getAgreementTypes();
    public List<DirectionOfDev> getDirectionsOfDev();
}
