package com.etu.letimeet.service.partner;

import com.etu.letimeet.dao.partner.PartnerDAO;
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
}
