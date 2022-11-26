package com.etu.letimeet.controller.partner;

import com.etu.letimeet.controller.request_bodyes.AgreementRequestBody;
import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.partner.Partner;
import com.etu.letimeet.service.partner.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partners")
public class PartnersController {

    @Autowired
    private PartnerService partnerService;

    @GetMapping("/all")
    public List<Partner> getAllPartners() {
        return partnerService.getAllPartners();
    }

    @PutMapping("/updatePartner")
    public Partner updatePartner(@RequestBody Partner partner) {
        return partnerService.updatePartner(partner);
    }

    @GetMapping("/agreements")
    public List<Agreement> getPartnerAgreements(@RequestParam("partner_id") Long id) {
        return partnerService.getPartnerAgreements(id);
    }

    @PostMapping("/addAgreement")
    public void addPartnerAgreement(@RequestBody AgreementRequestBody agreementRequestBody) {
        partnerService.addPartnerAgreement(agreementRequestBody.getId(), agreementRequestBody.getAgreement());
    }
}
