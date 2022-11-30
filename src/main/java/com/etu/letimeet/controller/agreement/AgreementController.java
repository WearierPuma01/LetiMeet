package com.etu.letimeet.controller.agreement;

import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.partner.Partner;
import com.etu.letimeet.service.agreement.AgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agreements")
public class AgreementController {
    @Autowired
    private AgreementService agreementService;

    @PostMapping("/updateAgreement")
    public Agreement updatePartner(@RequestBody Agreement agreement) {
        return agreementService.updateAgreement(agreement);
    }
}
