package com.etu.letimeet.controller;

import com.etu.letimeet.entity.agreement.references.AgreementStatus;
import com.etu.letimeet.entity.agreement.references.AgreementType;
import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.event.refereces.EventType;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.interaction.references.InteractionType;
import com.etu.letimeet.entity.joint_structure.references.StructureType;
import com.etu.letimeet.entity.partner.references.PartnerType;
import com.etu.letimeet.entity.university_division.references.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/references")
public class ReferencesController {
    @Autowired
    private ReferencesController referencesController;

    @GetMapping("/faculties")
    public List<Faculty> getFaculties() {
        return referencesController.getFaculties();
    }

    @GetMapping("/partnerTypes")
    public List<PartnerType> getPartnerTypes() {
        return referencesController.getPartnerTypes();
    }

    @GetMapping("/structureTypes")
    public List<StructureType> getStructureTypes() {
        return referencesController.getStructureTypes();
    }

    @GetMapping("/interactionTypes")
    public List<InteractionType> getInteractionTypes() {
        return referencesController.getInteractionTypes();
    }

    @GetMapping("/eventTypes")
    public List<EventType> getEventTypes() {
        return referencesController.getEventTypes();
    }

    @GetMapping("/agreementStatuses")
    public List<AgreementStatus> getAgreementStatuses() {
        return referencesController.getAgreementStatuses();
    }

    @GetMapping("/agreementTypes")
    public List<AgreementType> getAgreementTypes() {
        return referencesController.getAgreementTypes();
    }

    @GetMapping("/directionsOfDev")
    public List<DirectionOfDev> getDirectionsOfDev() {
        return referencesController.getDirectionsOfDev();
    }
}
