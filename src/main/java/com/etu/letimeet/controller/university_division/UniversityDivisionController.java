package com.etu.letimeet.controller.university_division;

import com.etu.letimeet.controller.request_bodyes.AgreementRequestBody;
import com.etu.letimeet.controller.request_bodyes.EventRequestBody;
import com.etu.letimeet.controller.request_bodyes.InteractionRequestBody;
import com.etu.letimeet.controller.request_bodyes.JointStructureRequestBody;
import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.entity.university_division.UniversityDivision;
import com.etu.letimeet.service.university_division.UniversityDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityDivisionController {

    @Autowired
    UniversityDivisionService universityDivisionService;

    @GetMapping("/all")
    public List<UniversityDivision> getAllUniversityDivisions() {
        return universityDivisionService.getAllUniversityDivisions();
    }

    @PostMapping("/update")
    public UniversityDivision updateUniversityDivision(@RequestBody UniversityDivision universityDivision) {
        return universityDivisionService.updateUniversityDivision(universityDivision);
    }

    @GetMapping("/getone")
    public UniversityDivision getOneUniversityDivisionInfo(@RequestParam(name = "division_id") Long id) {
        return universityDivisionService.getOneDivisionInfo(id);
    }

    @GetMapping("/agreements")
    public List<Agreement> getDivisionAgreements(@RequestParam("divison_id") Long id) {
        return universityDivisionService.getDivisionAgreements(id);
    }

    @PostMapping("/addAgreement")
    public void addDivisionAgreement(@RequestBody AgreementRequestBody agreementRequestBody) {
        universityDivisionService.addDivisionAgreement(agreementRequestBody.getId(), agreementRequestBody.getAgreement());
    }

    @GetMapping("/events")
    public List<Event> getDivisionEvents(@RequestParam("division_id") Long id) {
        return universityDivisionService.getDivisionEvents(id);
    }

    @PostMapping("/addEvent")
    public void addDivisionEvent(@RequestBody EventRequestBody eventRequestBody) {
        universityDivisionService.addDivisionEvent(eventRequestBody.getId(), eventRequestBody.getEvent());
    }
    @GetMapping("/interactions")
    public List<Interaction> getDivisionInteractions(@RequestParam("division_id") Long id) {
        return universityDivisionService.getDivisionInteractions(id);
    }

    @PostMapping("/addInteraction")
    public void addDivisionInteraction(@RequestBody InteractionRequestBody interactionRequestBody) {
        universityDivisionService.addDivisionInteraction(interactionRequestBody.getId(), interactionRequestBody.getInteraction());
    }

    @GetMapping("/jointStructures")
    public List<JointStructure> getDivisionJointStructures(@RequestParam("division_id") Long id) {
        return universityDivisionService.getDivisionJointStructures(id);
    }

    @PostMapping("/addJointStructure")
    public void addDivisionInteraction(@RequestBody JointStructureRequestBody jointStructureRequestBody) {
        universityDivisionService.addDivisionJointStructure(jointStructureRequestBody.getId(), jointStructureRequestBody.getJointStructure());
    }
}
