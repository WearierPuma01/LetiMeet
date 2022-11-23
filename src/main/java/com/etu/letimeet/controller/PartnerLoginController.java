package com.etu.letimeet.controller;

import com.etu.letimeet.entity.partner.PartnerAccount;
import com.etu.letimeet.service.PartnerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partners")
public class PartnerLoginController {
    @Autowired
    private PartnerLoginService partnerLoginService;

    @GetMapping("/login")
    public PartnerAccount login(@RequestParam String login, @RequestParam String password) {
        return partnerLoginService.login(login, password);
    }
}
