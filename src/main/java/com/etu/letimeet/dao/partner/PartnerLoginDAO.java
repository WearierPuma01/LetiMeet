package com.etu.letimeet.dao.partner;

import com.etu.letimeet.entity.partner.PartnerAccount;

public interface PartnerLoginDAO {
    public PartnerAccount login(String login, String password);
    public void register(String partnerFullName, PartnerAccount partnerAccount);
}
