package com.etu.letimeet.service.partner;

import com.etu.letimeet.dao.partner.PartnerLoginDAO;
import com.etu.letimeet.entity.partner.PartnerAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PartnerLoginServiceImpl implements PartnerLoginService{
    @Autowired
    private PartnerLoginDAO partnerLoginDAO;

    @Override
    @Transactional
    public PartnerAccount login(String login, String password) {
        return partnerLoginDAO.login(login, password);
    }

    @Override
    @Transactional
    public void register(String partnerFullName, PartnerAccount partnerAccount) {
        partnerLoginDAO.register(partnerFullName, partnerAccount);
    }
}
