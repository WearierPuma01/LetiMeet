package com.etu.letimeet.service.partner;

import com.etu.letimeet.dao.partner.PartnerDAO;
import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.partner.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PartnerServiceImpl implements PartnerService{
    @Autowired
    private PartnerDAO partnerDAO;

    @Override
    @Transactional
    public List<Partner> getAllPartners() {
        return partnerDAO.getAllPartners();
    }

    @Override
    public Partner updatePartner(Partner partner) {
        return partnerDAO.updatePartner(partner);
    }

    @Override
    public List<Agreement> getPartnerAgreements(Long id) {
        return partnerDAO.getPartnerAgreements(id);
    }

    @Override
    public void addPartnerAgreement(Long id, Agreement agreement) {
        partnerDAO.addPartnerAgreement(id, agreement);
    }


}
