package com.etu.letimeet.controller.references;

import com.etu.letimeet.entity.agreement.references.AgreementStatus;
import com.etu.letimeet.entity.agreement.references.AgreementType;
import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.event.refereces.EventType;
import com.etu.letimeet.entity.interaction.references.InteractionType;
import com.etu.letimeet.entity.joint_structure.references.StructureType;
import com.etu.letimeet.entity.partner.references.PartnerType;
import com.etu.letimeet.entity.university_division.references.Faculty;
import com.etu.letimeet.service.references.ReferencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/references")
public class ReferencesController {
    @Autowired
    private ReferencesService referencesService;

    @GetMapping("/faculties")
    public List<Faculty> getFaculties() {
        return referencesService.getFaculties();
    }

    @GetMapping("/partnerTypes")
    public List<PartnerType> getPartnerTypes() {
        return referencesService.getPartnerTypes();
    }

    @GetMapping("/structureTypes")
    public List<StructureType> getStructureTypes() {
        return referencesService.getStructureTypes();
    }

    @GetMapping("/interactionTypes")
    public List<InteractionType> getInteractionTypes() {
        return referencesService.getInteractionTypes();
    }

    @GetMapping("/eventTypes")
    public List<EventType> getEventTypes() {
        return referencesService.getEventTypes();
    }

    @GetMapping("/agreementStatuses")
    public List<AgreementStatus> getAgreementStatuses() {
        return referencesService.getAgreementStatuses();
    }

    @GetMapping("/agreementTypes")
    public List<AgreementType> getAgreementTypes() {
        return referencesService.getAgreementTypes();
    }

    @GetMapping("/directionsOfDev")
    public List<DirectionOfDev> getDirectionsOfDev() {
        return referencesService.getDirectionsOfDev();
    }
}
