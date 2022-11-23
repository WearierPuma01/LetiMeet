package com.etu.letimeet.controller;

import com.etu.letimeet.entity.partner.Partner;
import com.etu.letimeet.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
