package com.etu.letimeet.service;

import com.etu.letimeet.entity.partner.PartnerAccount;

public interface PartnerLoginService {
    public PartnerAccount login(String login, String password);
    public void register(String partnerFullName, PartnerAccount partnerAccount);
}
