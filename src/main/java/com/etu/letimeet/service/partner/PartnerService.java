package com.etu.letimeet.service.partner;

import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.partner.Partner;

import java.util.List;

public interface PartnerService {
    public List<Partner> getAllPartners();

    public Partner updatePartner(Partner partner);

    public List<Agreement> getPartnerAgreements(Long id);

    public void addPartnerAgreement(Long id, Agreement agreement);
}
